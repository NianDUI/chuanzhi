package demo01;

/*
 * Object�۵ķ���:
 * 		public int hashCode()���ظö���Ĺ�ϣ��ֵ
 * 			ע�⣺��ϣֵ�Ǹ��ݹ�ϣ�㷨���������һ��ֵ�����ֵ�͵�ֵַ�й�
 * 				������ʵ�ʵ�ֵַ���������Ϊ��ֵַ��
 * 
 * 		public final Class<?> getClass()���ش� Object ������ʱ��
 * 			Class��ģ�
 * 				public String getName()�� String ����ʽ���ش� Class ����
 * 					����ʾ��ʵ�壨�ࡢ�ӿڡ������ࡢ�������ͻ� void�����ơ�
 */
public class StudentDemo {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		
		Student s2 = new Student();
		System.out.println(s2.hashCode());
		
		Student s3 = s1;
		System.out.println(s3.hashCode());
		
		System.out.println("------------");
		
		Student s = new Student();
		Class c = s.getClass();
		System.out.println(c.getName()); // demo01.Student
		
		System.out.println(s.getClass().getName());
	}

}
