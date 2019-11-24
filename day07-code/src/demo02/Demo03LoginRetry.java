package demo02;

import java.util.Scanner;

public class Demo03LoginRetry {

	public static void main(String[] args) {
		String registUsername = "admin";
		String registPassword = "123456";

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {

			System.out.print("ÇëÊäÈëÓÃ»§Ãû£º");
			String inputUsername = sc.next();
			System.out.print("ÇëÊäÈëÃÜÂë£º");
			String inputPassword = sc.next();

			if (inputUsername.equalsIgnoreCase(registUsername) && inputPassword.equals(registPassword)) {
				System.out.println("µÇÂ¼³É¹¦£¡»¶Ó­Ê¹ÓÃ");
				break;
			} else {
				if (i == 3) {
					System.out.println("µÇÂ¼Ê§°Ü£¡ÖØÊÔ´ÎÊýºÄ¾¡£¡");
				} else {
					System.out.println("µÇÂ¼Ê§°Ü£¡Ê£ÓàµÇÂ¼´ÎÊý£º" + (3 - i) + ",ÇëÖØÊÔ");					
				}
			}
		}

	}

}
