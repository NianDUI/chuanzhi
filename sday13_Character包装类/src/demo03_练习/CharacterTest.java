package demo03_��ϰ;

import java.util.Scanner;

/*
 * ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����
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
