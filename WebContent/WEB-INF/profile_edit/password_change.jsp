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
				<a href="profile_edit.jsp"> ������ ���� </a>
			</ul>
			<ul>
				<a href="password_change.jsp"> ��й�ȣ ���� </a>
			</ul>
			<ul>
				<a href="licensed_app.jsp"> �㰡�� �� </a>
			</ul>
			<ul>
				<a href="manage_comments.jsp"> ��� </a>
			</ul>
			<ul>
				<a href="email_sms.jsp"> �̸��� �� SMS </a>
			</ul>
		</div>
		<div class="col-lg-9">
			<form>
				<div class="form-group">
					<label for="oldPassword"> ���� ��й�ȣ </label> <input type="password"
						class="form-control" id="oldPassword">
				</div>
				<div class="form-group">
					<label for="newPassword"> �� ��й�ȣ </label> <input type="password"
						class="form-control" id="newPassword">
				</div>
				<div class="form-group">
					<label for="newPasswordConfirm"> �� ��й�ȣ Ȯ�� </label> <input
						type="password" class="form-control" id="newPasswordConfirm">
				</div>
				<button type="submit" class="btn btn-default">��й�ȣ ����</button>
			</form>
		</div>
	</div>
</body>
</html>