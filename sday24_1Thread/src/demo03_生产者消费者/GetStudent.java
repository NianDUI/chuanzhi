package demo03_生产者消费者;

public class GetStudent implements Runnable {
	private Student s;
	
	public GetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		// Student s = new Student();
		System.out.println(s.name + "---" + s.age);

	}

}
