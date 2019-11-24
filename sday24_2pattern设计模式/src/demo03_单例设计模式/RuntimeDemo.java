package demo03_单例设计模式;

import java.io.IOException;

/*
 * Runtime: 单例模式，可以调用DOS命令
 * public class Runtime extends Object
 * 		每个 Java 应用程序都有一个 Runtime 类实例，
 * 		使应用程序能够与其运行的环境相连接。
 * 		可以通过 getRuntime 方法获取当前运行时。 
 * 	应用程序不能创建自己的 Runtime 类实例。（单例模式） 
 * public Process exec(String command) throws IOException
 * 		在单独的进程中执行指定的字符串命令。 
 * 		可以执行DOS命令
 * 
 */
public class RuntimeDemo {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
//		r.exec("notepad"); // 打开记事本，做程序的：帮助
//		System.out.println(r.exec("ipconfig"));
//		r.exec("calc"); // 打开计算器
		r.exec("shutdown -s -t 10000"); // 10000s后关机
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		r.exec("shutdown -a"); // 取消关机
		
		
	}
}

/*
public class Runtime {
    private Runtime() {}
    
    private static final Runtime currentRuntime = new Runtime();

    public static Runtime getRuntime() {
        return currentRuntime;
    }
}
*/