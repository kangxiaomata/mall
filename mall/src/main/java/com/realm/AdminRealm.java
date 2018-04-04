package com.realm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import com.model.Admin;
import com.service.AdminService;

public class AdminRealm extends AuthorizingRealm{
	
	@Autowired
	private AdminService as;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		 String username =  (String)principals.getPrimaryPrincipal();
		 Admin admin = as.getAdminByName(username);
		 SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		 info.setRoles(as.getRoleNameSet(admin));
		 info.setStringPermissions(as.getPermissionNamesSet(admin));
		 Session session=SecurityUtils.getSubject().getSession();
		 session.setAttribute("user",admin);
		return info;
	}
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken uptoken = (UsernamePasswordToken) token;
		String username = uptoken.getUsername();
		if("unknow".equals(username)){
			throw new UnknownAccountException("用户不存在");
		}
		if("monster".equals(username)){
			throw new LockedAccountException("用户被锁定");
		}
		Admin admin = as.getAdminByName(username);	
		if (admin == null) {
			return null;
		}
		ByteSource salt=ByteSource.Util.bytes(username);
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(username,admin.getPassword(),salt,getName());
		return info;
	}

	public static void main(String[] args){
		String hashAlgorithName="MD5";
		String pass="james";
		Object salt=ByteSource.Util.bytes("lebron");
		int count=1024;
		Object result=new SimpleHash(hashAlgorithName, pass,salt,count);
		System.out.println("result:"+result);
	}
	
}
