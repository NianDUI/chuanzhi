<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		/* var person = {
				"name" : "zhangsan",
				"age" : 18,
				"sex" : "male"
		}; */
		
		/* var str = '{"name" : "zhangsan","age" : 18,"sex" : "male"}';
		var str2 = "{\"name\" : \"zhangsan\",\"age\" : 18,\"sex\" : \"male\"}";
		var person = eval("(" + str + ")"); // 加括号后js就会将括号内的字符串当代码执行
		alert(person.name + ", " + person.age + ", " + person.sex);
		console.log(person); */
		
		var str = "1 + 2";
		var sum = eval("(" + str + ")")
		alert(sum);
		
	};
</script>
</head>
<body>
	<h1>JSON的应用</h1>
</body>
</html>