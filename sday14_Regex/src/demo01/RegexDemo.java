package demo01;

import java.util.Scanner;

/*
 * 如何教研一个QQ号码的案例
 * 	要求必须是5-15位数字
 * 	不能以0开头
 */
public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的QQ号码：");
		String qq = sc.nextLine();
		System.out.println("checkQQ:" + checkQQ(qq));

	}

	public static boolean checkQQ(String qq) {
		boolean flag = true;
		if (qq.length() >= 5 && qq.length() <= 15) { // 长度
			if (!qq.startsWith("0")) { // 不能以0开头
				char[] 	chs = qq.toCharArray();
				for (int i = 0; i < chs.length; i++) {
					char ch = chs[i];
					if(!Character.isDigit(ch)) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}

		return flag;
	}

}
