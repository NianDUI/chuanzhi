package demo01InnerClass;

/*
 * �ֲ��ڲ���
 * 	����ֱ�ӷ����ⲿ��ĳ�Ա
 * 	�ھֲ�λ�ã����Դ����ڲ������ͨ����������ڲ��෽�� ����ʹ���ڲ��๦��
 * 
 * �����⣺
 * 	�ֲ��ڲ�����ʾֲ�������ע�����
 * 		�ֲ��ڲ�����ʾֲ���������ʹ��fianl����
 * 			��Ϊ�ֲ����������ŵ�����϶���ʧ�����󲻻�������ʧ��
 * 			���Լ�final���α�����ɳ�������ջ����ʧ�ˣ����ڶ���
 * 			�õ�������20���������ã������һ�����������ʹ��
 */
class Outer3 {
	public int num = 10;
	
	public void method() {
		final int num2 = 20;
		class Inner {
			public void show() {
				System.out.println(num);
				// ���ڲ����з��ʱ��ر���num2����Ҫ������Ϊ��������
				System.out.println(num2);
			}
		}
		
		Inner i = new Inner();
		i.show();
	}
}
public class InnerClassDemo4 {

	public static void main(String[] args) {
		Outer3 o = new Outer3();
		o.method();
	}

}
