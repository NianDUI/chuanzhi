package demo05PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  获取功能:获取下面这个字符串中由5个字符组成的单词
 * Saudi journalist Jamal Khashoggi was killed in a "fistfight" in the Saudi Consulate in Istanbul, the kingdom said early Saturday, acknowledging the writer's death for the first time. 
 */
public class RegexDemo2 {
	
	public static void main(String[] args) {
		String s = "Saudi journalist Jamal Khashoggi was "
				+ "killed in a fistfight in the Saudi Cons"
				+ "ulate in Istanbul, the kingdom said early "
				+ "Saturday, acknowledging the writer's death "
				+ "for the first time." ;
		Pattern p = Pattern.compile("\\b\\w{5}\\b");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
		}
		// 注意：一定要先find(),然后才能group()
		// IllegalStateException: No match found
//		System.out.println(m.group()); // 错误
	}

}
