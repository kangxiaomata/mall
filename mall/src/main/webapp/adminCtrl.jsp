<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>个人信息</title>
	<meta name="renderer" content="webkit">	
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">	
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">	
	<meta name="apple-mobile-web-app-status-bar-style" content="black">	
	<meta name="apple-mobile-web-app-capable" content="yes">	
	<meta name="format-detection" content="telephone=no">	
	<link rel="stylesheet" type="text/css" href="/common/layui/css/layui.css" media="all">
	<link rel="stylesheet" type="text/css" href="/common/bootstrap/css/bootstrap.css" media="all">
	<link rel="stylesheet" type="text/css" href="/common/global.css" media="all">
	<link rel="stylesheet" type="text/css" href="/css/personal.css" media="all">
</head>
<body>
<section class="layui-larry-box">
	<div class="larry-personal">
	    <div class="layui-tab">
            <blockquote  class="layui-elem-quote news_search">
		<div class="layui-inline">
		    <div class="layui-input-inline">
		    	<input value="" placeholder="请输入关键字" class="layui-input search_input" type="text">
		    </div>
		    <a class="layui-btn search_btn">查询</a>
		    <shiro:hasPermission name="admin_add">
                <a href="/admin/toAdd" class="layui-btn layui-btn-xs">
					<i class="layui-icon">&#xe608;</i>添加 
				</a>
			</shiro:hasPermission>
		</div>
		
		    <div class="layui-inline">
                <div class="layui-form news_list">
                    <table class="layui-table" id="table1">
					    <colgroup>
						<col width="2%">
						<col width="5%">
						<col width="10%">
						<col width="15%">
						<col width="8%">
						<col width="7%">
						<col width="10%">
					</colgroup>
					<thead>
						<tr >
							<th></th>
							<th style="text-align:left;">操作员ID</th>
							<th>用户名</th>
							<th>密码</th>
							<th>真实姓名</th>
							<th>角色</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody class="news_content">
					<c:forEach items="${admins}" var="admin" >
						<tr id="tr">
						    <td></td>
						    <td>${admin.aid}</td>
						    <td>${admin.username}</td>
						    <td>${admin.password}</td>
						    <td>${admin.realName}</td>
						    <td>${admin.role.roleName}</td>
						    <td>
                          <shiro:hasPermission name="admin_upd">
                          	<a href="/admin/toEdit/${admin.aid}" class="layui-btn layui-btn-xs">
								    <i class="layui-icon">&#xe642;</i>编辑
								</a>
                          </shiro:hasPermission>
                          <shiro:hasPermission name="admin_del">
								<a href="/admin/delete/${admin.aid}" class="layui-btn layui-btn-xs">
								    <i class="layui-icon">&#xe640;</i>删除 
								</a>
					      </shiro:hasPermission>
							</td>
						</tr>
						</c:forEach>
						<tr>
						</tr>
					</tbody>
					</table>					
                    </div>

			    </div>
		    </div>
		</div>
	
</section>
<script type="text/javascript" src="/common/layui/layui.js"></script>
<script type="text/javascript" src="/js/newslist.js"></script>
<script type="text/javascript" src="/js/jquery-3.0.0.js"></script>
</body>
</html>