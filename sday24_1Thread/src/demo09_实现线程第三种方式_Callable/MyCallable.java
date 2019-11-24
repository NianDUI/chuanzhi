package demo09_实现线程第三种方式_Callable;

import java.util.concurrent.Callable;

// Callable：是带泛型的接口
/*
 * 这里指定的泛型其实是call()方法的返回值
 */
public class MyCallable implements Callable {

	@Override
	public Object call() throws Exception {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		return null;
	}

}
