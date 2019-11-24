package demo05_JDK5新特性;

/*
 * JDK5新特性
 * 自动装箱：基本类型 ——》包装类类型
 * 自动拆箱：包装类类型 -》基本类型
 * 
 * 注意一个小问题
 * 	
 */
public class IntegerDemo {

	public static void main(String[] args) {
//		Integer i = new Integer(100);
		Integer ii = 100; // ii = Integer.valueOf(100)
		ii += 200; // ii = Integer.valueOf(ii.inValue() + 200)
		System.out.println("ii:" + ii); // new StringBuilder("ii:").append(ii).toString()

		// 注意一个小问题
		Integer iii = null;
		// java.lang.NullPointerException
		if (iii != null) { // 建议想判断null再使用
			iii += 100;
			System.out.println(iii);
		}
	}

}
