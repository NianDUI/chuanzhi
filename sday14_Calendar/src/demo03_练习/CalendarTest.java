package demo03_练习;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 获取任意一年的二月有多少天？
 * 分析：
 * 	1、键盘录入任意的年份。
 *  2、设置日历对象的年月日。
 *  	年就是1输入的数据。
 *  	月是2 日时1（是三月一日）
 *  3、把时间往前推一天就是二月的最后一天。
 *  4、输出日期即可。
 */
public class CalendarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1); // 其实是是三月一日
		c.add(Calendar.DATE, -1);
		
		System.out.println(c.get(Calendar.DATE));
	}
	
}
