package demo01InnerClass;

/*
 * �����ڲ���
 * 	�����ڲ���ļ�д��
 * 
 * ǰ�᣺����һ���׻��߽ӿ�
 * 
 * ��ʽ��
 * 		new ������ӿ���() {
 * 			��д����;
 * 		};
 * ������ʲô�أ�
 * 	��һ���̳��˸������ʵ���˸ýӿڵ�������������
 */
interface Inter {
	public abstract void show();

	public abstract void show2();
}

class Outer4 {
	public void method() {
		// һ��������ʱ��
		/*
		 * new Inter() { public void show() { System.out.println("show"); } }.show();
		 */

		// ����������ʱ��
		/*
		 * new Inter() { public void show() { System.out.println("show"); } public void
		 * show2() { System.out.println("show2"); } }.show();
		 * 
		 * new Inter() { public void show() { System.out.println("show"); } public void
		 * show2() { System.out.println("show2"); } }.show2();
		 */

		// ����������鷳����ô�Ľ�
		Inter i = new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		};

		i.show();
		i.show2();
	}

	public void show(Inter i) {
		i.show();
		i.show2();
	}
}

public class InnerClassDemo5 {

	public static void main(String[] args) {
		Outer4 o = new Outer4();
		o.method();

		// �����ڲ����ڿ�����ʹ��
		// ʹ�ù������٣���ʡ�ڴ�
		o.show(new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		});
	}

}
