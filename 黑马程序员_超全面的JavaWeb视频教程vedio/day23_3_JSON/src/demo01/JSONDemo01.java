package demo01;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 演示JSON-LIB小工具
 * @author 1
 *
 */
/*
 * 
 */
public class JSONDemo01 {
	
	
	public static void main(String[] args) {
		/*
		 * 当map来用
		 */
		JSONObject map = new JSONObject();
		map.put("name", "zhangsan");
		map.put("age", 23);
		map.put("sex", "male");
		
		String s = map.toString();
		System.out.println(s);
		
		
		/*
		 * 当你有一个Person对象时，可以吧Person转换成JSONObject对象
		 */
		Person p = new Person("liSi", 32, "female");
		// 把对象转换成JSONObject类型
		JSONObject map2 = JSONObject.fromObject(p); // 参数也可以是Map
		System.out.println(map2.toString());
		
		
		/*
		 * JSONArray
		 */
		Person p1 = new Person("zhangSan", 23, "male");
		Person p2 = new Person("liSi", 32, "female");
		JSONArray list = new JSONArray();
		
		list.add(p1);
		list.add(p2);
		
		System.out.println(list.toString());
		
		
		/*
		 * 原来就有一个List，我们需要把List转换JSONArray
		 */
		List<Person> listP = new ArrayList<Person>();
		listP.add(p1);
		listP.add(p2);
		System.out.println(JSONArray.fromObject(listP).toString());
		

		list.add(listP);
		list.add(listP);
		System.out.println(list.toString());
		
		System.out.println(Integer.MAX_VALUE);
	}

}
