package demo02;

import java.util.Scanner;

public class Demo02Login {

	public static void main(String[] args) {
		String registUsername = "admin";
		String registPassword = "123456";

		Scanner sc = new Scanner(System.in);

		System.out.print("�������û�����");
		String inputUsername = sc.next();
		System.out.print("���������룺");
		String inputPassword = sc.next();

		if (inputUsername.equalsIgnoreCase(registUsername) && inputPassword.equals(registPassword)) {
			System.out.println("��¼�ɹ���");
		} else {
			System.out.println("��¼ʧ�ܣ�");
		}
	}

}
