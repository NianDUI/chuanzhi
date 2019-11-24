package demo3Interface;

/*
 * �ӿڵ���Ҫ��������չ���ܡ�
 * ��������Ҫ�����ǹ��Թ��ܡ�
 * �ӿ��еı���Ĭ��Ϊ����
 * 	��Ա������ֻ���ǳ����������Ǿ�̬��
 * 		Ĭ�����η���public static final
 * 		���飺�Լ��ֶ�����
 * 	���췽�����ӿ�û�й��췽��
 * 	��Ա������ֻ���ǳ��󷽷�
 * 		Ĭ�����η���public abstract
 * 		���飺�Լ��ֶ�����
 * 
 * ���е��඼Ĭ�ϼ̳���һ���ף�Object��
 * �� Object �����νṹ�ĸ��ࡣÿ���඼ʹ�� Object ��Ϊ���ࡣ
 * ���ж��󣨰������飩��ʵ�������ķ�����
 */
interface Inter {
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;

//	public Inter() {
//	}

//	public void show() {
//		
//	}
	abstract void show();
	
	public void show2() ;

}

class InterImpl implements Inter {

	@Override
	public void show() {

	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num2);
//		i.num = 1;  // The final field Inter.num cannot be assigned
//		i.num2 = 5; // The final field Inter.num2 cannot be assigned

		System.out.println(Inter.num);
		System.out.println(Inter.num2);
		
	}

}
