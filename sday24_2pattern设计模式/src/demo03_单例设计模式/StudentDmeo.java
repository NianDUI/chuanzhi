package demo03_�������ģʽ;

/*
 * ����ģʽ:
 * 		��֤�����ڴ���ֻ��һ������
 *  
 *  ��α�֤�����ڴ���ֻ��һ������
 *  	a:�ѹ��췽��˽��
 *  	b:�ڳ�Աλ���Լ�����һ������
 *  	c:ͨ��һ�������ķ����ṩ����
 *  
 *  ���֣�
 *  	����ʽ����һ���ؾʹ�����������Student
 *  	����ʽ����һ��ʹ��ʱ�Ŵ�����������Teacher
 *  
 *  
 */
public class StudentDmeo {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student();
//		System.out.println(s1 == s2); // false

		// ͨ��������εĵ������أ�
//		Student.s = null;
		
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2); // true
		
		System.out.println(s1); // null��demo03_�������ģʽ.Student@136432db
		System.out.println(s2); // null��demo03_�������ģʽ.Student@136432db
	}
}
