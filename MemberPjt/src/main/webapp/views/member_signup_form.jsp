<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="./css/index.css" rel="stylesheet" type="text/css">

</head>
<body>

	<header>
		<div class="header_wrap">
			회원 관리 웹프로그램
		</div>
	</header>
	
	<nav>
		<div class="nav_wrap">
			<a href="/MemberPjt/">HOME</a>
			<a href="/MemberPjt/views/member_signup_form.jsp">SIGN-UP</a>
			<a href="/MemberPjt/views/member_signin_form.jsp">SIGN-IN</a>
		</div>
	</nav>
	
	<section>
		<div class="section_wrap">
			
			<div class="article">
			
			<form 
				action="/MemberPjt/member_signup_confirm.dw"
				method="post"
				name="member_signup_form">
			
				<input type="text" name="memId" placeholder="Input new member ID"> <br>
				<input type="password" name="memPw" placeholder="Input new member PW"> <br>
				<input type="email" name="memMail" placeholder="Input new member MAIL"> <br>
				<input type="text" name="memPhone" placeholder="Input new member PHONE"> <br>
				<input type="submit" value="SIGN UP">
				<input type="reset" value="RESET">
				
			</form>
			
			</div>
			
		</div>
	</section>
	
	<footer>
		<div class="footer_wrap">
			OUR OFFICE
		</div>
	</footer>
	
</body>
</html>