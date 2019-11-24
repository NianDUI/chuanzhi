package demo02Stream;

import java.util.ArrayList;

/*
 * 如果流中的元素特别多，可以使用并发流
 * 
 * 如何获取并发流（支持并发操作的流）
 * .parallelStream()
 * 
 * 注意事项：
 * 1.使用并发流操作的时候，到底有几个人同时进行操作的？不用管，由JDK自己处理
 * 2.只要正确使用，就不会出现过个人抢到同一个元素的情况
 * 3.如果已经有了一个普通的流，那么只需要再调用一个parallel()方法也会变成并发流
 * 
 */
public class Demo07StreamParallel {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			list.add("Hello-" + i);
		}
		
//		list.stream().forEach(System.out::println);
		
		list.parallelStream().forEach(System.out::println);
		
		list.stream().parallel().forEach(System.out::println);
	}

}
