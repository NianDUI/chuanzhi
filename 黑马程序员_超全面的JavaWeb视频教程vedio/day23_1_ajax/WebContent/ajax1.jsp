<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
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

	window.onload = function() { // 文档加载完毕后执行
		var btn = document.getElementById("btn");
		btn.onclick = function() { // 给按钮的点击事件注册监听
			/*
				ajax四步操作，得到服务器的响应
				把响应结果显示到h1元素中
			 */
			// 1 得到异步对象
			var xmlHttp = createXMLHttpRequest();
			// 2 打开与服务器的链接
			/*
			 * 指定请求方式
			 * 指定请求的URL
			 * 指定是否为异步请求
			 */
			//	服务器发送过来的时候(服务器处理jsp页面时)<c:url value='/AServlet' />就变成了/day23_1_ajax/AServlet
			// xmlHttp.open("GET", "<c:url value='/AServlet' />", true);
			xmlHttp.open("GET", "/day23_1_ajax/AServlet", true);
			// 3 发送请求
			xmlHttp.send(null); // GET请求没有请求体，但也要给出null，不然浏览器可能会不能发送！
			// 4 给异步对象的onreadystatechange事件注册监听器
			xmlHttp.onreadystatechange = function() { // 当xmlHttp的状态发生变化时执行
				// 双重判断：xmlHttp的状态为4(服务器响应结束)，以及服务器响应的状态码为200(响应成功)
				if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
					var text = xmlHttp.responseText;// responseXML响应的为XML
					// 获取h1元素
					var h1 = document.getElementById("h1");
					h1.innerHTML = text;
				}
			};
		};
	};
</script>
</head>
<body>
	<button id="btn">点击这里</button>
	<h1>AJAX!GET请求</h1>
	<h1 id="h1"></h1>

</body>
</html>