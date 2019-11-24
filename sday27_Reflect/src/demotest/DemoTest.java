package demotest;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class DemoTest {

	public static void main(String[] args) throws Exception {
//		Student student = new Student();
//		student.love();
//		Teacher teacher = new Teacher();
//		teacher.love();
//		Worker worker = new Worker();
//		worker.love();
		
		// Properties 类表示了一个持久的属性集。
		// Properties 可保存在流中或从流中加载。
		// 属性列表中每个键及其对应值都是一个字符串。
		Properties prop = new Properties();
		FileReader fr = new FileReader("testClass.text");
		prop.load(fr);
		fr.close();
		
		String ClassName = prop.getProperty("ClassName");
		String MethodName = prop.getProperty("MethodName");
		
		Class c = Class.forName(ClassName);
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		Method method = c.getDeclaredMethod(MethodName);
		method.setAccessible(true);
		method.invoke(obj);
		
	}

}
