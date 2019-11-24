package demo02_方法;

import java.util.Calendar;

/*
 * public abstract void add(int field, int amount)
 * 	根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 * 	例如，要从当前日历时间减去 5 天，可以通过调用以下方法做到这一点:add(Calendar.DAY_OF_MONTH, -5)。 
 * public final void set(int year, int month, int date)
 * 	设置日历字段 YEAR、MONTH 和 DAY_OF_MONTH 的值。保留其他日历字段以前的值
 * 
 */
public class CalendarDemo {

	public static void main(String[] args) {
		// 获取当前的日历时间。
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH); // [0, 11]
		int date = c.get(Calendar.DATE);
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");

//		// 三年前的今天，
//		c.add(Calendar.YEAR, -3);
//		year = c.get(Calendar.YEAR);
//		month = c.get(Calendar.MONTH); // [0, 11]
//		date = c.get(Calendar.DATE);
//		System.out.println(year + "年" + (month + 1) + "月" + date + "日");

		// 五年后的十天前。
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DATE, -10);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH); // [0, 11]
		date = c.get(Calendar.DATE);
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");
		
		c.set(2011, 11, 11);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH); // [0, 11]
		date = c.get(Calendar.DATE);
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");

		c.add(Calendar.MONTH, 1);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH); // [0, 11]
		date = c.get(Calendar.DATE);
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");
		
		c.add(Calendar.YEAR, -3);
		System.out.println(c.getTimeInMillis());
		c.add(Calendar.YEAR, -2);
		System.out.println(c.getTimeInMillis());
		c.add(Calendar.YEAR, 7);
		System.out.println(c.getTimeInMillis());
	}

}
