package demo07;

/*
 * �����⣺
 * 	1:String,StringBuffer��StringBuilder������
 * 		A:String�����ݲ��ɱ䣬StringBuffer��StringBuilder��ʱ���ݿɱ�ģ�
 * 		B:StringBuffer��ͬ���ģ����ݰ�ȫ�ģ�Ч�ʵͣ�
 * 			StringBuilder�ǲ�ͬ���ģ����ݲ���ȫ�ģ�Ч�ʸߣ�
 * 
 * �� StringBuilder
 * 		һ���ɱ���ַ����С������ṩһ���� StringBuffer ���ݵ� API��
 * 	������֤ͬ�������౻������� StringBuffer ��һ�������滻��
 * 	�����ַ����������������߳�ʹ�õ�ʱ������������ձ飩��
 * 	������ܣ��������Ȳ��ø��࣬��Ϊ�ڴ����ʵ���У�
 * 	���� StringBuffer Ҫ�졣 
 * 
 * 	2:StringBuffer�����������
 * 		���߶����Կ�����һ��������װ���������ݡ�
 * 		�����أ�StringBuffer���������ն���һ���ַ������ݣ�
 * 		��������Է����������͵����ݣ���������ͬһ���������͡�
 * 
 * 	3����ʽ�������⣺
 * 		String��Ϊ��������
 * 		StringBuffer��Ϊ��������
 * 	ע�⣺
 * 		String��Ϊ�������ݣ�Ч���ͻ�������������Ϊ����������һ���ģ�
 * 
 */
public class StringBufferDemo {

	public static void main(String[] args) {
//		String s1 = new String("hello");
//		String s2 = new String("world"); // Ч��һ��������
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2); // hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2); // hello---world
		// �ַ������ɱ䣬����ֻ�������µ��ַ�����ԭ����û�б�

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
