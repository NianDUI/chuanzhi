package demo03_������������;

public class SetStudent implements Runnable {
	private Student s;
	
	public SetStudent(Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		// Student s = new Student();
		s.name = "����ϼ";
		s.age = 27;
		
	}

}
