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
		
		boolean isNew = list.isEmpty(); // �Ƿ�Ϊ��
		System.out.println("���ǲ����¶��飺" + isNew);

		if (isNew) {
			addFiveHeros(list);
		}

		System.out.println("���Ƕ���������ǣ�");

		showHeros(list);

		int totalAttack = getTotalAttack(list); // ��ս����
		System.out.println("���Ƕ������ս������:" + totalAttack);

		if (isNew) {
			saveToFile(list);
		}
		System.out.println("�˳���Ϸ");
		System.out.println(System.currentTimeMillis() - oldTime);
	}

	private static void addFiveHeros(ArrayList<Hero> list) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("�������" + (i + 1) + "λӢ�۵�������");
			String name = sc.next();
			System.out.print("�������" + (i + 1) + "λӢ�۵Ĺ�������");
			int attack = sc.nextInt();
			System.out.print("�������" + (i + 1) + "λӢ�۵����ͣ�");
			String type = sc.next();

			Hero hero = new Hero(name, attack, type);
			list.add(hero);
		}
	}

	private static void showHeros(ArrayList<Hero> list) {
		Iterator<Hero> it = list.iterator();
		while (it.hasNext()) {
			Hero hero = (Hero) it.next();
			System.out.println("Ӣ�۵����֣�" + hero.getName() + "����������" + hero.getAttack() + "�����ͣ�" + hero.getType());
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
