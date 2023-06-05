<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Giriş</title>
</head>
<body>
<h1>Giriş Yap</h1>
<form action="login" method="post">
    <label for="username">Kullanıcı Adı:</label>
    <input type="text" id="username" name="username">
    <br>
    <label for="password">Şifre:</label>
    <input type="password" id="password" name="password">
    <br>
    <input type="submit" value="Giriş Yap">
</form>
</body>
</html>
