package demo01InnerClass;

/*
 * ��Ա�ڲ���
 */
class Outer {
	private int num = 10;

//	private class Inner {
	class Inner {
		public void show() {
			System.out.println(num);
		}
	}

	// һ���ڲ��಻�������ʣ�Ϊ�����ݵİ�ȫ��
	private class Inner2 {
		public void show() {
			System.out.println("˽���ڲ���2");
		}
	}

	// �ڲ����þ�̬��������Ϊ�ڲ�����Կ���Ϊ�ⲿ��ĳ�Ա
	// Ϊ�˷����������
	public static class Inner3 {
		public void show() {
			System.out.println("������̬�ڲ���3");
		}

		public static void show2() {
			System.out.println("������̬�ڲ���3�Ĺ�����̬����");
		}
	}

	public void show() {
		if (num == 10) { // �����ж�
			Inner2 i2 = new Inner2();
			i2.show();
		}
	}
}

public class InnerClassDemo3 {

	public static void main(String[] args) {
		//��Ա�ڲ���de���ʷ�����
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
		
		Outer o = new Outer();
		o.show();
		
		//��Ա�ڲ��౻��̬���κ���ʷ�����
		Outer.Inner3 oi3 = new Outer.Inner3();
		oi3.show();
		oi3.show2();
		
		// show2����һ�ֵ��÷�ʽ
		Outer.Inner3.show2();
	}

}
