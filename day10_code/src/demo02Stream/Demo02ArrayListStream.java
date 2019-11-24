package demo02Stream;

import java.util.ArrayList;

//          Stream流式思想
/*
 * map对应，映射操作
 * filer ，过滤，只保留满足条件的，不满足的舍弃
 * forEach ,循环	
 */
public class Demo02ArrayListStream {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("赵丽颖,98");
		list.add("鹿晗,95");
		list.add("宋小宝,87");
		
		// Stream API更优写法！
		list.stream().map(s -> s.split(",")[1]).map(Integer::parseInt)
			.filter(n -> n > 90).forEach(System.out::println);
		
	}
}
