<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE HTML>
<html>
<head>
  <title>Главная</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>
<body>
<div>
  <sec:authorize access="!isAuthenticated()">
    <h3>Чтобы видеть материалы курса, нужно авторизоваться:</h3>
    <h4><a href="/login">Войти</a></h4>
    <h4><a href="/registration">Зарегистрироваться</a></h4>
  </sec:authorize>
  <sec:authorize access="isAuthenticated()">
  <p>Привет, ${pageContext.request.userPrincipal.name}</p>
    <div class="navbar">
        <ul>
             <li><a href="/logout">Выйти</a></li>
             <li> <a href="/news">Тесты</a> </li>
             <li> <a href="/admin">Для преподавателя</a></li>
        </ul>
    </div>

  </sec:authorize>

</div>
</body>
</html>