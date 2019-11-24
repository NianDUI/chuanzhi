package demo03_练习;

import java.util.Scanner;

/*
 * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。
 */
public class CharacterTest {

	public static void main(String[] args) {
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		for (char ch : line.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				bigCount++;
			} else if (Character.isLowerCase(ch)) {
				smallCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			}
		}
		System.out.println(bigCount);
		System.out.println(smallCount);
		System.out.println(numberCount);
	}
	
}
