package demo02_try_catch����ʽ;

/*
 * a:һ���쳣
 * b:�����쳣�Ĵ���
 * 		a:ÿһ��дһ��try...catch
 * 		b:дһ��try�����catch
 * 			try {
 * 				...
 * 			} catch(�쳣�� ����) {
 * 				...
 * 			} catch(�쳣�� ����) {
 *  			...
 *  		}
 *  		...
 *  	
 *  		ע�����
 *  			1������ȷ�ľ�����ȷ����Ҫ�ô�Ĵ���
 *  			2�� ƽ����ϵ���쳣˭ǰ˭������ν������������Ӹ���ϵ���������ں��档
 *  
 *  ע�⣺
 *  	һ��try����������⣬�ͻ�������������׳�ȥһ�ˣ�
 *  	Ȼ���catch������������ƥ�䣬
 *  	һ����ƥ���catch��ִ������Ĵ���,Ȼ��ͽ�����try...��
 *  	����ִ����������
 *  	
 *  
 */
public class ExceptionDmeo3 {
	public static void main(String[] args) {
//		method1();

//		method2();
		
//		method3();
		
		
		method4();
	}

	private static void method4() {
		int a = 20;
		int b = 0;
		int[] arr = { 1, 2, 3 };
		
		
		// үү�����
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println("���������һ���쳣���㲻̫�����˭������ô���أ�");
		} catch (ArithmeticException ae) {
			System.out.println("��������Ϊ0");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("������˲��÷��ʵ�����");
		} catch(Exception e) {
			System.out.println("���������ˡ�");
		}
		
		// үү��ǰ�ǲ����Ե�
//		try {
//			System.out.println(a / b);
//			System.out.println(arr[3]);
//			System.out.println("���������һ���쳣���㲻̫�����˭������ô���أ�");
//		} catch(Exception e) {
//			System.out.println("���������ˡ�");
//		} catch (ArithmeticException ae) {
//			System.out.println("��������Ϊ0");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("������˲��÷��ʵ�����");
//		}
		
		
		System.out.println("over");
	}

	// �����쳣�Ĵ���
	private static void method3() {
		int a = 20;
		int b = 0;
		int[] arr = { 1, 2, 3 };
		
		try {
			System.out.println(arr[3]);
			System.out.println(a / b);
//			System.out.println(arr[3]);
		} catch (ArithmeticException ae) {
			System.out.println("��������Ϊ0");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("������˲��÷��ʵ�����");
		}
		
		System.out.println("over");
	}

	// �����쳣
	private static void method2() {
		int a = 20;
		int b = 0;
		try {
			System.out.println(a / b); // ArithmeticException
		} catch (ArithmeticException ae) {
			System.out.println("��������Ϊ0");
		}

		int[] arr = { 1, 2, 3 };
		try {
		System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("������˲��÷��ʵ�����");
		}
		
		System.out.println("over");
	}

	// һ���쳣
	public static void method1() {
		// ��һ�׶Ρ�
		int a = 20;
//		int b = 2;
		int b = 0;
		try {
			System.out.println(a / b); // ArithmeticException
		} catch (ArithmeticException ae) {
			System.out.println("��������Ϊ0");
//			ae.printStackTrace();
		}

		// �ڶ��׶Ρ�
		System.out.println("over");
	}
}
