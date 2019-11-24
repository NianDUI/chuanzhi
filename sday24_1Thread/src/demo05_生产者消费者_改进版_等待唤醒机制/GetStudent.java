package demo05_������������_�Ľ���_�ȴ����ѻ���;

public class GetStudent implements Runnable {
	private Student s;

	public GetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				// �ж���û��
				if (!s.flag) {
					try {
						s.wait(); // t2�͵ȴ��ˡ������ͷ����������ѹ�����ʱ���Ǵ������ѹ���
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(s.name + "---" + s.age);
				
				// �޸ı��
				s.flag = false;
				// �����߳�
				s.notify();
			}
		}

	}

}
