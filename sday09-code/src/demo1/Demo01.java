package demo1;

public class Demo01 {
	static {
		System.out.println("静态代码块");
	}
	
	{
		System.out.println("构造代码块");
	}
	
	public Demo01() {
		System.out.println("构造");
	}
	
	public static void main(String[] args) {
		Demo01 d = new Demo01();
	}

}
