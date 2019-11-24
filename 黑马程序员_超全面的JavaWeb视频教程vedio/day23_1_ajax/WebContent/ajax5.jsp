<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	/*	所有任务
		1.在文档加载完毕时发送请求，得到所有省份名称，显示在<select name="provice"/>中
		2.选择了新的省份时，发送请求（参数为省名称），得到xml文档，即<provice>元素
			解析xml文档，得到其中所有的<city>,在得到每个<city>元素的内容，即市名，使用市名生成<option>,插入到<select name="provice"/>元素中
	 */
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
		/*
			ajax四步，请求ProvinceServlet，得到所有省份名称
			使用每个省份名称创建一个<option>元素，添加到<select name="province">中
		*/
		var xmlHttp = createXMLHttpRequest();
		xmlHttp.open("GET", "/day23_1_ajax/ProvinceServlet", true);
		xmlHttp.send(null);
		xmlHttp.onreadystatechange = function() {
			if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
				// 获取服务器的响应
				var text = xmlHttp.responseText;
				// 使用逗号分隔，的到数组
				var arr = text.split(",");
				// 循环遍历每个省份名称，每个名称生成一个option对象，添加到<select>中
				for (var i = 0; i < arr.length; i++) {
					var op = document.createElement("option"); // 创建一个指定名称的元素
					op.value = arr[i]; // 设置op的实际值为当前的省份名称
					var textNode = document.createTextNode(arr[i]); // 创建文本节点
					op.appendChild(textNode); // 把文本子节点添加到op元素中，指定其显示值 
					
					document.getElementById("p").appendChild(op);
				}
			}
		};
		
		/*
			第二件事：给<select name="province">添加改变监听
			使用选择的省份名称请求CityServlet，得到<province>元素（xml元素）！！！
			获取<provice>元素中所有的<city>元素，遍历之！获取每个<city>的文本内容，即市名称
			使用每个市名称创建<option>元素添加到<select name="city">
		*/
		var proSelect = document.getElementById("p");
		proSelect.onchange = function() {
			var xmlHttp = createXMLHttpRequest();
			xmlHttp.open("POST", "/day23_1_ajax/CityServlet", true);
			xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
			xmlHttp.send("pname=" + proSelect.value); // 把下拉列表中选择的值发送给服务器!
			xmlHttp.onreadystatechange = function() {
				if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
					/*
						把select中的所有option元素移除(除了请选择)
					*/
					var citySelect = document.getElementById("c");
					// 获取其所有子元素
					var optionEleList = citySelect.getElementsByTagName("option");
					// 循环遍历每个option元素，然后在citySelect中移除
					while(optionEleList.length > 1) { // 子元素的个数如果大于1就循环，等于1就不循环了！
						citySelect.removeChild(optionEleList[1]); // 总是删除1下标，因为1删除了，2就变成1了！
					}
					
					// 获取服务器的响应
					var doc = xmlHttp.responseXML;
					// 得到所有名为city的元素
					var cityEleList = doc.getElementsByTagName("city");
					// 循环遍历每个city元素
					for (var i = 0; i < cityEleList.length; i++) {
						var cityEle = cityEleList[i]; // 得到每个city元素
						var cityName;
						if (window.addEventListener) { // 处理浏览器的差异
							cityName = cityEle.textContent; // 支持其他浏览器
						} else {
							cityName = cityEle.text; // 支持IE
						}
						
						// 使用市名称创建option元素，添加到<select name="ctiy">中
						var op = document.createElement("option"); // 创建一个指定名称的元素
						op.value = cityName; // 设置op的实际值为当前的省份名称
						var textNode = document.createTextNode(cityName); // 创建文本节点
						op.appendChild(textNode); // 把文本子节点添加到op元素中，指定其显示值 
						
						// 把op添加到<select>元素中
						citySelect.appendChild(op);
					}
				}
			};
		};
		
	};
</script>
</head>
<body>
	<h1>省市联动示例</h1>
	<select name="province" id="p">
		<option>===请选择省===</option>
	</select> &nbsp;&nbsp;
	<select name="city" id="c">
		<option>===请选择市===</option>
	</select>

</body>
</html>