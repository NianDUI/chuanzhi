package demo05_练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 算一下你来到这个世界多少天？
 * 
 * 
 * 
 */
public class MyYearOldMDemo {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的出生年月日：");
		String line = sc.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(line);
		long myTime = d.getTime();
		long nowTime = System.currentTimeMillis();
		long time = nowTime - myTime;
		long day = time / 1000 / 60 / 60 / 24;
		System.out.println("你来到这个世界：" + day + "天");
		
	}

}
