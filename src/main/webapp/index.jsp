<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>管理员登录</title>
    <link rel="stylesheet" href="css/login.css">
</head>

<body>
<!-- 主体 -->
<div class="login-box">
    <h2>Login</h2>
    <form action="/login" method="post">
        <div class="user-box">
            <input id="adname" type="text" name="adname" required="">${errname}
            <label>Username</label>
        </div>
        <div class="user-box">
            <input id="password" type="password" name="password" required="">${errpass}
            <label>Password</label>
        </div>
        <input type="submit" id="btn">
            <span></span>
            <span></span>
            <span></span>
            <span></span>
            Submit
        </a>
    </form>
</div>

</body>

</html>