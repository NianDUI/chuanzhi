package demo02mathes;

import java.util.Scanner;

/*
 * �жϹ���
 * 	public boolean matches(String regex)
 * 	��֪���ַ����Ƿ�ƥ�������������ʽ�� 
 * 
 */
public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ֻ����룺");
		String phone = sc.nextLine();

		String regex = "1[1-9]\\d{9}";
		boolean flag = phone.matches(regex);
		System.out.println("flag:" + flag);

	}

}
