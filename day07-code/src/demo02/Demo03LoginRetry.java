package demo02;

import java.util.Scanner;

public class Demo03LoginRetry {

	public static void main(String[] args) {
		String registUsername = "admin";
		String registPassword = "123456";

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {

			System.out.print("�������û�����");
			String inputUsername = sc.next();
			System.out.print("���������룺");
			String inputPassword = sc.next();

			if (inputUsername.equalsIgnoreCase(registUsername) && inputPassword.equals(registPassword)) {
				System.out.println("��¼�ɹ�����ӭʹ��");
				break;
			} else {
				if (i == 3) {
					System.out.println("��¼ʧ�ܣ����Դ����ľ���");
				} else {
					System.out.println("��¼ʧ�ܣ�ʣ���¼������" + (3 - i) + ",������");					
				}
			}
		}

	}

}
