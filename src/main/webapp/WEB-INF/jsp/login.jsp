<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
  <title>Log in with your account</title>
</head>

<body>
<sec:authorize access="isAuthenticated()">
  <% response.sendRedirect("/"); %>
</sec:authorize>
<div class="bform py-5">
    <!-- Row -->
    <div class="row">
        <div class="container">
            <div class="col-lg-6 align-justify-center pr-4 pl-0 contact-form">
                <div class="">
                    <h2 class="mb-3 font-weight-light">Авторизация</h2>
                          <form method="POST" action="/login">
                            <div class="row">
                                  <div class="col-lg-12">
                                      <div class="form-group">
                                             <input name="username"  class="form-control" type="text" placeholder="Username"
                                              autofocus="true"/>
                                      </div>
                                  </div>
                                  <div class="col-lg-6">
                                       <div class="form-group">
                                             <input name="password"  class="form-control" type="password" placeholder="Password"/>
                                       </div>
                                  </div>
                                   <div class="col-lg-12">
                                      <button type="submit" class="btn btn-md btn-block btn-danger-gradiant text-white border-0">Войти</button>
                                   </div>
                            </div>
                          </form>
                          <div class="row">
                              <div class="col-lg-12 text-center mt-4">
                                  <p>Если у вас нет аккаунта — <a href="/registration" class="text-danger">Зарегистрироваться</a></p>
                              </div>
                          </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
