<%@page import="com.sharpbook.service.ICategoryService"%>
<%@page import="java.util.List"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page import= "com.sharpbook.dao.Impl.*"%>
<%@ page import= "com.sharpbook.service.Impl.*"%>
<%@ page import= "com.sharpbook.entity.*"%>
<%@ page import= "com.sharpbook.util.*"%>
<% ICategoryService categoryService=new CategoryService();
  	List<Category> categories=categoryService.getAll();

%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>图书网后台管理系统</title>
    <link type="text/css" rel="stylesheet" href="css/mgr.css"/>
  </head>  
  <body>
    <div id="container">
    	<div id="header"><h1>博为峰教育--图书网后台管理系统</h1></div>
    	<div id="info">张三，您好！&nbsp;&nbsp;<a href="admin-user-login.html">登出</a></div>
    	<div class="menu">
    		<ul>
    			<li><a href="admin-home.html">首页</a></li>
    			<li><a href="category-mgr.jsp">图书分类管理</a></li>
    			<li><a href="book-mgr.jsp">图书管理</a></li>
    			<li><a href="order-mgr.html">购书订单管理</a></li>
    		</ul>	
    	</div>
    	<div id="main">
			<div class="section-left">
				<h2>图书分类信息</h2>
				<table class="table" cellspacing="0">
			    	<tr>
			    		<td class="header" width="200">图书分类</td>
			    		<td class="header" width="60">操作</td>
			    	</tr>
			    		    
			    	<% for(Category category:categories){ %>
			    	<tr>
			    		<td><%=category.getCName() %></td>
			    		<td><a href="#">删除</a></td>
			    	</tr>			    
			    	<% }%>		    
			    </table>
			</div>
			<div class="section-right">
				<h2>添加分类信息</h2>
				<form action="" method="post">
					<p>分类名称：<input type="text" name="tname"  /><input type="submit" value=" 保 存 "  /></p>						
			    </form>
			</div>			
			<div class="cf"></div>
		</div>  	
		<div id="footer"><p>版权所有&copy;博为峰教育</p></div>
	</div>
  </body>
</html>