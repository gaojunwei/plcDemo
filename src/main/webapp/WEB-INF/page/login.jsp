<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
    request.setCharacterEncoding("utf-8");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <base href="<%=basePath%>" />
    <title>欢迎登录妖道角-登录页面</title>
</head>
<body>
    <form action="index/login_login" method="post">
        <p>账户：<input type="text" name="username"></p>
        <p>密码：<input type="text" name="password"></p>
        <input type="submit" value="登录">
    </form>
</body>
</html>