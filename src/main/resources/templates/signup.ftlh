<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Signup</title>
    <link rel="stylesheet" type="text/css" href="css/signup.css">
</head>
<body>
    <#include "/headerMacro.ftlh">
    <form action="signup" method="POST" class="signupForm">
    <div><input type="text" name="regNo" placeholder="Reg NO"></div>	
    <div><input type="text" name="name" placeholder="Name"></div>
    <div><input type="text" name="course" placeholder="Course"></div>
    <div><input type="password" name="password" placeholder="Password"></div>
    <div><input type="submit" value="Signup"></div>
    </form>
</body>
</html>