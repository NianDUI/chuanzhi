package demo02;

import java.lang.reflect.Constructor;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("demo01.Person");

		// 获取构造方法
		// public Constructor<?>[] getConstructors()
		// Constructor[] cons = c.getDeclaredConstructors();
//		Constructor[] cons = c.getDeclaredConstructors();
//		for (Constructor con : cons) {
//			System.out.println(con);
//		}

		// 获取无参构造方法
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);

		// 获取有参非公共构造方法
		// public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
		Constructor con2 = c.getDeclaredConstructor(String.class);
		con2.setAccessible(true);
		Object obj2 = con2.newInstance("林青霞");
		System.out.println(obj2);

		Constructor con3 = c.getDeclaredConstructor(String.class, int.class, String.class);
		System.out.println(con3.getParameterTypes()[1]);
	}

}
