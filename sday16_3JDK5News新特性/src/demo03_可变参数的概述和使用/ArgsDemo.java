package demo03_�ɱ�����ĸ�����ʹ��;

/*
 * �ɱ������
 *  	���巽����ʱ��֪���ö�����ٸ�������
 *  ��ʽ��
 *  	���η� ����ֵ���� ������(��������... ������){}
 *  	ע�⣺
 *  		a:����ı�����ʵ������
 *  		b:���һ�������пɱ�����������ж��������
 *  		    ��ô�ɱ�����϶������һ����
 *  
 *  �ײ�Դ��������ʵ�֣�
 * 		�Ƚ���Ҫ���Ĳ�����װ��һ�����顣Ȼ������ĵ�ַ����������������������������
 *  
 *  Arrays�������е�һ������
 *    JDK1.5
 *  	public static <T> List<T> asList(T... a)
 *  		����һ����ָ������֧�ֵĹ̶���С���б�
 *    JDK1.4
 *  	public static List asList(Object[] a)
 */
public class ArgsDemo {
	public static void main(String[] args) {
		// �����������
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println("result:" + result);

		// ����������͡�
		int c = 30;
		result = sum(a, b, c);
		System.out.println("result:" + result);

		// 4��������͡�
		int d = 30;
		result = sum(a, b, c, d);
		System.out.println("result:" + result);
		
		// ������Ҫдһ����͵Ĺ��ܣ������Ǽ�������Ҫ����أ��Ҳ�̫�����
		// ������֪���ڵ��õ�ʱ���ҿ϶���֪���ˡ�
		// Ϊ����������⣬java���ṩ��һ���������ɱ������
		result = sum(a, b, c, d, 40);
		System.out.println("result:" + result);

		result = sum(a, b, c, d, 40, 50);
		System.out.println("result:" + result);
		
		result = sum();
		System.out.println("result:" + result); // 0
		
	}
	
	public static int sum(int... a) { // [I@2e5c649
//		System.out.println(a);
//		return 0;
		
		int s = 0;
		
		for (int i : a) {
			s += i;
		}
		
		return s;
	}

//	private static int sum(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}
//
//	private static int sum(int a, int b, int c) {
//		return a + b + c;
//	}
//
//	private static int sum(int a, int b) {
//		return a + b;
//	}

}
