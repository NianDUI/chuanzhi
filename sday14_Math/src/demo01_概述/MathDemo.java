package demo01_����;

/*
 * Math��������ѧ������ࡣ
 * ��Ա������
 * 	public static final double E���κ�����ֵ�����ӽ� e������Ȼ�����ĵ������� double ֵ�� 
 * 	public static final double PI���κ�����ֵ�����ӽ� pi����Բ���ܳ���ֱ��֮�ȣ��� double ֵ�� 
 * 
 * 
 * ��Ա������
 * 	public static int abs(int a)���� int ֵ�ľ���ֵ��
 * 		������͵Ĳ���
 * 	public static double ceil(double a) ����ȡ�������컨�壩 ������С�ģ���ӽ��������double ֵ����ֵ���ڵ��ڲ�����������ĳ��������
 * 	public static double floor(double a) ����ȡ�������ذ壩 �������ģ���ӽ��������double ֵ����ֵС�ڵ��ڲ�����������ĳ��������
 * 	public static int max(int a, int b) �ϴ�ֵ�� �������� int ֵ�нϴ��һ����
 * 	public static int min(int a, int b) ��Сֵ�� �������� int ֵ�н�С��һ����
 * 	public static double pow(double a, double b)���ص�һ�������ĵڶ����������ݵ�ֵ��
 * 	public static double random() ���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0��[0.0, 1.0)
 * 	public static int round(float a) �������� ������double��ѧ����
 * public static long round(double a) �������� ������ӽ������� long��
 * 	public static double sqrt(double a) ��ƽ���� ��������ȷ����� double ֵ����ƽ������
 * 
 */
public class MathDemo {
	
	public static void main(String[] args) {
		System.out.println(Math.PI);
		
		System.out.println(Math.E);
		System.out.println("--------------");
		
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println("--------------");
		

		System.out.println(Math.ceil(12.34));
		System.out.println(Math.ceil(12.56));
		System.out.println("--------------");
		
		System.out.println(Math.floor(12.34));
		System.out.println(Math.floor(12.56));
		System.out.println("--------------");
		

		System.out.println(Math.max(12, 23));
		// ��Ҫ��ȡ���������е����ֵ��������Ƕ�׵��á�
		System.out.println(Math.max(Math.max(12, 23), 18));
		// ��Ҫ��ȡ�ĸ� �����е����ֵ
		System.out.println(Math.max(Math.max(12, 23), Math.max(78, 56)));
		System.out.println("--------------");

		System.out.println(Math.pow(2, 3));
		System.out.println("--------------");

		System.out.println(Math.random()); // [0.0, 1.0)
		// ��ȡһ��һ��100֮����������
		System.out.println((int) (Math.random() * 100) +1);
		System.out.println("--------------");

		// �������롣
		System.out.println(Math.round(12.34F));
		System.out.println(Math.round(12.56F));
		System.out.println("--------------");
		
		// ��ƽ������
		System.out.println(Math.sqrt(4));
		System.out.println("--------------");
		
		
		
	}

}
