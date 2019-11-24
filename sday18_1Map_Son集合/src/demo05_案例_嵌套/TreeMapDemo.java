package demo05_案例_嵌套;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * 需求："aababcabcdabcde"，获取字符串中每一个字母出现的次数
 * 		要求结果：a(5)b(4)c(3)d(2)e(1)
 * 
 * 分析：
 *  	a:定义一个字符串（可以改进为键盘录入。）
 *  	b:定义一个TreeMap集合。
 *  		键：Character
 * 			值： Integer
 * 		c:把字符串转为字符数组。
 *  	d:遍历字符数组得到每一个字符。
 *  	e:拿到刚才的字符作为键到集合中去找值，看返回值。
 *  		是null：说明该件不存在。就把字符作为键，一作为值存储。
 *  		不是null：说明该键存在，就把值加1，然后在存储该键和值。
 *  	f:定义字符串缓冲区变量。
 *  	g:遍历集合得到键和值进行，按照要求拼接。
 *  	h:把字符串缓冲器转换为字符串输出。
 * 
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		// a:定义一个字符串（可以改进为键盘录入。）
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();

		// b:定义一个TreeMap集合。
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// c:把字符串转为字符数组。
		char[] chs = line.toCharArray();

		// d:遍历字符数组得到每一个字符。
		for (char ch : chs) {
			// e:拿到刚才的字符作为键到集合中去找值，看返回值。
			Integer i = tm.get(ch);
			if (i == null) {
				// 是null：说明该件不存在。就把字符作为键，一作为值存储。
				i = 0; // 自动装箱
			}
			i++;
			tm.put(ch, i);
		}

		// f:定义字符串缓冲区变量
		StringBuilder sb = new StringBuilder();

		// g:遍历集合得到键和值进行，按照要求拼接。
		Set<Character> set = tm.keySet();
		for (Character key : set) {
			Integer value = tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}

		// h:把字符串缓冲器转换为字符串输出。
		String result = sb.toString();
		System.out.println(result);

	}
}
