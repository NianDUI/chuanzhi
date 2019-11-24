package demo02_����;

import java.util.Calendar;

/*
 * public abstract void add(int field, int amount)
 * 	���������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ������
 * 	���磬Ҫ�ӵ�ǰ����ʱ���ȥ 5 �죬����ͨ���������·���������һ��:add(Calendar.DAY_OF_MONTH, -5)�� 
 * public final void set(int year, int month, int date)
 * 	���������ֶ� YEAR��MONTH �� DAY_OF_MONTH ��ֵ���������������ֶ���ǰ��ֵ
 * 
 */
public class CalendarDemo {

	public static void main(String[] args) {
		// ��ȡ��ǰ������ʱ�䡣
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH); // [0, 11]
		int date = c.get(Calendar.DATE);
		System.out.println(year + "��" + (month + 1) + "��" + date + "��");

//		// ����ǰ�Ľ��죬
//		c.add(Calendar.YEAR, -3);
//		year = c.get(Calendar.YEAR);
//		month = c.get(Calendar.MONTH); // [0, 11]
//		date = c.get(Calendar.DATE);
//		System.out.println(year + "��" + (month + 1) + "��" + date + "��");

		// ������ʮ��ǰ��
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DATE, -10);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH); // [0, 11]
		date = c.get(Calendar.DATE);
		System.out.println(year + "��" + (month + 1) + "��" + date + "��");
		
		c.set(2011, 11, 11);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH); // [0, 11]
		date = c.get(Calendar.DATE);
		System.out.println(year + "��" + (month + 1) + "��" + date + "��");

		c.add(Calendar.MONTH, 1);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH); // [0, 11]
		date = c.get(Calendar.DATE);
		System.out.println(year + "��" + (month + 1) + "��" + date + "��");
		
		c.add(Calendar.YEAR, -3);
		System.out.println(c.getTimeInMillis());
		c.add(Calendar.YEAR, -2);
		System.out.println(c.getTimeInMillis());
		c.add(Calendar.YEAR, 7);
		System.out.println(c.getTimeInMillis());
	}

}
