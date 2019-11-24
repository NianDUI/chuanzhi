package demo03;

/*
 * String����жϹ��ܣ�
 * 	 boolean equals(Object anObject)�����ַ�����ָ���Ķ���Ƚϡ�
 * 	 boolean equalsIgnoreCase(String anotherString)  ����
		���� String ����һ�� String �Ƚϣ������Ǵ�Сд�� 
 *   boolean contains(CharSequence s) �Ƿ����
          	���ҽ������ַ�������ָ���� char ֵ����ʱ������ true�� 
 *   boolean startsWith(String prefix)  ��ʲô��ͷ
          	���Դ��ַ����Ƿ���ָ����ǰ׺��ʼ�� 
 *   boolean endsWith(String suffix)  ��ʲô��β
          	���Դ��ַ����Ƿ���ָ���ĺ�׺������ 
 *   boolean isEmpty() 	�����Ƿ�Ϊ��
          	���ҽ��� length() Ϊ 0 ʱ���� true�� 
 *  
 */
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("--------");
		

		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("--------");

		System.out.println(s1.contains("ell"));
		System.out.println(s1.contains("ho"));
		System.out.println("--------");

		System.out.println(s1.startsWith("h"));
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.startsWith("el"));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.endsWith("lo"));
		System.out.println(s1.endsWith("ll"));
		System.out.println("--------");

		String s4 = "";
		String s5 = null;
		System.out.println(s1.isEmpty()); // false
		System.out.println(s4.isEmpty()); // true
		// s5 ���󲻴��ڣ����Բ��ܵ��÷�������ָ���쳣
//		System.out.println(s5.isEmpty());
		System.out.println("--------");
		
	}
}
