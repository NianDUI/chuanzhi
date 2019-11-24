package demo02_方法;

/*
 * static boolean isUpperCase(char ch) 
          确定指定字符是否为大写字母。 
 * static boolean isLowerCase(char ch) 
          确定指定字符是否为小写字母。 
 * static boolean isLetter(char ch) 
          确定指定字符是否为字母。 
 * static boolean isDigit(char ch) 
          确定指定字符是否为数字。 
 * static boolean isLetterOrDigit(char ch) 
          确定指定字符是否为字母或数字。 
 * static char toUpperCase(char ch) 
          使用取自 UnicodeData 文件的大小写映射信息将字符参数转换为大写。 
 * static char toLowerCase(char ch) 
          使用取自 UnicodeData 文件的大小写映射信息将字符参数转换为小写。 
 * 
 */
public class CharacterDemo {
	
	public static void main(String[] args) {
		System.out.println(Character.isUpperCase('A')); // true
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isUpperCase('0'));
		System.out.println("--------------");

		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('a')); // true
		System.out.println(Character.isLowerCase('0'));
		System.out.println("--------------");

		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('0')); // true
		System.out.println("--------------");

		System.out.println(Character.toUpperCase('A'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toLowerCase('a'));
		System.out.println("--------------");
		
		
	}

}
