package demo03_DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date -- String(��ʽ��)
 * 		public final String format(Date date)��һ�� Date ��ʽ��Ϊ����/ʱ���ַ����� 
 * String -- Date(����)
 * 		public Date parse(String source)�Ӹ����ַ����Ŀ�ʼ�����ı���������һ�����ڡ�
 * 
 * DateFormat:������/ʱ���ʽ������ĳ����࣬�����������޹صķ�ʽ��ʽ�����������ڻ�ʱ�䡣
 * 		����/ʱ���ʽ�����ࣨ�� SimpleDateFormat��������и�ʽ����Ҳ�������� -> �ı�����
 * 		�������ı�-> ���ڣ��ͱ�׼����
 * 
 * SimpleDateFormat�Ĺ��췽����
 * 		SimpleDateFormat()Ĭ�ϵ�ģʽ
 * 		SimpleDateFormat(String pattern) ������ģʽ
 * 			���ģʽ�ַ�������ôд�أ�
 * 			ͨ���鿴api�����Ǿ��ҵ��˶�Ӧ��ģʽ��
 * 			��y ��M ��d ʱH ��m ��s
 * 			
 * 			2018��12��12�� 12:12:12��
 * 
 */
public class DateFormatDemo {
	
	public static void main(String[] args) throws ParseException {
		// �������ڶ���
		Date d = new Date();
		// ������ʽ������
//		SimpleDateFormat sdf = new SimpleDateFormat();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		// public final String format(Date date)��һ�� Date ��ʽ��Ϊ����/ʱ���ַ����� 
		String s = sdf.format(d);
		System.out.println(s);
		
		// String -- Date
		String str = "2008-08-08 12:12:12";
		// �ڰ�һ���ַ�������Ϊ���ڵ�ʱ����ע���ʽ����͸������ַ�����ʽƥ�䡣
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date  dd = sdf2.parse(str); // throws ParseException 
		System.out.println(dd);
		
	}

}
