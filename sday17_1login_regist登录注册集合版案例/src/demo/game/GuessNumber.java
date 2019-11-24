package demo.game;

import java.util.Scanner;

/**
 * 这是一个猜数字的小游戏。
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
		// 产生一个随机数。
		int number = (int) (Math.random() * 100) + 1;

		// 定义一个统计变量。
		int count = 0;

		while (true) {
			// 键盘录入一个数据
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个数据(1-100)：");
			int guessNumber = sc.nextInt();

			count++;

			// 判断
			if (guessNumber > number) {
				System.out.println("你猜的数据" + guessNumber + "大了。");
			} else if (guessNumber < number) {
				System.out.println("你猜的数据" + guessNumber + "小了。");
			} else {
				System.out.println("恭喜你，" + count + "次就猜中了");
				break;
			}
		}

	}
}
