<%@page import="com.sharpbook.service.ICategoryService"%>
<%@page import="java.util.List"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page import= "com.sharpbook.dao.Impl.*"%>
<%@ page import= "com.sharpbook.service.Impl.*"%>
<%@ page import= "com.sharpbook.entity.*"%>
<%@ page import= "com.sharpbook.util.*"%>
<% ICategoryService categoryService=new CategoryService();
  	List<Category> categories=categoryService.getAll();
  	BookService bookService = new BookService();
   	List<Book> books = bookService.getAllBook();
   	
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
				<h2>图书信息列表</h2>		
				<table class="table" cellspacing="0" style="font-size: 12px;">
			    	<tr>
			    		<td class="header" width="100">书名</td>
			    		<td class="header" width="60">作者</td>
			    		<td class="header" width="60">类型</td>
			    		<td class="header" width="60">售价</td>
			    		<td class="header" width="60">操作</td>
			    	</tr>
			    <%for(Book book:books){ %>
			    	<tr style="background-color: pink">
			    		<td><%=book.getBTitle() %></td>
			    		<td><%=book.getBAuthor() %></td>
			    		<td><%=book.getBCategoryID().getCName() %></td>
			    		<td>￥<%=book.getBPrice() %></td>
			    		<td><a href="#">删除</a>&nbsp;<a href="book-edit.html">编辑</a></td>
			    	</tr>
			    	
			    	<% }%>
			    	
			    </table>
			</div>
			<div class="section-right">
				<h2>添加图书信息</h2>
				<form action="" method="post">
					<p>图书书名：<input type="text" name="btitle"  /></p>
					<p>图书作者：<input type="text" name="bauthor"  /></p>
					<p>图书分类：
						<select name="btypeid">
							<%for(Category category1:categories){ %>
							<option value="<%=category1.getCID() %>>"><%=category1.getCName() %></option>
							<%} %>
							
						</select>
					</p>
					<p>图书售价：<input type="text" name="bprice"  /></p>
					<p>图书出版社：<input type="text" name="bpublisher"  /></p>   
					<p>图书图片：<input type="file" name="bphoto"  /></p>    				 				
					<p><input type="submit" value=" 保 存 "  /></p>
				</form>
			</div>			
			<div class="cf"></div>
		</div>  	
		<div id="footer"><p>版权所有&copy;博为峰教育</p></div>
	</div>
  </body>
</html>