package demo.game;

import java.util.Scanner;

/**
 * ����һ�������ֵ�С��Ϸ��
 * 
 * @author 1
 * @version V1.0
 *
 */
public class GuessNumber {
	private GuessNumber() {
	}

	@SuppressWarnings("resource")
	public static void start() {
		// ����һ���������
		int number = (int) (Math.random() * 100) + 1;

		// ����һ��ͳ�Ʊ�����
		int count = 0;

		while (true) {
			// ����¼��һ������
			Scanner sc = new Scanner(System.in);
			System.out.println("������һ������(1-100)��");
			int guessNumber = sc.nextInt();

			count++;

			// �ж�
			if (guessNumber > number) {
				System.out.println("��µ�����" + guessNumber + "���ˡ�");
			} else if (guessNumber < number) {
				System.out.println("��µ�����" + guessNumber + "С�ˡ�");
			} else {
				System.out.println("��ϲ�㣬" + count + "�ξͲ�����");
				break;
			}
		}

	}
}
