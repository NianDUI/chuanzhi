package demo04_DateUtil������;

import java.text.ParseException;
import java.util.Date;

/*
 * 	������Ĳ���
 */
public class DateUtilDemo {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		String s = DateUtil.dateToString(d, "yyyy-MM-dd HH:mm:ss");
		System.out.println(s);
		
		Date dd = DateUtil.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
		System.out.println(dd);
	}
	
}
