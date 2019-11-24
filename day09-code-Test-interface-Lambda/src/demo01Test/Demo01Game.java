package demo01Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Demo01Game {

	public static void main(String[] args) throws IOException {
		long oldTime = System.currentTimeMillis();
		System.out.println();
		ArrayList<Hero> list = new ArrayList<>();
		
		loadFileToList(list);
		
		boolean isNew = list.isEmpty(); // 是否为空
		System.out.println("这是不是新队伍：" + isNew);

		if (isNew) {
			addFiveHeros(list);
		}

		System.out.println("我们队伍的阵容是：");

		showHeros(list);

		int totalAttack = getTotalAttack(list); // 总战斗力
		System.out.println("我们队伍的总战斗力是:" + totalAttack);

		if (isNew) {
			saveToFile(list);
		}
		System.out.println("退出游戏");
		System.out.println(System.currentTimeMillis() - oldTime);
	}

	private static void addFiveHeros(ArrayList<Hero> list) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("请输入第" + (i + 1) + "位英雄的姓名：");
			String name = sc.next();
			System.out.print("请输入第" + (i + 1) + "位英雄的攻击力：");
			int attack = sc.nextInt();
			System.out.print("请输入第" + (i + 1) + "位英雄的类型：");
			String type = sc.next();

			Hero hero = new Hero(name, attack, type);
			list.add(hero);
		}
	}

	private static void showHeros(ArrayList<Hero> list) {
		Iterator<Hero> it = list.iterator();
		while (it.hasNext()) {
			Hero hero = (Hero) it.next();
			System.out.println("英雄的名字：" + hero.getName() + "，攻击力：" + hero.getAttack() + "，类型：" + hero.getType());
		}
	}

	private static int getTotalAttack(ArrayList<Hero> list) {
		Iterator<Hero> it = list.iterator();
		int total = 0;
		while (it.hasNext()) {
			total += it.next().getAttack();
		}
		return total;
	}

	private static void loadFileToList(ArrayList<Hero> list) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("friends.txt"));

		String line;
		while ((line = br.readLine()) != null) {
			String[] array = line.split(",");
			String name = array[0];
			int attack = Integer.parseInt(array[1]);
			String type = array[2];
			Hero hero = new Hero(name, attack, type);
			list.add(hero);
		}
		br.close();
	}

	private static void saveToFile(ArrayList<Hero> list) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("friends.txt"));

		Iterator<Hero> it = list.iterator();
		while (it.hasNext()) {
			Hero hero = (Hero) it.next();
			String str = hero.getName() + "," + hero.getAttack() + "," + hero.getType();
			bw.write(str);
			bw.newLine();
		}
		bw.close();
	}

}
