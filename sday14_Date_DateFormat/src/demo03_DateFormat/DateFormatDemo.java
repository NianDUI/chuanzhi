package demo03_DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date -- String(格式化)
 * 		public final String format(Date date)将一个 Date 格式化为日期/时间字符串。 
 * String -- Date(解析)
 * 		public Date parse(String source)从给定字符串的开始解析文本，以生成一个日期。
 * 
 * DateFormat:是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
 * 		日期/时间格式化子类（如 SimpleDateFormat）允许进行格式化（也就是日期 -> 文本）、
 * 		解析（文本-> 日期）和标准化。
 * 
 * SimpleDateFormat的构造方法：
 * 		SimpleDateFormat()默认的模式
 * 		SimpleDateFormat(String pattern) 给定的模式
 * 			这个模式字符串该怎么写呢？
 * 			通过查看api，我们就找到了对应的模式。
 * 			年y 月M 日d 时H 分m 秒s
 * 			
 * 			2018年12月12日 12:12:12。
 * 
 */
public class DateFormatDemo {
	
	public static void main(String[] args) throws ParseException {
		// 创建日期对象。
		Date d = new Date();
		// 创建格式化对象。
//		SimpleDateFormat sdf = new SimpleDateFormat();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		// public final String format(Date date)将一个 Date 格式化为日期/时间字符串。 
		String s = sdf.format(d);
		System.out.println(s);
		
		// String -- Date
		String str = "2008-08-08 12:12:12";
		// 在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配。
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date  dd = sdf2.parse(str); // throws ParseException 
		System.out.println(dd);
		
	}

}
