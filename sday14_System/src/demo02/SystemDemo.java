package demo02;

/*
 * 
 * public static void exit(int status)终止当前正在运行的 Java 虚拟机。
 * 	参数用作状态码；根据惯例，非 0 的状态码表示异常终止。 
		该方法调用 Runtime 类中的 exit 方法。该方法永远不会正常返回。 
		调用 System.exit(n) 实际上等效于调用： 
 		Runtime.getRuntime().exit(n)
 * public static long currentTimeMillis()返回以毫秒为单位的当前时间。
 * 	返回：
		当前时间与协调世界时 1970 年 1 月 1 日0点午夜之间的时间差（以毫秒为单位测量）。
 * 
 */
public class SystemDemo {
	
	public static void main(String[] args) {
//		System.out.println("我们喜欢林青霞");
//		System.exit(0);
//		System.out.println("我么也喜欢赵雅芝");
		
		System.out.println(System.currentTimeMillis());
		// 单独得到这样的时间，目前对我们来说意义不大。
		// 那么它到底有什么作用呢？
		// 要求请大家给我统计得段程序的运行时间。
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			System.out.println("Hello" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "毫秒");
		
		
	}

}
