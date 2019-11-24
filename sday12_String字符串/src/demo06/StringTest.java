package demo06;

public class StringTest {
	
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hel";
		// 前面一样，输出多余的字符数
		System.out.println(s1.compareTo(s2)); // 2
	}

}
