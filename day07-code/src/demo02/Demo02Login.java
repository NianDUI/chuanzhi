package demo02;

import java.util.Scanner;

public class Demo02Login {

	public static void main(String[] args) {
		String registUsername = "admin";
		String registPassword = "123456";

		Scanner sc = new Scanner(System.in);

		System.out.print("请输入用户名：");
		String inputUsername = sc.next();
		System.out.print("请输入密码：");
		String inputPassword = sc.next();

		if (inputUsername.equalsIgnoreCase(registUsername) && inputPassword.equals(registPassword)) {
			System.out.println("登录成功！");
		} else {
			System.out.println("登录失败！");
		}
	}

}
