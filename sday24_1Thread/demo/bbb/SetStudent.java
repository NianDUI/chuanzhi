package demo07_生产者消费者_等待唤醒机制_代码优化;

public class SetStudent implements Runnable {
	private Student s;
	private int x = 0;

	public SetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				s.set("林青霞", 27);
			} else {
				s.set("刘意", 30);
			}
			x++; // x=1
		}

	}

}
