package demo02_����;

import java.util.Date;

/* 
 * public long getTime():��ȡʱ�䣬�Ժ���Ϊ��λ.
 * public void setTime(long time):����ʱ��
 * 
 *	 ��Date�õ�һ������ֵ
 *		getTime()
 *	��һ������ֵת��ΪDate
 *		���췽��
 *		setTime(Long time)
 */
public class DateDemo {
	
	public static void main(String[] args) {
		Date d = new Date();
		
		long time = d.getTime();
		System.out.println(time);
		// System.out.println(System.currentTimeMillis());
		
		System.out.println(d);
		// ����ʱ��
		d.setTime(1000);
		System.out.println(d);
		
	}

}
