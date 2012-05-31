<%@ page language="java" pageEncoding="UTF-8" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<div id="header" class="span-24 last">
	<div id="title">
		<div class="title">Mini-Web示例</div>
		<div>
		<span class="subtitle"> </span>		 
		</div>
	</div>
	<div id="menu">
		<ul>			 
			<li><a href="${ctx}/account/user/">我要预订</a></li>
			<li><a href="${ctx}/account/group/">我的课程</a></li>
			<li><a href="${ctx}/logout">我的交易</a></li>
			<li><a href="${ctx}/login">老师介绍</a></li>
			<li><a href="${ctx}/login">个人资料</a></li>
		</ul>
		
	</div>
</div>