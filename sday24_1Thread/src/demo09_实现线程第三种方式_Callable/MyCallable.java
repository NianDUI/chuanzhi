package demo09_ʵ���̵߳����ַ�ʽ_Callable;

import java.util.concurrent.Callable;

// Callable���Ǵ����͵Ľӿ�
/*
 * ����ָ���ķ�����ʵ��call()�����ķ���ֵ
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
