package demo07_������������_�ȴ����ѻ���_�����Ż�;

public class GetStudent implements Runnable {
	private Student s;

	public GetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			s.get();
		}

	}

}
