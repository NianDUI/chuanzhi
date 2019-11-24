package demo02_add;

/*
 * StringBuffer的添加功能
 * 添加
 *  StringBuffer append(String str) ：具有方法重载，所有类型
          将指定的字符串追加到此字符序列。 
          	返回的对象其实就是他自己本身 、没有重新开空间
 * 
 * 插入
 *  StringBuffer insert(int offset, String str) 
          将字符串插入此字符序列中。 
          	在指定位置插入 ：具有方法重载，所有类型
 * 
 * 
 * 
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

//		StringBuffer sb2 = sb.append("hello"); // 
//		System.out.println(sb);
//		System.out.println(sb2);
//		System.out.println(sb == sb2); // true
//		System.out.println("-----------");

//		sb.append("hello");
//		sb.append(true);
//		sb.append(12);
//		sb.append(34.56);

		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println(sb);
		
		sb.insert(5, "world");
		System.out.println(sb);
		
		
	}

}
