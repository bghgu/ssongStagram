<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
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
				<div class="checkbox">
					<label> 부적절한 댓글 숨기기 </label> </br> 
					<input type="checkbox"> 불쾌한 내용으로 자주 신고되는 단어 또는 문구가 포함된 댓글을 숨깁니다.
				</div>
				<div>
					<label> 맞춤 키워드 </label> </br>
					아래의 단어나 문구가 포함된 댓글은 숨겨집니다. </br>
					<textarea class="form-control" rows="3"></textarea>
				</div>
				<button type="submit" class="btn btn-default">제출</button>
			</form>
		</div>
	</div>
</body>
</html>