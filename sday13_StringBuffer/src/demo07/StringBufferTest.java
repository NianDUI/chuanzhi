package demo07;

/*
 * String��StringBuffer���໥ת��
 * 
 * 
 * 	
 */
public class StringBufferTest {

	public static void main(String[] args) {
		String s = "hello";
		// ע�⣺���ܰ��ַ�����ֱֵ�Ӹ�ֵ��StringBuffer
//		StringBuffer sb = "hello";
//		StringBuffer sb = s;
		// ��ʽ1��ͨ�����췽��
		StringBuffer sb = new StringBuffer(s);
		// ��ʽ2��ͨ��append����
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println("----------");

		StringBuffer buffer = new StringBuffer("java");
		// ��ʽ1��ͨ�����췽��
		String str = new String(buffer);
		// ��ʽ2��ͨ��toString����
		String str2 = buffer.toString();
		System.out.println(str);
		System.out.println(str2);

	}

}
