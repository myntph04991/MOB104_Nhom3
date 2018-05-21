<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>Signup</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/signup.css">
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>

<body>
	<div class="container">
		<div class="row" style="font-size: 30px; margin-left: 100px; text-transform: uppercase; border-bottom: solid 1px #929090">
			Đăng ký
		</div>
		<div class="row" style="margin-top: 10px">
			<div class="col-sm-8" style="border-right: solid 1px #929090">
				<form class="form-horizontal" action="register.htm" style="margin-right: 20px">
					<div class="row" style="text-align: right; margin-bottom: 10px; color: red">Bạn bắt buộc nhập đầy đủ thông tin bên dưới</div>
					<div><a style="color: #f00">${error }</a> </div>
					<div class="form-group">
						<label for="tendangnhap" class="control-label col-sm-4">Tên đăng nhập:</label>
						<div class="col-sm-8">
							<input name="username" type="text" class="form-control" id="tendangnhap">
						</div>
					</div>
					<div class="form-group">
						<label for="matkhau" class="control-label col-sm-4">Mật khẩu:</label>
						<div class="col-sm-8">
							<input name="password" type="password" class="form-control" id="matkhau">
						</div>
					</div>
					<div class="form-group">
						<label for="nlmatkhau" class="control-label col-sm-4">Nhập lại mật khẩu:</label>
						<div class="col-sm-8">
							<input name="repassword" type="password" class="form-control" id="nlmatkhau">
						</div>
					</div>
					<div class="form-group">
						<label for="email" class="control-label col-sm-4">Email:</label>
						<div class="col-sm-8">
							<input name="email" type="email" class="form-control" id="email">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-5 col-sm-7">
							<button type="submit" style="width: 50%; text-transform: uppercase" class="btn btn-primary">Đăng ký</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-sm-4">
				<div class="row" style="margin-left: 10px; margin-bottom: 15px; font-weight: bold; font-size: 16px;">
					Bạn đã có tài khoản?
				</div>
				<div class="row">
					<div class="col-sm-offset-1 col-sm-11">
						<button onclick="window.location='/QuanLyBanHang/signin.htm'" type="button" style="width: 100%; text-transform: uppercase" class="btn btn-danger">Đăng nhập ngay</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
