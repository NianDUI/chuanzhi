package demo05PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ����
 * 		Pattern��Matcher���ʹ��
 */
public class RegexDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaab");
		boolean b = m.matches();
		System.out.println(b);
	}

}
