package demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * 希望在流中进行遍历操作，可以使用forEach方法
 * 
 * forEach(Lambda表达)：意思是，对流当中的每一个元素都进行操作。
 * 参数Lambda表达式必须是一个能够消费一个参数，而且不产生数据结果的Lambda
 *
 * 例如：
 * Lambda：s -> System.out.println(s);
 * 方法引用：System.out::println
 */
public class Demo06StreamForEach {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("迪丽热巴");
		list.add("古力娜扎");
		list.add("马尔扎哈");
		
		Stream<String> streamA = list.stream();
		streamA.forEach((String str) -> {
			System.out.println(str);
		});
		
		list.stream().forEach(s -> System.out.println(s));
		System.out.println("=========");
		list.stream().forEach(System.out::println);
	}
	

}
