package demo03_������������;

/*
 * ������
 * 		��Դ�ࣺStudent
 * 		����ѧ�����ݣ�SetStudent�������ߣ�
 * 		��ȡѧ�����ݣ�GetStudent�������ߣ�
 * 		�����ࣺStudentDemo
 * 
 * ����1������˼·д���룬��������ÿ�ζ��ǣ�null---0
 * ԭ��������ÿ���߳��ж��������µ���Դ��������Ҫ���ʱ�����úͻ�ȡ����ԴӦ����ͬһ��
 * 
 * ���ʵ���أ�
 * 		˼·1��������������ݴ���������ͨ�����췽�����ݸ��������ࡣ
 */
public class StudentDemo {

	public static void main(String[] args) {
		// ������Դ
		Student s = new Student();
		
		// ���úͻ�ȡ����
		SetStudent st = new SetStudent(s);
		GetStudent gt = new GetStudent(s);
		
		// �߳���
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		// �����߳�
		t2.start();
		t1.start();
		
		// null---27
	}

}
