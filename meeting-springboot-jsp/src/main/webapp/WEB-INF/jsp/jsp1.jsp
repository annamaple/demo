<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>JSP1</title>
</head>
<body>
Hello World!<br/>
<%
    out.println("你的 IP 地址 " + request.getRemoteAddr());
%>

<h1>Hello,${name} , ${age} year old</h1>
</body>
</html>