package demo01;

/*
 * �̰߳�ȫ
 * ��ȫ-- ͬ�� -- �����ǰ�ȫ��
 * ����ȫ-- ��ͬ�� -- Ч�ʸ�һЩ
 * ��ȫ��Ч����������Զ�������ǵ����⡣
 * 
 * ��ȫ�����С�ҽԺ����վ
 * Ч�ʣ�������վ����̳֮���
 * 
 * StringBuffer
 * 	�̰߳�ȫ�Ŀɱ��ַ�����
 * ���ݳ��ȿɱ䣬String���ɱ�
 * ���췽��
 * 		StringBuffer() 
 * 		          ����һ�����в����ַ����ַ��������������ʼ����Ϊ 16 ���ַ��� 
 * 		StringBuffer(int capacity) 
 * 		          ����һ�������ַ���������ָ����ʼ�������ַ����������� 
 * 		StringBuffer(String str) 
 * 		          ����һ���ַ��������������������ݳ�ʼ��Ϊָ�����ַ������ݡ� 
 * 		
 * 	int capacity() 
          ���ص�ǰ������ ����ֵ
 *  int length() 
          ���س��ȣ��ַ������� ʵ��ֵ
 * 
 */
public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb); // ��д��toString����
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("------------");
		
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println(sb2); // ��д��toString����
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println("------------");
		
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println(sb3); // ��д��toString����
		System.out.println(sb3.length());
		System.out.println(sb3.capacity()); // 16 + 5 = 21
		System.out.println("------------");
	}

}
