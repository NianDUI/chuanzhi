package demo02_方法;

import java.util.Date;

/* 
 * public long getTime():获取时间，以毫秒为单位.
 * public void setTime(long time):设置时间
 * 
 *	 从Date得到一个毫秒值
 *		getTime()
 *	把一个毫秒值转换为Date
 *		构造方法
 *		setTime(Long time)
 */
public class DateDemo {
	
	public static void main(String[] args) {
		Date d = new Date();
		
		long time = d.getTime();
		System.out.println(time);
		// System.out.println(System.currentTimeMillis());
		
		System.out.println(d);
		// 设置时间
		d.setTime(1000);
		System.out.println(d);
		
	}

}
