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
    <th>QUESTIONS</th>
    <th>ANSWER</th>
    </thead>

     <c:forEach items="${allQuestions}" var="questions">
          <tr>
            <td>${questions.id}</td>
             <td>${questions.questions}</td>
              <td>${questions.answer}</td>

          </tr>
        </c:forEach>

 </table>

  <a href="/">Главная</a>
</div>
</body>
</html>