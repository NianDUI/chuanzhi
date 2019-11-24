package demo03_生产者消费者;

public class SetStudent implements Runnable {
	private Student s;
	
	public SetStudent(Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		// Student s = new Student();
		s.name = "林青霞";
		s.age = 27;
		
	}

}
