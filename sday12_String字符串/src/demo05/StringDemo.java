package demo05;

/*
 * String���ת������
 *  byte[] getBytes() 
          ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ���У�
          ��������洢��һ���µ� byte �����С� 
 *  char[] toCharArray() 
          �����ַ���ת��Ϊһ���µ��ַ����顣 
 *  static String valueOf(char[] data) 
          ���� char ����������ַ�����ʾ��ʽ�� 
 *  static String valueOf(int i) 
          ���� int �������ַ�����ʾ��ʽ�� 
          ......
 *  String toLowerCase() 
          ʹ��Ĭ�����Ի����Ĺ��򽫴� String �е������ַ���ת��ΪСд�� 
 *  String toUpperCase() 
          ʹ��Ĭ�����Ի����Ĺ��򽫴� String �е������ַ���ת��Ϊ��д�� 
 *  String concat(String str) 
          ��ָ���ַ������ӵ����ַ����Ľ�β�� 
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
