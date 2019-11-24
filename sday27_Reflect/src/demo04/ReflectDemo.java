package demo04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("demo01.Person");
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
//		Method[] methods = c.getMethods(); // 本类 和父类所有公共方法
//		Method[] methods = c.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println(method + "---" + method.getName());
//		}
		
		Method showMethod = c.getMethod("show");
		showMethod.invoke(obj);
		
		Method methodMethod = c.getMethod("method", String.class);
		methodMethod.invoke(obj, "Hello");
		
		Method getStringMethod = c.getMethod("getString", String.class, int.class);
		Object objString = getStringMethod.invoke(obj, "World", 2018);
		System.out.println(objString);
		
		Method functionMethod = c.getDeclaredMethod("function");
		functionMethod.setAccessible(true);
		functionMethod.invoke(obj);
	}

}
