package demo01InnerClass;

/*
 * �����ڲ��������⣺
 * 	interface Inter { void show();}
 * 	class Outer { // �������}
 * 	public class OuterDemo {
		public static void main(String[] args) {
			Outer.method().show();
		}
	}
	Ҫ���ڿ���̨�����HelloWorld��
 */

interface Inter2 {
	void show();
	// public abstract
}

class Outer5 {
	// �������
	public static Inter2 method() {
		return new Inter2() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}

public class InnerClassTest3 {

	public static void main(String[] args) {
		Outer5.method().show();
	}

}
