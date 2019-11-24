package demo02DeBug;

/*
 * 通过DeBug查看执行流程
 * 
 *
 */
public class ForDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
}
