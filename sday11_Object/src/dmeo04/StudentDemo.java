package dmeo04;

/*
 * Object�۵ķ���:
 * 		protected void finalize()  ������������,ʲôʱ����ղ�ȷ��
                 throws Throwable
                 ������������ȷ�������ڶԸö���ĸ�������ʱ��
                  �ɶ�����������������ô˷�����
 * 
 * 		protected Object clone()
                throws CloneNotSupportedException
                ���������ش˶����һ������
 * 
 *  public interface Cloneable ����һ����ǽӿڣ�
 *  	����ʵ���� Cloneable �ӿڣ���ָʾ Object.clone()
 *  		�������ԺϷ��ضԸ���ʵ�����а��ֶθ��ơ�
 *  	�����û��ʵ�� Cloneable �ӿڵ�ʵ���ϵ��� Object �� 
 *  		clone ��������ᵼ���׳� CloneNotSupportedException
 *  		 �쳣��  
 * 
 * 
 */
public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student("����ϼ", 27);
		Object obj = s.clone();
		Student s2 = (Student) obj;
		System.out.println(s2.getName()+s2.getAge());
	}

}
