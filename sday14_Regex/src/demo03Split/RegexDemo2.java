package demo03Split;

public class RegexDemo2 {

	public static void main(String[] args) {
		String s1 = "aa,bb,cc";
		String[] str1Array = s1.split(",");
		for (String s : str1Array) {
			System.out.println(s);
		}
		System.out.println("-----------------");

		String s2 = "aa.bb.cc";
		String[] str2Array = s2.split("\\.");
		for (String s : str2Array) {
			System.out.println(s);
		}
		System.out.println("-----------------");

		String s3 = "aa      bb                ccdd";
		String[] str3Array = s3.split(" +");
		for (String s : str3Array) {
			System.out.println(s);
		}
		System.out.println("-----------------");
		

		String s4 = "F:\\��Դ\\��������̳�\\Java������Ƶ-����ǳ����������Ƶ\\day14";
		String[] str4Array = s4.split("\\\\"); // ��Ϊ������������б��
		for (String s : str4Array) {
			System.out.println(s);
		}
		System.out.println("-----------------");
	}

}
