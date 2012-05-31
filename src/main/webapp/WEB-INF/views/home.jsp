<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>帐号管理</title>
	<script>
	 $(document).ready(function() {
		$("#message").fadeOut(3000);
	});
	</script>
</head>

<body>
	<h4 class="prepend-top">我的预订历史</h4>
	<c:if test="${not empty message}">
		<div id="message" class="success">${message}</div>	
	</c:if>
	
	<table id="contentTable">
		<tr><th>课程类型</th><th>授课老师</th><th>课程名称</th><th>课程时间<th>是否如约</th></tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.loginName}</td>
				<td>${user.name}</td>
				<td>${user.email}</td>
				<td>${user.groupNames}</td>
				<td>
					<shiro:hasPermission name="user:edit">
	    				<a href="update/${user.id}" id="editLink-${user.name}">修改</a> <a href="delete/${user.id}">删除</a>
					</shiro:hasPermission>
				</td>
			</tr>
		</c:forEach>
	</table>
 
		<a href="create">创建用户</a>
 
</body>
</html>
