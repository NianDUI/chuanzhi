package demo01;

/*
 * 方法引用
 * 格式：
 * 类名称::静态方法名
 * 
 * 
 */
public class Demo01Abs {

	public static void main(String[] args) {
		method(num -> {
			int result;
			if (num >= 0) {
				result = num;
			} else {
				result = -num;
			}
			return result;
		});
		System.out.println("===============");

		// 方法应用的意义：Math类当中有一个abs静态方法，已经有了现成的功能。直接拿来用就行了。
		method(Math::abs);
	}

	public static void method(Cal cal) {
		int result = cal.getAbs(-25);
		System.out.println("结果：" + result);
	}
}
