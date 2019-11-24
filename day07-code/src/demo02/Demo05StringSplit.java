package demo02;

/*
 * 字符串按照指定标记切分成若干段
 * public String[] split(String regex) regex作为切割的标记
 * 现阶段尽量不要使用英文句点作为分割的标记。
 * 应为英文句点在正则表达式中有特殊的含义。
 * 而参数regex其实就是一个正则表达式。
 * 英文句点代表任意字符
 * 如果一点要使用英文句点，切割标记应该使用“\\.”
 */
public class Demo05StringSplit {

	public static void main(String[] args) {
		String str1 = "AAA,BBB,CCC,DDD";
		String[] array = str1.split(",");
		System.out.println("数组长度" + array.length);
		for (String s : array) {
			System.out.println(s);
		}
		
		
		String str2 = "AA.BB.CC.DD";
		String[] array2 = str2.split(".");
		System.out.println("数组长度" + array2.length);
		for (String s : array2) {
			System.out.println(s);
		}
		String[] array3 = str2.split("\\.");
		System.out.println("数组长度" + array3.length);
		for (String s : array3) {
			System.out.println(s);
		}
	}
	
}
