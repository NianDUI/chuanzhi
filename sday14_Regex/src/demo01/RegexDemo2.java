package demo01;

import java.util.Scanner;

public class RegexDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的QQ号码：");
		String qq = sc.nextLine();
		System.out.println("checkQQ:" + checkQQ(qq));

	}

	public static boolean checkQQ(String qq) {
		// public boolean matches(String regex)
		// 告知此字符串是否匹配给定的正则表达式
//		String regex = "[1-9][0-9]{4,14}";
//		return qq.matches(regex);
//		return qq.matches("[1-9][0-9]{4,14}");
		return qq.matches("[1-9]\\d{4,14}");
	}
}
