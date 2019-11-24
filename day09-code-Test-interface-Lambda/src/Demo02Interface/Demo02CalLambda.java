package Demo02Interface;

public class Demo02CalLambda {

	public static void main(String[] args) {
		method(new CalImpl());
	}
	
	public static void method(Cal cal) {
		int result = cal.sum(10, 20);
		System.out.println("½á¹ûÊÇ£º" + result);
	}
	
}
