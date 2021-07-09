<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link  href="/css/header.css" rel="stylesheet">
</head>
<body>
	<div class="navBar">
	<div class="logo">
        <div><img src="images/dekutLogo.png" alt="Dekut Logo"></div>
	    <div class="signature">
            <div id="name">Dedan kimathi University of Technology</div>
	        <div id="motto">Better life through technology</div>
        </div>
    </div>
	<div class="links">
        <a href="index">Home</a>
        <a href="login">Login</a>
        <a href="signup">Signup</a>
    </div>
    <div class="user">
        <div>User: <#if student?? && student?has_content> ${student.name}<#else>Not logged in </#if></div>
    </div>
    </div>
</body>
</html>