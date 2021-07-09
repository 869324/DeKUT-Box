<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>DekutBox|Login</title>
    <link  href="/css/login.css" rel="stylesheet">
</head>
<body>
	<#include "/headerMacro.ftlh">
    <form action="login" method="POST" class="form">
        <div><#if loginError?? && loginError?has_content> ${loginError} </#if></div>
        <div><input type="text" name="regNo" placeholder="Reg NO"></div>
        <div><input type="password" name="password" placeholder="password"></div>
        <div><input type="submit" name="login" id="btnLogin"></div>
    </form>

</body>
</html>