package demo02;

import java.lang.reflect.Constructor;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("demo01.Person");

		// ��ȡ���췽��
		// public Constructor<?>[] getConstructors()
		// Constructor[] cons = c.getDeclaredConstructors();
//		Constructor[] cons = c.getDeclaredConstructors();
//		for (Constructor con : cons) {
//			System.out.println(con);
//		}

		// ��ȡ�޲ι��췽��
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);

		// ��ȡ�вηǹ������췽��
		// public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
		Constructor con2 = c.getDeclaredConstructor(String.class);
		con2.setAccessible(true);
		Object obj2 = con2.newInstance("����ϼ");
		System.out.println(obj2);

		Constructor con3 = c.getDeclaredConstructor(String.class, int.class, String.class);
		System.out.println(con3.getParameterTypes()[1]);
	}

}
