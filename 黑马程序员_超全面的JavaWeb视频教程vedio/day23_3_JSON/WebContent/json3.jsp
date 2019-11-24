<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="ajax-lib/ajaxutils.js" ></script>
<script type="text/javascript">
	window.onload = function() {
		var btn = document.getElementById("btn");
		btn.onclick = function() {
			/*
			1.ajax
			*/
			ajax({
				//url:"/day23_3_JSON/AServlet",
				url:"${pageContext.request.contextPath}/AServlet",  // 可已被转换成/day23_3_JSON/AServlet
				type:"json",
				callback:function(data) {
					document.getElementById("h3").innerHTML = data.name + ", " + data.age + ", " + data.sex;
				}
			});
		};
	}
</script>
</head>
<body>
	<!-- 点击按钮，把服务器相应的数据显示到h3元素中 -->
	<h1>演示自己封装（AJAX）的小工具</h1>
	<button id="btn">点击这里</button>
	<h3 id="h3"></h3>
</body>
</html>