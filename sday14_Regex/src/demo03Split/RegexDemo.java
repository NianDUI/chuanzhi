package demo03Split;

/*
 * �ָ��
 * 	public String[] split(String regex)
 * 	���ݸ���������ʽ��ƥ���ִ��ַ����� 
 * 		������Χ��
 * 			�Ա�Ů
 * 			��Χ��"18-24"
 */
public class RegexDemo {
	
	public static void main(String[] args) {
		String ages = "18-24";
		
		String regex = "-";
		
		String[] strArray = ages.split(regex);
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(Integer.parseInt(strArray[i]));
		}
//		int startAge = Integer.parseInt(strArray[0]);
//		int endAge = Integer.parseInt(strArray[1]);
		
		
	}

}
