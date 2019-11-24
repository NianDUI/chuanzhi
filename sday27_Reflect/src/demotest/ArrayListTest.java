package demotest;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add("Hello");
		list.add(10);
		
		Class c = list.getClass();
		Method addMethod = c.getDeclaredMethod("add", Object.class);
		addMethod.invoke(list, "Hello");
		addMethod.invoke(list, "Workd");
		addMethod.invoke(list, "Java");
		addMethod.invoke(list, new ArrayListTest());
		addMethod.invoke(list, new ArrayListTest());
		addMethod.invoke(list, Class.forName("demo01.Person").getConstructor().newInstance());
		addMethod.invoke(list, Class.forName("demo01.Person").getConstructor().newInstance());
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
