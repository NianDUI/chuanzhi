package demo05_������������_�Ľ���_�ȴ����ѻ���;

public class SetStudent implements Runnable {
	private Student s;
	private int x = 0;

	public SetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized(s) {
				// �ж���û��
				if (s.flag) {
					try {
						s.wait(); // t1�ȴ����ͷ���
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (x % 2 == 0) {
					s.name = "����ϼ";
					s.age = 27;
				} else {
					s.name = "����";
					s.age = 30;
				}
				x++; // x=1
				
				// �޸ı��
				s.flag = true;
				// �����߳�
				s.notify(); // ����t2�����Ѳ���ʾ���������ִ�У����뻹����CPUִ��Ȩ
			}
			// t1�У�����t2��
		}

	}

}
