package demo01_����;

/*
 * ������д����� ��������������һ��㲻һ��������Ϊfloat�����͵����ݴ洢��������һ�����µġ�
 * 					���Ǵ󲿷ֵ�ʱ�򣬶��Ǵ�����Ч����λ��
 * 
 * �����������ʱ��float���ͺ�double���ͺ����׶�ʧ���ȣ�����ʾ����������Ϊ���ܾ�ȷ�ر�ʾ�����㸡������
 * 		Java�ṩ��BigDecimal�ࡣ
 * 
 * BigDecimal�ࣺ���ɱ�ġ����⾫�ȵ��з���ʮ�����������Խ�����ݶ�ʧ���⡣
 * 
 * 
 */
public class BigDecimalDemo {
	
	public static void main(String[] args) {
		// ��������
		System.out.println(0.09 + 0.01); // 0.09999999999999999
		System.out.println(1.0 - 0.32); // 0.6799999999999999
		System.out.println(1.015 * 100); // 101.49999999999999
		System.out.println(1.301 / 100); // 0.013009999999999999
		
		System.out.println(1.0 - 0.12); // 0.88
	}

}
