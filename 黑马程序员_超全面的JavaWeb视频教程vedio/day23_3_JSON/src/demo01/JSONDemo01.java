package demo01;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * ��ʾJSON-LIBС����
 * @author 1
 *
 */
/*
 * 
 */
public class JSONDemo01 {
	
	
	public static void main(String[] args) {
		/*
		 * ��map����
		 */
		JSONObject map = new JSONObject();
		map.put("name", "zhangsan");
		map.put("age", 23);
		map.put("sex", "male");
		
		String s = map.toString();
		System.out.println(s);
		
		
		/*
		 * ������һ��Person����ʱ�����԰�Personת����JSONObject����
		 */
		Person p = new Person("liSi", 32, "female");
		// �Ѷ���ת����JSONObject����
		JSONObject map2 = JSONObject.fromObject(p); // ����Ҳ������Map
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
		 * ԭ������һ��List��������Ҫ��Listת��JSONArray
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
