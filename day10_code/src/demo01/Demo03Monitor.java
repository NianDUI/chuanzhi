package demo01;

/*
 * 小结：
 * 1.一定要有函数式接口，才能使用Lambda。
 * 2.对于重复的Lambda场景，可以使用方法引用来进行简化
 */
public class Demo03Monitor {

	public static void main(String[] args) {
		// 首先使用Lambda，简介调用println方法
		method((String str) -> {
			System.out.println(str);
		});
		method(str -> System.out.println(str));
		
		// 使用方引用，直接交给了println方法应用去处理
 		method(System.out::println);
	}

	public static void method(Monitor monitor) {
		monitor.show("Hello, world!");
	}

}
