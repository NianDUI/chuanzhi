package demo07;

/*
 * String和StringBuffer的相互转化
 * 
 * 
 * 	
 */
public class StringBufferTest {

	public static void main(String[] args) {
		String s = "hello";
		// 注意：不能把字符串的值直接赋值给StringBuffer
//		StringBuffer sb = "hello";
//		StringBuffer sb = s;
		// 方式1：通过构造方法
		StringBuffer sb = new StringBuffer(s);
		// 方式2：通过append方法
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println("----------");

		StringBuffer buffer = new StringBuffer("java");
		// 方式1：通过构造方法
		String str = new String(buffer);
		// 方式2：通过toString方法
		String str2 = buffer.toString();
		System.out.println(str);
		System.out.println(str2);

	}

}
