package demo02;

/*
 * ×Ö·û´®²¿·ÖÄÚÈÝÌæ»»
 */
public class Demo04StringReplace {

	public static void main(String[] args) {
		String str1 = "How do you do?";
		String str2 = str1.replace("o","*");
		System.out.println(str1); // How do you do?
		System.out.println(str2); // H*w d* y*u d*?
	}
	
}
