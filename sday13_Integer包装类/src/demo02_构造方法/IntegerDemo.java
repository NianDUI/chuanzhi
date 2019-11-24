package demo02_构造方法;

/*
 * Integer的构造方法
 * public Integer(int value)构造一个新分配的 Integer 对象，它表示指定的 int 值。 
 * public Integer(String s)构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值
 * 		注意这个字符串必须是由数字字符组成。
 */
public class IntegerDemo {

	public static void main(String[] args) {
		// 方式一。
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println(ii);
		
		// 方式二。
		String s = "100";
		// java.lang.NumberFormatException
//		String s = "abc";
		Integer iii = new Integer(s);
		System.out.println(iii);
		
	}
	
}
