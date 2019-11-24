package demo04_����ת��;

/*
 * ��������ת��
 * public static String toBinaryString(int i)
 * public static String toOctalString(int i)
 * public static String toHexString(int i)
 * 
 * ʮ���Ƶ���������
 * public static String toString(int i, int radix)
 * ���Ƶķ�Χ��2-36
 * Ϊʲô�أ�0,...9,a...z����36��
 * 
 * �������Ƶ�ʮ����
 * public static int parseInt(String s, int radix)

 */
public class IntegerDemo {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println("-----------------");

		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, -7)); // 100
		System.out.println(Integer.toString(100, 70)); // 100
		System.out.println(Integer.toString(100, 1)); // 100
		System.out.println("-----------------");

		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("4f", 16));
		System.out.println(Integer.parseInt("100", 23));
		// NumberFormatException
//		System.out.println(Integer.parseInt("123", 2));

	}

}
