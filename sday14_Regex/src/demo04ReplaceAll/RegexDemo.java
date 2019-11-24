package demo04ReplaceAll;

public class RegexDemo {
	
	public static void main(String[] args) {
		String s = "Helloqq123245654Worldkh62170001300004654Java";
////		String regex = "\\d+";
//		String regex = "\\d";
//		String ss = "*";
		
		String regex = "\\d+";
		String ss = "";
		
		String result = s.replaceAll(regex, ss);
		System.out.println(result);
	}

}
