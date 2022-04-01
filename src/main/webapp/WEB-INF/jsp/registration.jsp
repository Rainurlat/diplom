<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>


<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
  <meta charset="utf-8">
  <title>Регистрация</title>
</head>

<body>
<div class="bform py-5">
<div class="row">
   <div class="container">
       <div class="col-lg-6 align-justify-center pr-4 pl-0 contact-form">
            <div class="">
                 <h2 class="mb-3 font-weight-light">Регистрация</h2>
                         <form:form method="POST" modelAttribute="userForm">


                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-group">
                                         <form:input type="text" class="form-control" path="username" placeholder="Username"
                                              autofocus="true"></form:input>
                                           <form:errors path="username"></form:errors>
                                               ${usernameError}
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-group">
                                          <form:input type="password" class="form-control" path="password" placeholder="Password"></form:input>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="form-group">
                                         <form:input type="password" class="form-control" path="passwordConfirm" placeholder="Confirm your password"></form:input>
                                         <form:errors path="password"></form:errors>
                                          ${passwordError}
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                      <button type="submit" class="btn btn-md btn-block btn-danger-gradiant text-white border-0">Зарегистрироваться</button>
                                 </div>
                            </div>
                         </form:form>

                        <div class="row">
                          <div class="col-lg-12 text-center mt-4">
                              У вас уже есть аккаунт? <a href="/login" class="text-danger">Авторизация</a>
                          </div>
            </div>
       </div>
   </div>
</div>
</body>
</html>