package demo02_����;

/*
 * static boolean isUpperCase(char ch) 
          ȷ��ָ���ַ��Ƿ�Ϊ��д��ĸ�� 
 * static boolean isLowerCase(char ch) 
          ȷ��ָ���ַ��Ƿ�ΪСд��ĸ�� 
 * static boolean isLetter(char ch) 
          ȷ��ָ���ַ��Ƿ�Ϊ��ĸ�� 
 * static boolean isDigit(char ch) 
          ȷ��ָ���ַ��Ƿ�Ϊ���֡� 
 * static boolean isLetterOrDigit(char ch) 
          ȷ��ָ���ַ��Ƿ�Ϊ��ĸ�����֡� 
 * static char toUpperCase(char ch) 
          ʹ��ȡ�� UnicodeData �ļ��Ĵ�Сдӳ����Ϣ���ַ�����ת��Ϊ��д�� 
 * static char toLowerCase(char ch) 
          ʹ��ȡ�� UnicodeData �ļ��Ĵ�Сдӳ����Ϣ���ַ�����ת��ΪСд�� 
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
