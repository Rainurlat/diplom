<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Log in with your account</title>
  <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>

<body>
<div>
<table>
    <thead>
    <th>ID</th>
    <th>Theory</th>



    </thead>

     <c:forEach items="${allTheory}" var="theory">
          <tr>
            <td>${questions.id}</td>
             <td>${questions.theory}</td>






          </tr>
        </c:forEach>

 </table>

  <a href="/">Главная</a>
</div>
</body>
</html>