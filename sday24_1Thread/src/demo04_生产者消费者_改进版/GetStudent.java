package demo04_������������_�Ľ���;

public class GetStudent implements Runnable {
	private Student s;

	public GetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				System.out.println(s.name + "---" + s.age);
			}
		}

	}

}
