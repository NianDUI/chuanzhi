package demo02_���췽��;

/*
 * Integer�Ĺ��췽��
 * public Integer(int value)����һ���·���� Integer ��������ʾָ���� int ֵ�� 
 * public Integer(String s)����һ���·���� Integer ��������ʾ String ������ָʾ�� int ֵ
 * 		ע������ַ����������������ַ���ɡ�
 */
public class IntegerDemo {

	public static void main(String[] args) {
		// ��ʽһ��
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println(ii);
		
		// ��ʽ����
		String s = "100";
		// java.lang.NumberFormatException
//		String s = "abc";
		Integer iii = new Integer(s);
		System.out.println(iii);
		
	}
	
}
