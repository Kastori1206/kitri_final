<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 3 | Log in</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="resources/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="resources/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="resources/dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
  
	<!-- jQuery -->
	<script src="resources/plugins/jquery/jquery.min.js"></script>
  <script>
  	$(document).ready(function(){
  		$("#btnLogin").click(function(){
  			var userId = $("#userId").val();
  			var userPw = $("#userPw").val();
  			if(userId ==""){
  				alert("아이디를 입력하세요.");
  				$("#userId").focus();
  				return false;
  			}
  			if(userPw ==""){
  				alert("비밀번호를 입력하세요.");
  				$("#userPw").focus();
  				return false;  				
  			}
  			
  			document.loginform.action="/pms/loginCheck";
  			document.loginform.submit();
  		});
  	});
  </script>
</head>
<body class="login-page" style="min-height: 512.391px;">
<div class="login-box">
  <div class="login-logo">
    <a href="resources/index2.html"><b>Kitri</b>PMS</a>
  </div>
  <!-- /.login-logo -->
  <div class="card">
    <div class="card-body login-card-body">
      <p class="login-box-msg">로그인</p>

      <form name="loginform" method="post">
        <div class="input-group mb-3">
          <input type="test" class="form-control" id="userId" name="m_id" placeholder="아이디">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" class="form-control" id="userPw" name="m_pw" placeholder="패스워드">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-8">
            <div class="icheck-primary">
              <input type="checkbox" id="remember">
              <label for="remember">
                아이디 기억하기
              </label>
            </div>
          </div>
          <!-- /.col -->
          <div class="col-4">
            <button type="submit" class="btn btn-primary btn-block btn-flat" id="btnLogin">로그인</button>                     
            <c:if test=" ${msg == 'failure' }">
            	
            </c:if>
          </div>
          <!-- /.col -->
        </div>
      </form>

     <!--  <div class="social-auth-links text-center mb-3">
        <p>- OR -</p>
        <a href="#" class="btn btn-block btn-primary">
          <i class="fab fa-facebook mr-2"></i> Facebook으로 로그인
        </a>
        <a href="#" class="btn btn-block btn-danger">
          <i class="fab fa-google-plus mr-2"></i> Google+으로 로그인
        </a>
      </div>
      /.social-auth-links -->

      <p class="mb-1">
        <a href="#">비밀번호 찾기</a>
      </p>
      <p class="mb-0">
        <a href="/pms/register" class="text-center">회원가입</a>
      </p>
    </div>
    <!-- /.login-card-body -->
  </div>
</div>
<!-- /.login-box -->

<!-- Bootstrap 4 -->
<script src="resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="resources/dist/js/adminlte.min.js"></script>



</body>
</html>