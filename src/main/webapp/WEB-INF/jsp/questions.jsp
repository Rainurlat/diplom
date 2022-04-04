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
              <td> <input type="radio">${questions.answer1}</input>
              <input type="radio">${questions.answer2}</input>
               <input type="radio">${questions.answer3}</input>
               <input type="radio">${questions.answer4}</input></td>




          </tr>
        </c:forEach>

 </table>

  <a href="/">Главная</a>
</div>
</body>
</html>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script>
 this.checkAnswer = function(option) {


                        if(option ==  quiz.JS[0][this.currentque].answer) {
                            if(quiz.JS[0][this.currentque].score == "") {
                                quiz.JS[0][this.currentque].score = 1;
                                quiz.JS[0][this.currentque].status = "correct";
                            }
                        } else {
                            quiz.JS[0][this.currentque].status = "wrong";
                        }
                        quiz.JS[0][this.currentque].selected = option;
                    }

</script>