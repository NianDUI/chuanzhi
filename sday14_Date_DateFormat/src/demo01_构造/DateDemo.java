package demo01_����;

import java.util.Date;

/*
 * Date: ��ʾ�ض���˲�䣬��ȷ�����롣
 * 
 * ���췽����
 * 	Date() �����ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���
 * 	Date(long date) �����ݸ����ĺ���ֵ�����������
 * 
 */
public class DateDemo {
	
	public static void main(String[] args) {
		//
		Date d = new Date();
		System.out.println(d);
		
		// 
//		long time = System.currentTimeMillis();
		long time = 1000 * 60 * 60 ; // һ��Сʱ,������
		Date d2 = new Date(time);
		System.out.println(d2);
	}

}
