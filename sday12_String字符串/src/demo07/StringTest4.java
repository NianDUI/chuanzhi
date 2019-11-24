package demo07;

/*
 * 统计大串中小串出现的次数 ，改进
 */
public class StringTest4 {

	public static void main(String[] args) {
		String maxString = "woaijavawozhendeaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String minString = "java";
		System.out.println(getCount(maxString, minString));
	}

	public static int getCount(String maxString, String minString) {
		int count = 0;
		/*int index = maxString.indexOf(minString);
		while (index != -1) {
			count++;
//			int startIndex = index + minString.length();
//			maxString = maxString.substring(startIndex);
			maxString = maxString.substring(index + minString.length());
			index = maxString.indexOf(minString);
		}*/
		
		int index;
		while ((index = maxString.indexOf(minString)) != -1) {
			count++;
			maxString = maxString.substring(index + minString.length());
		}
		return count;
	}

}
