package demo02;

/*
 * �ַ�������ָ������зֳ����ɶ�
 * public String[] split(String regex) regex��Ϊ�и�ı��
 * �ֽ׶ξ�����Ҫʹ��Ӣ�ľ����Ϊ�ָ�ı�ǡ�
 * ӦΪӢ�ľ����������ʽ��������ĺ��塣
 * ������regex��ʵ����һ��������ʽ��
 * Ӣ�ľ����������ַ�
 * ���һ��Ҫʹ��Ӣ�ľ�㣬�и���Ӧ��ʹ�á�\\.��
 */
public class Demo05StringSplit {

	public static void main(String[] args) {
		String str1 = "AAA,BBB,CCC,DDD";
		String[] array = str1.split(",");
		System.out.println("���鳤��" + array.length);
		for (String s : array) {
			System.out.println(s);
		}
		
		
		String str2 = "AA.BB.CC.DD";
		String[] array2 = str2.split(".");
		System.out.println("���鳤��" + array2.length);
		for (String s : array2) {
			System.out.println(s);
		}
		String[] array3 = str2.split("\\.");
		System.out.println("���鳤��" + array3.length);
		for (String s : array3) {
			System.out.println(s);
		}
	}
	
}
