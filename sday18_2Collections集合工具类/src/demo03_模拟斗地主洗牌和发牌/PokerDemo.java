package demo03_模拟斗地主洗牌和发牌;

import java.util.ArrayList;
import java.util.Collections;

/*
 *  模拟斗地主洗牌和发牌
 *  
 *  分析：
 *  	a:创建一个牌盒
 *  	b:装牌
 *  	c:洗牌
 *  	e:发牌
 *  	f:看牌
 *  
 */
public class PokerDemo {
	public static void main(String[] args) {
		// a:创建一个牌盒
		ArrayList<String> array = new ArrayList<String>();

		// 黑桃A-K
		// 红桃A-K
		// 梅花...
		// 方块...
		// 定义一个花色数组
		String[] colors = { "♠", "♥", "♣", "♦" };
		// 定义一个点数数组
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		// b:装牌
		for (String color : colors) {
			for (String number : numbers) {
				array.add(color.concat(number));
			}
		}
		array.add("小王");
		array.add("大王");

//		System.out.println("array:" + array);

		// c:洗牌
		Collections.shuffle(array);

//		System.out.println("array:" + array);

		// e:发牌
		ArrayList<String> fengQingYang = new ArrayList<String>();
		ArrayList<String> linQingXia = new ArrayList<String>();
		ArrayList<String> liuYi = new ArrayList<String>();
		ArrayList<String> diPai = new ArrayList<String>();

		for (int i = 0; i < array.size(); i++) {
			if (i >= array.size() - 3) {
				diPai.add(array.get(i));
			} else if (i % 3 == 0) {
				fengQingYang.add(array.get(i));
			} else if (i % 3 == 1) {
				linQingXia.add(array.get(i));
			} else if (i % 3 == 2) {
				liuYi.add(array.get(i));
			}
		}

		// f:看牌
		lookPoker("风清扬", fengQingYang);
		lookPoker("林青霞", linQingXia);
		lookPoker("刘意", liuYi);

		lookPoker("底牌", diPai);
	}

	public static void lookPoker(String name, ArrayList<String> array) {
		System.out.print(name + "的牌是：");
		for (String s : array) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
