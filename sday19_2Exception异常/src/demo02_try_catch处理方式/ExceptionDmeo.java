package demo02_try_catch����ʽ;

/*
 *  �����Լ���δ����쳣�أ�
 *  a:try...catch...finally
 *  b:throws	�׳�
 *  
 *  try...catch...finally�Ĵ����ʽ��
 *  	try {
 *  		���ܳ�������Ĵ���;
 *  	} catch (�쳣�� ����) {
 *  		�������Ĵ���;
 *  	} finally {
 *  		�ͷ���Դ;
 *  	}
 *  
 *  ���θ�ʽ:
 *  	try {
 *  		���ܳ�������Ĵ���;
 *  	} catch (�쳣�� ����) {
 *  		�������Ĵ���;
 *  	}
 *  
 *  ע�⣺
 *  	a:try����Ĵ���Խ��Խ��
 *  	b:catch������������ݣ������Ǹ���һ���򵥵���ʾ��
 */
public class ExceptionDmeo {
	public static void main(String[] args) {
		// ��һ�׶Ρ�
		int a = 20;
//		int b = 2;
		int b = 0;
		try {
			System.out.println(a / b); // ArithmeticException
		} catch(ArithmeticException ae) {
			System.out.println("��������Ϊ0");
//			ae.printStackTrace();
		}
		
		// �ڶ��׶Ρ�
		System.out.println("over");
		
	}
}
