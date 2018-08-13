<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Dodrambio.com</title>
	
	<link rel="stylesheet" href="/resources/css/common.css">
	
	<style>
		body {
			background-color: #0d2d4f;
		}
		hr {
			margin: 18px 0;
			border: 0;
			border-top: 1px solid #eee;
		}
		.login-wrap {
			display: table;
			position: relative;
			width: 100%;
			min-height: 100vh;
		}
		.login-wrap:before {
			position: absolute;
			bottom: 40px;
			left: 50%;
			color: #eee;
			transform: translateX(-50%);
			font-size: 14px;
			content: "CopyrightⓒDodrambio.com All Right Reserved."; 
		}
		.login-container {
			display: table-cell;
			text-align: center;
			vertical-align: middle;
		}
		.cover-container {
			width: 700px;
			margin: 0 auto;
			color: #fff;
		}
		.cover-top {
			font-weight: 700;
			font-size: 28px;
		}
		.cover-mid {
			padding: 0 14px;
			font-size: 20px;
			line-height: 28px;
		}
		.cover-bottom {
			width: 400px;
			margin: 0 auto;
		}
		.cover-bottom input {
			display: block;
			width: 100%;
			margin: 0 auto;
			border-radius: 6px;
		}
		.cover-bottom input[type=text], .cover-bottom input[type=password] {
			height: 36px;
			padding: 6px 12px;
			margin: 14px auto;
			font-size: 14px;
			color: #555;
			background-color: #fff;
			border: 1px solid #ccc;
			box-sizing: border-box;
		}
		.cover-bottom input[type=submit] {
			padding: 10px 20px;
			font-weight: 700;
			font-size: 20px;
			color: #fff;
			background-color: #d9534f;
			border: 0;
			cursor: pointer;
		}
	</style>
</head>
	
<body>
	<div class="login-wrap">
		<div class="login-container">
			<div class="cover-container">
				<div class="cover-top">
					Dodrambio and Hebrontech.
				</div>
				<hr>
				<div class="cover-mid">
					This site is an important asset for Dodrambio.com and is accessible only to authorized users.
					Illegal access to the site will result in legal penalties.
				</div>
				<hr>
				<div class="cover-bottom">
					<form action="/loginCheck" method="post">
						<input type="text" name="id" placeholder="ID">
						<input type="password" name="password" placeholder="Password">
						<input type="submit" value="login">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>