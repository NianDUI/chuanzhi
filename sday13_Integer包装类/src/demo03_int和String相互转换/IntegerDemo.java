package demo03_int和String相互转换;

/*
 * int类型和String类型的相互转化
 * 
 * int -- String
 * 		String.valueOf(number);
 * String -- int
 * 		Integer.parseInt(s);
 */
public class IntegerDemo {
	
	public static void main(String[] args) {
		int number = 100;
		String s1 = "" + number;
		System.out.println(s1);
		String s2 = String.valueOf(number);
		System.out.println(s2);
		Integer i = new Integer(number);
		String s3 = i.toString();
		System.out.println(s3);
		String s4 = Integer.toString(number);
		System.out.println(s4);
		System.out.println("------");
		
		String s = "100";
		Integer ii = new Integer(s);
		int x = ii.intValue();
		System.out.println(x);
		int y = Integer.parseInt(s);
		System.out.println(y);
		
	}

}
