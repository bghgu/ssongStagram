<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- �������� �ּ�ȭ�� �ֽ� CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- �ΰ����� �׸� -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- �������� �ּ�ȭ�� �ֽ� �ڹٽ�ũ��Ʈ -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
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
					<label for="exampleInputEmail1"> �̸� </label> <input type="name"
						class="form-control" id="name">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> ����� �̸� </label> <input
						type="nickname" class="form-control" id="nickname">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> ������Ʈ </label> <input
						type="website" class="form-control" id="website">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> �Ұ� </label>
					<textarea type="intro" class="form-control" rows="3"></textarea>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1"> �̸��� </label> <input type="email"
						class="form-control" id="email" placeholder="�̸����� �Է��ϼ���">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1"> ��ȭ��ȣ </label> <input type="tel"
						class="form-control" id="tel" placeholder="��ȭ��ȣ">
				</div>
				<div class="checkbox">
					<label> ����� ���� ��õ </label></br> <input type="checkbox"> �ȷο��� ����
					����� ������ ��õ�� �� ȸ������ ������ �����մϴ�.
				</div>
				<button type="submit" class="btn btn-default">����</button>
			</form>
		</div>
	</div>
</body>
</html>