package Demo03Lambda;

/*
 * Lambda���ʽ��Ҫʹ�ã�һ��Ҫ�к���ʽ�ӿڵ��ƶϻ�����
 * 1.Ҫôͨ�������Ĳ���������ȷ�����ĸ�����ʽ�ӿ�
 * 2.Ҫôͨ����ֵ������ȷ�����ĸ�����ʽ�ӿ� 
 * 
 * Lambda�ĸ�ʽ����Ϊ�˽����󷽷�������Ϊ�������㣺
 * 1.һЩ����������������
 * 2.һ����ͷ
 * 3.һЩ���루�����壩
 * 
  *  ������󷽷���
 * public abstract int sum(int a, int b);
 * 
 *  ����ΪLambda�ı�׼��ʽ��
 *  (int a, int b) -> { return a + b;}
 *  
 * 
 */
public class Demo03Lambda {

	public static void main(String[] args) {
		method(  (int a, int b) -> { return a + b;}  );
		System.out.println("===============");
		
		// һ�����Ը��ݸ�ֵ�����������������Lambda�������ƶ�
		Cal cal = (int a, int b) -> { return a + b;};
		method(cal);
//		(int a, int b) -> { return a + b;}; // ����д��
		
		
	}
	
	public static void method(Cal cal) {
		int result = cal.sum(10, 20);
		System.out.println("����ǣ�" + result);
	}
	
}
