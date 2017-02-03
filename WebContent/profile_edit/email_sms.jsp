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
					<label> <input type="checkbox" id="blankCheckbox"
						value="option1" aria-label="..."> 뉴스 이메일 새 제품 소식을 가장 먼저 받아보세요.
					</label>
				</div>
				<div class="checkbox">
					<label> <input type="checkbox" id="blankCheckbox"
						value="option1" aria-label="..."> 알림 이메일 유용한 최신 정보를 빠짐없이 받아보세요.
					</label>
				</div>
				<div class="checkbox">
					<label> <input type="checkbox" id="blankCheckbox"
						value="option1" aria-label="..."> 제품 이메일 Instagram 도구 사용에 대한 팁을 확인해보세요.
					</label>
				</div>
				<div class="checkbox">
					<label> <input type="checkbox" id="blankCheckbox"
						value="option1" aria-label="..."> 조사 연구 이메일 의견을 보내 조사 연구에 참여하세요.
					</label>
				</div>
				<div class="checkbox">
					<label> <input type="checkbox" id="blankCheckbox"
						value="option1" aria-label="..."> SMS 메시지 문자 메시지로 알림이 전송됩니다.
					</label>
				</div>
			</form>
		</div>
	</div>
</body>
</html>