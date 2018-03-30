package com.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
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

		return null;
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

}
