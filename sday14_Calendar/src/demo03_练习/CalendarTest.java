package demo03_��ϰ;

import java.util.Calendar;
import java.util.Scanner;

/*
 * ��ȡ����һ��Ķ����ж����죿
 * ������
 * 	1������¼���������ݡ�
 *  2��������������������ա�
 *  	�����1��������ݡ�
 *  	����2 ��ʱ1��������һ�գ�
 *  3����ʱ����ǰ��һ����Ƕ��µ����һ�졣
 *  4��������ڼ��ɡ�
 */
public class CalendarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1); // ��ʵ��������һ��
		c.add(Calendar.DATE, -1);
		
		System.out.println(c.get(Calendar.DATE));
	}
	
}
