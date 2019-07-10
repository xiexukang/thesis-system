<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>获取密码页面</title>
</head>
<body>
<div style="font-size:14px;color:red;">你的密码是:${requestScope.password }</div>
</body>
<script type="text/javascript">
		alert('${requestScope.password }');
</script>
<script type="text/javascript" src="../js/jquery-3.2.1.min.js" ></script>
	<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js" ></script>
</html>