<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/shop_receive/listAll" method="post">
  <div class="col-xs-3">
    <input type="text" class="form-control" placeholder="请输入用户姓名" name="receive_name">
  </div>
  <button class="btn btn-default" type="submit">查询</button>
	<table class="table table-bordered">
     <tr>
     <td>收货人姓名</td>
     <td>收货人电话</td>
     <td>收货人地址</td>
     <td>操作</td>
     </tr>
     <c:forEach items="${shop_receives }" var="s">
			<tr>
				<td>${s.receive_name }</td>
				<td>${s.receive_phone }</td>
				<td>${s.receive_address}</td>
				<td><a href=""><button class="btn btn-default" type="text">修改</button></a>
				<a href=""><button class="btn btn-default" type="text">删除</button></a>
				<a href=""><button class="btn btn-default" type="text">设为首选地址</button></a></td>
			</tr>
		</c:forEach>
		<tr>
		<td align="center" colspan="9">一共${page.pages}页 <a
		href="/shop_receive/listAll?page=${page.firstPage}">第一页</a> <a
		href="/shop_receive/listAll?page=${page.prePage}">上一页</a> <a
		href="/shop_receive/listAll?page=${page.nextPage}">下一页</a> <a
		href="/shop_receive/listAll?page=${page.lastPage}">最后页</a></td>
		</tr>
		
	</table>
	</form>
</body>
</html>