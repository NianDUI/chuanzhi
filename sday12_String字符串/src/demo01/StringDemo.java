package demo01;

/*
 * String ������ַ�����Java �����е������ַ�������ֵ���� "abc" ������Ϊ�����ʵ��ʵ�֡� 

�ַ����ǳ��������ǵ�ֵ�ڴ���֮���ܸ��ġ�

 * 
 * 
 */
public class StringDemo {

	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println("----------");

		byte[] b = { 97, 98, 99, 100, 101 };
		String s2 = new String(b);
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println("----------");

		String s3 = new String(b, 1 ,3);
		System.out.println(s3);
		System.out.println(s3.length());
		System.out.println("----------");
		
		char[] c = {'a', 'b', 'c', 'd', 'e', '��' };
		String s4 = new String(c);
		System.out.println(s4);
		System.out.println(s4.length());
		System.out.println("----------");

		String s5 = new String(c, 2 ,4);
		System.out.println(s5);
		System.out.println(s5.length());
		System.out.println("----------");
		
		String s6 = new String("abcde");
		System.out.println(s6);
		System.out.println(s6.length());
		System.out.println("----------");
		

		String s7 = "abcde";
		System.out.println(s7);
		System.out.println(s7.length());
		System.out.println("----------");
		
		

	}

}
