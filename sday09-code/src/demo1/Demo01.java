package demo1;

public class Demo01 {
	static {
		System.out.println("��̬�����");
	}
	
	{
		System.out.println("��������");
	}
	
	public Demo01() {
		System.out.println("����");
	}
	
	public static void main(String[] args) {
		Demo01 d = new Demo01();
	}

}
