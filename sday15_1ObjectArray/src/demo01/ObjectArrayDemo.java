package demo01;

/*
 * 	�������ѧ������������ѧ������Ϣ�洢�������У�������������ÿһ��ѧ����Ϣ.
 * 		ѧ����Student
 * 		��Ա������name,age
 * 		���췽�����޲Σ��в�
 * 		��Ա������getXxx()/setXxx()
 * 		�洢ѧ��������? �Լ���һ��Ӧ������ô����?
 * 
 * 
 * 
 */
public class ObjectArrayDemo {
	
	public static void main(String[] args) {
		Student[] students = new Student[5];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student("20" + i, 20 + i);
		}

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
	}

}
