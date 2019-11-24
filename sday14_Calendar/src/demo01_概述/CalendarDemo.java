package demo01_����;

import java.util.Calendar;

/*
 * һ�㱻����Ϊ�����ࡣ
 * Calendar����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �� 
 * 	�����ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
 * 
 * public int get(int field)���ظ��������ֶε�ֵ��
 * 		�������е�ÿ�������ֶζ��Ǿ�̬�ĳ�Ա���������Ҷ���int����
 * 
 * ���������Ի���������һ����Calendar �ṩ��һ���෽�� getInstance���Ի�ô����͵�һ��ͨ�õĶ���
 * 		Calendar �� getInstance ��������һ�� Calendar �����������ֶ����ɵ�ǰ���ں�ʱ���ʼ���� 
 * 
 * 	GregorianCalendar �� Calendar ��һ���������࣬�ṩ�������ϴ��������/����ʹ�õı�׼����ϵͳ��
 */
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();

		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH); // [0, 11]
		int date = rightNow.get(Calendar.DATE);

		System.out.println(year + "��" + (month + 1) + "��" + date + "��");

	}

}
