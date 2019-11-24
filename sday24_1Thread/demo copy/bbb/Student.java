package demo07_������������_�ȴ����ѻ���_�����Ż�;

public class Student {
	private String name;
	private int age;
	private boolean flag; // Ĭ�������û�����ݣ�true��������

	public synchronized void set(String name, int age) {
		// ���������,�͵ȴ���
		if (this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// �������ݡ�
		this.name = name;
		this.age = age;
		
		// �޸ı��
		this.flag = true;
		this.notify();
	}
	
	public synchronized void get() {
		// ���û�����ݣ��͵ȴ���
		if (!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// ��ȡ���ݡ�
		System.out.println(this.name + "---" + this.age);
		
		// �޸ı�ǡ�
		this.flag = false;
		this.notify();
	}
}
