<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome</title>
</head>
<body>
<h1 style="-moz-border-left-colors: #123;">ActiveMq test, Welcome!!!</h1>
<h2><a href="producer">去发消息</a></h2>
<h2><a href="receive">从队列中取一个消息</a></h2></br>
<form name="submitMessage" action="/user/login">
    Please enter your UserName：<input name="userName" align="middle" type="text"></br>
    Please enter your Password：<input name="passWord" align="middle" type="text"></br>
    <button type="submit">提交</button>
</form>
</body>
</html>
