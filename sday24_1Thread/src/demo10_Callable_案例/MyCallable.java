package demo10_Callable_����;
import java.util.concurrent.Callable;

/*
 * 	�߳���Ͱ�����
 */
public class MyCallable implements Callable<Integer> {
	private int number;
	
	public MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

}
