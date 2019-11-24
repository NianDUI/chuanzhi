package demo03Split;

/*
 * 分割功能
 * 	public String[] split(String regex)
 * 	根据给定正则表达式的匹配拆分此字符串。 
 * 		搜索范围：
 * 			性别：女
 * 			范围："18-24"
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
