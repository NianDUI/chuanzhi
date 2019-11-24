package demo04_模拟斗地主洗牌和发牌并对牌进行排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 *  思路：
 *  	a:创建一个HashMap集合
 *   	B:创建一个ArrayList集合
 *   	c:创建花色数组和点数数组
 *   	d:从0开始往HashMap存储编号，并存储对应的牌
 *   		同时在ArrayList里面存储编号即可
 *   	e:洗牌（洗的是编号）
 *   	f:发牌（发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收。）
 *     	g:看牌（遍历TreeSet集合，获取编号，到HashMap集合照对应的牌）
 */
public class PokerDemo {
	public static void main(String[] args) {
		// a:创建一个HashMap集合
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// B:创建一个ArrayList集合
		ArrayList<Integer> array = new ArrayList<Integer>();

		// c:创建花色数组和点数数组
		// 定义一个花色数组
		String[] colors = { "♠", "♥", "♣", "♦" };
		// 定义一个点数数组
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };

		// d:从0开始往HashMap存储编号，并存储对应的牌，同时在ArrayList里面存储编号即可
		int index = 0;
		for (String number : numbers) {
			for (String color : colors) {
				String poker = color.concat(number);
				hm.put(index, poker);
				array.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		array.add(index);
		index++;
		hm.put(index, "大王");
		array.add(index);

		// e:洗牌（洗的是编号）
		Collections.shuffle(array);

		// f:发牌（发的也是编号，为了保证编号是排序的，就创建TreeSet集合接收。）
		TreeSet<Integer> fengQingYang = new TreeSet<Integer>();
		TreeSet<Integer> linQingXia = new TreeSet<Integer>();
		TreeSet<Integer> liuYi = new TreeSet<Integer>();
		TreeSet<Integer> diPai = new TreeSet<Integer>();

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

		// g:看牌（遍历TreeSet集合，获取编号，到HashMap集合照对应的牌）
		lookPoker("风清扬", fengQingYang, hm);
		lookPoker("林青霞", linQingXia, hm);
		lookPoker("刘意", liuYi, hm);

		lookPoker("底牌", diPai, hm);

	}

	public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
		System.out.print(name + "的牌是：");
		for (Integer key : ts) {
			String value = hm.get(key);
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
