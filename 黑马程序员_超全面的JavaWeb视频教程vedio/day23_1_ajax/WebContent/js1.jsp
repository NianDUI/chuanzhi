<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() { // 在文档加载完成后马上执行！
		// 得到btn元素
		var btn = document.getElementById("btn");
		// 给btn的click事件注册监听
		btn.onclick = function() { // 在按钮被点击时执行！
			// 获取h1元素对象的DOM对象
			var h1 = document.getElementById("h1");
			// 给h1添加内容
			h1.innerHTML = "Hello JS!!!";
			h1.innerText = "Hello JS!!!Text";
		};

	};
</script>
</head>
<body>
	<button id="btn">点击这里</button>
	<h1 id="h1"></h1>

</body>
</html>