package demo02_����10��1��20֮��������Ҫ������������ظ�����;

import java.util.ArrayList;
import java.util.Random;

/*
 * ����10��1��20֮��������,Ҫ������������ظ�����
 * 
 *  ������ʵ�֣���������ĳ����ǹ̶��ģ����Ȳ���ȷ����
 *  ��������ʹ�ü���ʵ�֣�
 *  
 *  ������
 *  	a:��������������Ķ���
 *  	b:����һ���洢������ļ��ϡ�
 *  	c:����һ��ͳ�Ʊ�������0��ʼ��
 *  	d:�ж�ͳ�Ʊ����Ƿ�С��10
 *  		�ǣ��Ȳ���һ����������жϸ�������˼������Ƿ���ڡ�
 *  			��������ڣ�����ӣ�ͳ�Ʊ���++��
 *  			������ڣ��Ͳ�������
 *  		�񣺲�������
 *  	e:��������
 *  
 */
public class RandomDmeo {
	public static void main(String[] args) {
		// ��������������Ķ���
		Random r = new Random();

		// ����һ���洢������ļ���
		ArrayList<Integer> array = new ArrayList<Integer>();

		// ����һ��ͳ�Ʊ�������0��ʼ��
		int count = 0;

		// �ж�ͳ�Ʊ����Ƿ�С��10
		while (count < 10) {
			// ����һ�������
			int number = r.nextInt(20) + 1;

			// �жϸ�������˼������Ƿ����
			if (!array.contains(number)) {
				// ��������ڣ�����ӣ�ͳ�Ʊ���++��
				array.add(number);
				count++;
			}
		}

		// ��������
		for (Integer i : array) {
			System.out.println(i);
		}
	}
}
