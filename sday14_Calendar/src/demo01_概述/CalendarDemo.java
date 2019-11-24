package demo01_概述;

import java.util.Calendar;

/*
 * 一般被解释为日历类。
 * Calendar类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 
 * 	日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
 * 
 * public int get(int field)返回给定日历字段的值。
 * 		日历类中的每个日历字段都是静态的成员变量，并且都是int类型
 * 
 * 与其他语言环境敏感类一样，Calendar 提供了一个类方法 getInstance，以获得此类型的一个通用的对象。
 * 		Calendar 的 getInstance 方法返回一个 Calendar 对象，其日历字段已由当前日期和时间初始化： 
 * 
 * 	GregorianCalendar 是 Calendar 的一个具体子类，提供了世界上大多数国家/地区使用的标准日历系统。
 */
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();

		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH); // [0, 11]
		int date = rightNow.get(Calendar.DATE);

		System.out.println(year + "年" + (month + 1) + "月" + date + "日");

	}

}
