<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登录页</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />

<link href="${ctx}/static/blueprint/1.0.1/screen-customized.css" type="text/css" rel="stylesheet" media="screen, projection" />
<link href="${ctx}/static/blueprint/1.0.1/print.css" type="text/css" rel="stylesheet" media="print" />
<!--[if lt IE 8]><link href="${ctx}/static/blueprint/1.0.1/ie.css" type="text/css" rel="stylesheet" media="screen, projection"><![endif]-->
<link href="${ctx}/static/mini-web.css" type="text/css" rel="stylesheet" />

<script src="${ctx}/static/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script src="${ctx}/static/jquery-validation/1.9.0/jquery.validate.min.js" type="text/javascript"></script>
<script src="${ctx}/static/jquery-validation/1.9.0/messages_cn.js" type="text/javascript"></script>
<link href="${ctx}/static/jquery-validation/1.9.0/validate.css" type="text/css" rel="stylesheet" />

</head>

<body> 
<div class="container">
<div id="header" class="span-24 last">
	<div id="title">
		<div class="title">Mini-Web示例</div>
		<div>
		<span class="subtitle"> </span>		 
		</div>
	</div>
	<div id="menu">
		<ul>			 
 
			
		</ul>
		
	</div>
</div>


	<form:form id="loginForm"  action="${ctx}/login" method="post">
		<fieldset class="prepend-top">
			<legend>登录</legend>
			<div>
				<label for="username" class="field">名称:</label>
				<input type="text" id="username" name="username" size="25" value="${username}" class="required"/>
			</div>
			<div>
				<label for="password" class="field">密码:</label>
				<input type="password" id="password" name="password" size="25"  class="required"/>
			</div>
		</fieldset>
		<div>
			<input type="checkbox" id="rememberMe" name="rememberMe"/> <label for="rememberMe">记住我</label>
			<span style="padding-left:10px;"><input id="submit" class="button" type="submit" value="登录"/></span>
		</div>
			 
	</form:form>
	
	
	<div id="footer" class="span-24 last">
	Copyright &copy; 2012 <a href="http://#">#</a>
</div>
	
	
</div>

</body>
</html>
