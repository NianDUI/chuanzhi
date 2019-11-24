package demo02toString;

/*
 * Object�۵ķ���:
 * 		public String toString()���ظö�����ַ�����ʾ
 * 
 * Integer��
 * 		public static String toHexString(int i)
 * 		��ʮ�����ƣ����� 16���޷���������ʽ����һ����������
 * 			���ַ�����ʾ��ʽ�� 
 * 
 */
public class StudentDemo {
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("--------------");
		System.out.println(s.toString()); // demo02toString.Student@4411d970
		System.out.println("--------------");
		// �÷�������һ���ַ���������ֵ���ڣ� 
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// this.getClass().getName() + '@' + Integer.toHexString(this.hashCode())
	
		System.out.println(s.getClass().getName()
				+ '@' + Integer.toHexString(s.hashCode()));
		System.out.println(s);
		
	}

}
