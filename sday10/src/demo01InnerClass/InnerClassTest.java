package demo01InnerClass;

/*
 * Ҫȥ��� 30,20,10���
 * 
 * ע�⣺
 * 	1���ڲ�����ⲿ��û�м̳й�ϵ
 * 	2��ͨ���ⲿ�����޶�this����
 * 		Outer.this
 */
class Outer2 {
	public int num = 10;
	
	class Inner {
		public int num = 20;
		
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
//			System.out.println(new Outer2().num);
			System.out.println(Outer2.this.num);
		}
	}
}

public class InnerClassTest {
	
	public static void main(String[] args) {
		Outer2.Inner i = new Outer2().new Inner();
		i.show();
	}

}
