package demo04;


/*
 * String��Ļ�ȡ����
 *  int length() 
          ���ش��ַ����ĳ��ȡ� 
 *  char charAt(int index) 
          ����ָ���������� char ֵ�� 
 *  int indexOf(int ch) 
          ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ��������� 
 *  int indexOf(String str) 
          ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ��������� 
 *  int indexOf(int ch, int fromIndex) 
          �����ڴ��ַ����е�һ�γ���ָ���ַ�������������ָ����������ʼ������ 
 *  int indexOf(String str, int fromIndex) 
          ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ�����������ָ����������ʼ�� 
 * 	String substring(int beginIndex) 
          �����ַ�����ָ�����������ַ���ʼ��ֱ�����ַ���ĩβ��
 *  String substring(int beginIndex, int endIndex) 
           �����ַ�����ָ���� beginIndex ����ʼ��ֱ������ endIndex - 1 �����ַ���
 * 
 */
public class StringDemo {
	
	public static void main(String[] args) {
		String s = "helloworld";
		
		System.out.println(s.length());
		System.out.println("-----------");
		
		System.out.println(s.charAt(7));
		System.out.println("-----------");

		System.out.println(s.indexOf("owo"));
		System.out.println("-----------");

		System.out.println(s.indexOf('l'));
		System.out.println("-----------");
		
		System.out.println(s.indexOf("owo"));
		System.out.println("-----------");

		System.out.println(s.indexOf('l', 4));
		System.out.println(s.indexOf('k', 4));
		System.out.println(s.indexOf('k', 40));
		System.out.println("-----------");

		System.out.println(s.indexOf("owo", 5));
		System.out.println("-----------");

		System.out.println(s.substring(5)); // ��������
		System.out.println(s.substring(0)); // ��������
		System.out.println("-----------");

		// ���󲻰���
		System.out.println(s.substring(3, 8)); // ������ĩβ����
		System.out.println(s.substring(0, s.length())); // ������ĩβ����
//		System.out.println(s.substring(8, 15)); // ������ĩβ����
		System.out.println("-----------");
		
		
	}

}
