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
 *  �����⣺
 *  	����ģʽ��˼����ʲô��
 *  		��֤�����ڴ���ֻ��һ������
 *  	��дһ���������֡�
 *  		д����ʽ��
 *  	����������ʽ(�ǲ��������ĵ���ģʽ)
 *  	���ԣ�����ʽ(���ܻ������ĵ���ģʽ)
 *  		a:�����أ��ӳټ��أ�
 *  		b:�̰߳�ȫ����
 *  			a:�Ƿ���̻߳����� ��
 *  			b:�Ƿ��й������ݡ� ��
 *  			c:�Ƿ��ж����������������ݡ� ��
 *  		�ӣ�synchronized
 *  
 *  
 */
public class TeacherDemo {
	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		System.out.println(t1 == t2); // true
		System.out.println(t1); // demo03_�������ģʽ.Teacher@136432db
		System.out.println(t2); // demo03_�������ģʽ.Teacher@136432db
	}
}
