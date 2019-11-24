package demo03_单例设计模式;

public class Teacher {

	private Teacher() {

	}

	private static Teacher t = null;

	public synchronized static Teacher getTeacher() {
		if (t == null) {
			t = new Teacher();
		}
		return t;
	}

}
