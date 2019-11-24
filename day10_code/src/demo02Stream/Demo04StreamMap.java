package demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * 获取流之后，可以使用映射的方法：map（用于转换的Lambda表达式）
 * 
 * 映射：就是将一个对象转换成另一个对象，把老对象映射到新对象上
 * 
 * “赵丽颖，98” 转换成 “98” 讲一个长字符串转换为一个短字符串
 */
public class Demo04StreamMap {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("100");
		list.add("200");
		list.add("300");
		list.add("400");
		
		Stream<Integer> streamA = list.stream().map((String str) ->{
			int num = Integer.parseInt(str);
			return num;
		});
		Stream<Integer> streamB = list.stream().map(str ->{
			int num = Integer.parseInt(str);
			return num;
		});
		Stream<Integer> streamC = list.stream().map(str ->{
			return Integer.parseInt(str);
		});
		Stream<Integer> streamD = list.stream().map(Integer::parseInt);

		streamD.forEach(System.out::println);
		
		
	}

}
