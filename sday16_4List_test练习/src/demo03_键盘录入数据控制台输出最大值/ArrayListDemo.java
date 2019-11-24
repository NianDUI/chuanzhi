package demo03_键盘录入数据控制台输出最大值;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值。
 * 
 * 分析：
 * 		a:创建键盘录入数据对象
 *  	b:键盘录入多个数据,我们不知道多少个，所以用集合存储
 *  	c:以0结束这个简单，只要键盘录入的数据是0，我们就不继续录入数据了。
 *  	d:把集合转成数组。
 *  	e:对数组排序。
 *  	f:获取该数组中的最大索引的值
 *  
 * 
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// 创建键盘录入数据对象
		Scanner sc = new Scanner(System.in);

		// 键盘录入多个数据,我们不知道多少个，所以用集合存储
		ArrayList<Integer> array = new ArrayList<Integer>();

		// 以0结束这个简单，只要键盘录入的数据是0，我们就不继续录入数据了
		while (true) {
			System.out.println("请输入数据：");
			int number = sc.nextInt();
			if (number == 0) {
				break;
			}
			array.add(number);
		}

		// 把集合转成数组
		// public <T> T[] toArray(T[] a)
		Integer[] i = new Integer[array.size()];
//		Integer[] ii = array.toArray(i);
//		System.out.println(i == ii); // true
		array.toArray(i);

		// 对数组排序
		Arrays.sort(i);

		// 获取该数组中的最大索引的值
		System.out.println("数组是：" + Arrays.toString(i) + "\n最大值是：" + i[i.length - 1]);

	}
}
