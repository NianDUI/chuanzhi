package Demo03Lambda;

/*
 * Lambda表达式想要使用，一定要有函数式接口的推断环境。
 * 1.要么通过方法的参数类型来确定是哪个函数式接口
 * 2.要么通过赋值操作来确定是哪个函数式接口 
 * 
 * Lambda的格式就是为了将抽象方法，翻译为以下三点：
 * 1.一些参数（方法参数）
 * 2.一个箭头
 * 3.一些代码（方法体）
 * 
  *  例如抽象方法：
 * public abstract int sum(int a, int b);
 * 
 *  翻译为Lambda的标准格式：
 *  (int a, int b) -> { return a + b;}
 *  
 * 
 */
public class Demo03Lambda {

	public static void main(String[] args) {
		method(  (int a, int b) -> { return a + b;}  );
		System.out.println("===============");
		
		// 一个可以根据赋值语句左侧的类型来进行Lambda上下文推断
		Cal cal = (int a, int b) -> { return a + b;};
		method(cal);
//		(int a, int b) -> { return a + b;}; // 错误写法
		
		
	}
	
	public static void method(Cal cal) {
		int result = cal.sum(10, 20);
		System.out.println("结果是：" + result);
	}
	
}
