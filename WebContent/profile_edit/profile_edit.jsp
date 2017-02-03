<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<title>ssongStagram</title>
</head>
<body>
	<div class="row">
		<div class="col-lg-3">
			<ul>
				<a href="profile_edit.jsp"> 프로필 편집 </a>
			</ul>
			<ul>
				<a href="password_change.jsp"> 비밀번호 변경 </a>
			</ul>
			<ul>
				<a href="licensed_app.jsp"> 허가된 앱 </a>
			</ul>
			<ul>
				<a href="manage_comments.jsp"> 댓글 </a>
			</ul>
			<ul>
				<a href="email_sms.jsp"> 이메일 및 SMS </a>
			</ul>
		</div>
		<div class="col-lg-9">
			<form>
				<div class="form-group">
					<label for="exampleInputEmail1"> 이름 </label> <input type="name"
						class="form-control" id="name">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 사용자 이름 </label> <input
						type="nickname" class="form-control" id="nickname">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 웹사이트 </label> <input
						type="website" class="form-control" id="website">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 소개 </label>
					<textarea type="intro" class="form-control" rows="3"></textarea>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> 이메일 </label> <input type="email"
						class="form-control" id="email" placeholder="이메일을 입력하세요">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1"> 전화번호 </label> <input type="tel"
						class="form-control" id="tel" placeholder="전화번호">
				</div>
				<div class="checkbox">
					<label> 비슷한 계정 추천 </label></br> <input type="checkbox"> 팔로우할 만한
					비슷한 계정을 추천할 때 회원님의 계정을 포함합니다.
				</div>
				<button type="submit" class="btn btn-default">제출</button>
			</form>
		</div>
	</div>
</body>
</html>