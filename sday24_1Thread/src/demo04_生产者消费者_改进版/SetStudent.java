package demo04_������������_�Ľ���;

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
				if (x % 2 == 0) {
					s.name = "����ϼ";
					s.age = 27;
				} else {
					s.name = "����";
					s.age = 30;
				}
				x++;
			}
		}

	}

}
