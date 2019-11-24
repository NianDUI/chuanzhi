package demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*\
 * 如果希望对流当中的元素进行过滤，可以使用过滤方法：
 * 
 * filter(能产生boolean结果的Lambda)：如果参数Lambda产生了true，则要元素，如果是false，则不要元素。
 */
public class Demo05StreamFilter {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(80);
		list.add(70);
		
		Stream<Integer> stream1 = list.stream().filter((Integer num) -> {
			boolean b = num > 80;
			return b;
		});
		Stream<Integer> stream2 = list.stream().filter(num -> {
			boolean b = num > 80;
			return b;
		});
		Stream<Integer> stream3 = list.stream().filter(num -> {
			return num > 80;
		});
		Stream<Integer> stream4 = list.stream().filter(num -> num >80);
		System.out.println("===========");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("迪丽热巴");
		list2.add("古力娜扎");
		list2.add("马尔扎哈");
		
		list2.stream().filter(s -> "古力娜扎".equals(s));
		
	}
	
}
