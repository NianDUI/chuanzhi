// 创建XMLHttpRequest对象
function createXMLHttpRequest() {
	try {
		return new XMLHttpRequest(); // 大多数浏览器
	} catch (e) {
		try {
			return ActvieXObject("Msxml2.XMLHTTP"); // IE6.0
		} catch (e) {
			try {
				return ActvieXObject("Microsoft.XMLHTTP"); // 5.5及更早版本
			} catch (e) {
				alert("哥们儿，您用的是什么浏览器啊？");
				throw e;
			}
		}
	}
}

/*
 * option对象有如下属性 
 */                  
/* 请求方式 method,
 请求的url url,
 是否异步  asyn,
 请求体  params,
 回调方法  callback,
 服务器响应数据转换成什么类型  type
/*
 * 请求方式 method,默认为GET
 * 请求的url url,
 * 是否异步  asyn,默认为true
 * 请求体  params,可以不写
 * 回调方法  callback,
 * 服务器响应数据转换成什么类型  type,
 */
function ajax(option) {
	/*
	 * 1.得到xmlHttp
	 */
	var xmlHttp = createXMLHttpRequest();
	/*
	 * 2.打开连接
	 */
	if (!option.method) { // 默认为GET请求
		option.method = "GET";
	}
	if (option.asyn == undefined) { // 默认为true
		option.asyn = true;
	}
	xmlHttp.open(option.method, option.url, option.asyn);
	/*
	 * 3.判断是否为POST
	 */
	if ("POST" == option.method || "post" == option.method) {
		xmlHttp.setRequestHeader("Content-Type",
				"application/x-www-from-urlencoded");
	}
	/*
	 * 4.发送请求
	 */
//	if (!option.params) {
//		option.params = "null";
//	}
	xmlHttp.send(option.params);
	/*
	 * 5.注册监听
	 */
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
			// 获取服务器的响应数据，进行转换
			var data;
			if (!option.type) { // 若果type没有赋值，那么默认为文本
				data = xmlHttp.responseText;
			} else if (option.type == "xml") {
				data = xmlHttp.responseXML;
			} else if (option.type == "text") {
				data = xmlHttp.responseText;
			} else if (option.type == "json") {
				var text = xmlHttp.responseText;
				data = eval("(" + text + ")");
			}

			// 调用回调方法
			option.callback(data);
		}
	};
}