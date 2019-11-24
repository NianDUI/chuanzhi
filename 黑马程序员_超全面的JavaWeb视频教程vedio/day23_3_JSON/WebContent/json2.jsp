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
		// 获取btn元素
		var btn = document.getElementById("btn");
		btn.onclick = function() { // 给按钮的点击事件添加监听
			// 使用ajax得到服务器的响应，把结果显示到h3中
			// 1.的到XMLHttpRequest
			var xmlHttp = createXMLHttpRequest();
			// 2.打开连接
			xmlHttp.open("GET", "/day23_3_JSON/AServlet", true);
			// xmlHttp.setRequestHeader("Content-Tepy", "application/x-www-form-urlencoded");
			// 3.发送请求
			xmlHttp.send(null);
			// 4.给xmlHttp的状态改变事件上添加监听
			xmlHttp.onreadystatechange = function() {
				// 双重判断
				if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
					var text = xmlHttp.responseText;
					// 执行json串
					var person = eval("(" + text + ")");
					var s = person.name + ", " + person.age + ", " + person.sex;
					document.getElementById("h3").innerHTML = s;
				}
			};
		
		};
		
	};
</script>
</head>
<body>
	<!-- 点击按钮，把服务器相应的数据显示到h3元素中 -->
	<button id="btn">点击这里</button>
	<h1>JSON之Hello World， 从服务器接受JSON字符串客户端执行显示</h1>
	<h3 id="h3"></h3>
</body>
</html>