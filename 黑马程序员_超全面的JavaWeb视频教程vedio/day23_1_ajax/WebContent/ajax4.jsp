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
			xmlHttp.open("GET", "/day23_1_ajax/BServlet", true);
			// 3 发送请求
			xmlHttp.send(null); // GET请求没有请求体，但也要给出null，不然浏览器可能会不能发送！
			// 4 给异步对象的onreadystatechange事件注册监听器
			xmlHttp.onreadystatechange = function() { // 当xmlHttp的状态发生变化时执行
				// 双重判断：xmlHttp的状态为4(服务器响应结束)，以及服务器响应的状态码为200(响应成功)
				if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
					// 获取服务器响应结果
					var doc = xmlHttp.responseXML;// responseXML响应的为XML
					// 查询文档下名为student的所有元素，得到数组，再取下标0元素
					var eleArr = doc.getElementsByTagName("student");
					var ele = eleArr[0]; // 因为只有一个
					var number = ele.getAttribute("number"); // 元素ele的number属性值
				/* 	var name = ele.getElementsByTagName("name")[0].text; // IE支持
					var age = ele.getElementsByTagName("age")[0].text; // IE支持
					var sex = ele.getElementsByTagName("sex")[0].textContent; // 其他支持 */
					var name,age,sex;
					
					// 处理浏览器差异
					if (window.addEventListener) { // 存在则是其他浏览器
						name = ele.getElementsByTagName("name")[0].textContent;
						age = ele.getElementsByTagName("age")[0].textContent;
						sex = ele.getElementsByTagName("sex")[0].textContent;
					} else { // 不存在则是IE浏览器
						name = ele.getElementsByTagName("name")[0].text;
						age = ele.getElementsByTagName("age")[0].text;
						sex = ele.getElementsByTagName("sex")[0].text; 
					}
					
					var text = number + ", " + name + ", " + age + ", " + sex;
					document.getElementById("h1").innerHTML = text;
				}
			};
		};
	};
</script>
</head>
<body>
	<button id="btn">点击这里</button>
	<h1>相应内容为XML数据！</h1>
	<h1 id="h1"></h1>

</body>
</html>