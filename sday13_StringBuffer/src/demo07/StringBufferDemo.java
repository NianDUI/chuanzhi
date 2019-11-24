package demo07;

/*
 * 面试题：
 * 	1:String,StringBuffer和StringBuilder的区别
 * 		A:String是内容不可变，StringBuffer，StringBuilder都时内容可变的；
 * 		B:StringBuffer是同步的，数据安全的，效率低；
 * 			StringBuilder是不同步的，数据不安全的，效率高；
 * 
 * 类 StringBuilder
 * 		一个可变的字符序列。此类提供一个与 StringBuffer 兼容的 API，
 * 	但不保证同步。该类被设计用作 StringBuffer 的一个简易替换，
 * 	用在字符串缓冲区被单个线程使用的时候（这种情况很普遍）。
 * 	如果可能，建议优先采用该类，因为在大多数实现中，
 * 	它比 StringBuffer 要快。 
 * 
 * 	2:StringBuffer和数组的区别？
 * 		二者都可以看成是一个容器，装其他的数据。
 * 		但是呢，StringBuffer的数据最终都是一个字符串数据；
 * 		而数组可以放置任意类型的数据，但必须是同一种数据类型。
 * 
 * 	3：形式参数问题：
 * 		String作为参数传递
 * 		StringBuffer作为参数传递
 * 	注意：
 * 		String作为参数传递，效果和基本数据类型作为参数传递是一样的；
 * 
 */
public class StringBufferDemo {

	public static void main(String[] args) {
//		String s1 = new String("hello");
//		String s2 = new String("world"); // 效果一样和下面
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2); // hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2); // hello---world
		// 字符串不可变，变了只是有了新的字符串，原来的没有变

		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2); // hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2); // hello---worldworld

	}

	private static void change(StringBuffer sb1, StringBuffer sb2) {
		sb1 = sb2;
		sb2.append(sb1);
	}

	public static void change(String s1, String s2) {
		s1 = s2;
		s2 = s1 + s2;
	}

}
