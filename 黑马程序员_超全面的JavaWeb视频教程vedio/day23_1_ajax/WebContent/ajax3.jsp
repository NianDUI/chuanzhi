<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function createXMLHttpRequest() {
		try {
			return new XMLHttpRequest(); // 大多数浏览器
		} catch (e) {
			try {
				return ActvieXObject("Msxml2.XMLHTTP"); // IE6.0
			} catch (e) {
				try {
					return ActvieXObject("Microsoft.XMLHTTP"); //5.5及更早版本
				} catch (e) {
					alert("哥们儿，您用的是什么浏览器啊？");
					throw e;
				}
			}
		}
	}
	window.onload = function() {
		// 获取文本框，给它的是去焦点事件注册监听
		var userEle = document.getElementById("usernameEle");
		userEle.onblur = function() { // onblur失去焦点执行
			// 1.得到异步对象
			var xmlHttp = createXMLHttpRequest();
			// 2.打开链接
			xmlHttp.open("POST", "/day23_1_ajax/ValidateUsernameServlet", true);
			// 3.设置请求头：Content-Type
			xmlHttp.setRequestHeader("Content-Type",
					"application/x-www-form-urlencoded");
			// 4.发送请求,给出请求体
			xmlHttp.send("username=" + userEle.value);
			// 5.给xmlHttp的onreadystatechange事件注册监听
			xmlHttp.onreadystatechange = function() {
				if (xmlHttp.readyState == 4 & xmlHttp.status == 200) { // 双重判断
					// 获取服务器的响应，判断是否为
					// 是：获取span，添加内容：“用户名已被注册”
					var text = xmlHttp.responseText;
					// 得到span元素
					var span = document.getElementById("errorSpan");
					if (text == "1") {
						span.innerHTML = "用户名已被注册!<br>"; // <br>会被执行
						// span.innerText = "用户名已被注册!<br>"; // <br>不会被执行
					} else {
						span.innerHTML = "";
					}

				}
			};
		}
	};
</script>
</head>
<body>
	<h1>演示用户名是否被注册</h1>
	<form action="" method="post">
		用户名：<input type="text" name="username" id="usernameEle" /> <span
			id="errorSpan"></span><br /> 密码：<input type="password"
			name="password" /><br /> <input type="submit" value="注册" />
	</form>
</body>
</html>