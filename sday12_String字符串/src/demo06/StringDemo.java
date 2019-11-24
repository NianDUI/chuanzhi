package demo06;


/*
 * String�����������
 *  String replace(char oldChar, char newChar) 
          ����һ���µ��ַ���������ͨ���� newChar 
          �滻���ַ����г��ֵ����� oldChar �õ��ġ� 
 *  String replace(CharSequence target, CharSequence replacement) 
          ʹ��ָ��������ֵ�滻����
          �滻���ַ�������ƥ������ֵĿ�����е����ַ�����  
 *  String trim() 
          �����ַ����ĸ���������ǰ���հ׺�β���հס� 
 *  int compareTo(String anotherString) 
          ���ֵ�˳��Ƚ������ַ����� 
 *  int compareToIgnoreCase(String str) 
          ���ֵ�˳��Ƚ������ַ����������Ǵ�Сд�� 
 * 
 */
public class StringDemo {
	
	public static void main(String[] args) {
		String s1 = "helloworld";
		System.out.println(s1.replace('l', 'k'));
		System.out.println(s1.replace("owo", "ak47"));
		System.out.println("-------------");

		
		String s2 = "   hello world   ";
		System.out.println("|||" + s2 + "|||");
		System.out.println("|||" + s2.trim() + "|||");
		System.out.println("-------------");
		
		String s3 = "hello";
		String s4 = "hello";
		String s5 = "abc";
		String s6 = "xyz";
		// ������ͬ���ַ�ǰһ������һ�������صĵ���ֵ
		System.out.println(s3.compareTo(s4)); // 0
		System.out.println(s3.compareTo(s5)); // 7
		System.out.println(s3.compareTo(s6)); // -16
		
	}

}
