package demo02mathes;

import java.util.Scanner;

/*
 * 判断功能
 * 	public boolean matches(String regex)
 * 	告知此字符串是否匹配给定的正则表达式。 
 * 
 */
public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入手机号码：");
		String phone = sc.nextLine();

		String regex = "1[1-9]\\d{9}";
		boolean flag = phone.matches(regex);
		System.out.println("flag:" + flag);

	}

}
