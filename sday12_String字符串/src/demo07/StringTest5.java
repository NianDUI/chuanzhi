package demo07;

/*
 * 统计大串中小串出现的次数
 */
public class StringTest5 {

	public static void main(String[] args) {
		String maxString = "woaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String minString = "java";
		System.out.println(getCount(maxString, minString));
	}

	public static int getCount(String maxString, String minString) {
		int count = 0;
//		while (true) {
//			int index = maxString.indexOf(minString);
//			if (index != -1) {
//				count ++;
//				int startIndex = index + minString.length();
//				maxString = maxString.substring(startIndex);
//			}else {
//				break;
//			}
//		}

		int index = maxString.indexOf(minString);
		while (index != -1) {
			count++;
			int startIndex = index + minString.length();
			maxString = maxString.substring(startIndex);
			index = maxString.indexOf(minString);
		}
		return count;
	}

}
