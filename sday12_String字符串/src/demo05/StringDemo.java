package demo05;

/*
 * String类的转换功能
 *  byte[] getBytes() 
          使用平台的默认字符集将此 String 编码为 byte 序列，
          并将结果存储到一个新的 byte 数组中。 
 *  char[] toCharArray() 
          将此字符串转换为一个新的字符数组。 
 *  static String valueOf(char[] data) 
          返回 char 数组参数的字符串表示形式。 
 *  static String valueOf(int i) 
          返回 int 参数的字符串表示形式。 
          ......
 *  String toLowerCase() 
          使用默认语言环境的规则将此 String 中的所有字符都转换为小写。 
 *  String toUpperCase() 
          使用默认语言环境的规则将此 String 中的所有字符都转换为大写。 
 *  String concat(String str) 
          将指定字符串连接到此字符串的结尾。 
 * 
 */
public class StringDemo {

	public static void main(String[] args) {
		String s = "JavaSE";

		byte[] bys = s.getBytes();
		for (byte b : bys) {
			System.out.println(b);
		}
		System.out.println("-----------");

		char[] chs = s.toCharArray();
		for (char c : chs) {
			System.out.println(c);
		}
		System.out.println("-----------");
		
		System.out.println(String.valueOf(chs));
		System.out.println("-----------");
		
		System.out.println(String.valueOf(1554));
		System.out.println("-----------");
		
		System.out.println(s.toLowerCase());
		System.out.println("-----------");
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.concat("sdfg"));
		System.out.println("-----------");
		
		
	}

}
