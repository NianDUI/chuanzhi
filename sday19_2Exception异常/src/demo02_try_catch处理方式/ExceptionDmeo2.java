package demo02_try_catch����ʽ;

/*
 *  JDK7������һ���µ��쳣��������
 *  	try {
 *  		...
 *  	} catch(�쳣��1 | �쳣��2 | ... ����) {
 *  		...
 *  	}
 *  
 *  	ע�⣺���ַ�ʽ��Ȼ��࣬����Ҳ�����á�
 *  			a:����ʽ��һ�µ�(ʵ�ʿ����У��ö�ʱ����ܾ������ͬ���͵����⣬����ͬһ������)
 *  			b:����쳣�������ƽ����ϵ
 */
public class ExceptionDmeo2 {
	public static void main(String[] args) {
		method();
	}

	private static void method() {
		int a = 20;
		int b = 0;
		int[] arr = { 1, 2, 3 };
		
		
//		try {
//			System.out.println(a / b);
//			System.out.println(arr[3]);
//			System.out.println("���������һ���쳣���㲻̫�����˭������ô���أ�");
//		} catch (ArithmeticException ae) {
//			System.out.println("��������Ϊ0");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("������˲��÷��ʵ�����");
//		} catch(Exception e) {
//			System.out.println("���������ˡ�");
//		}
		
		// JDK7�Ĵ�����
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("��������");
		}
		
		System.out.println("over");
	}
}
