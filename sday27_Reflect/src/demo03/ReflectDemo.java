package demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("demo01.Person");
//		Field[] fields = c.getFields();
//		Field[] fields = c.getDeclaredFields();
//		for (Field field : fields) {
//			System.out.println(field + "---" + field.getName());
//		}
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		Field f1 = c.getField("address");
		f1.set(obj, "北京");
		System.out.println(obj);
		
		Field f2 = c.getDeclaredField("name");
		f2.setAccessible(true);
		f2.set(obj, "林青霞");
		System.out.println(obj);
		
		Field f3 = c.getDeclaredField("age");
		f3.setAccessible(true);
		f3.set(obj, 27);
		System.out.println(obj);
		
		
		
		
	}

}
