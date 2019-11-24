package Demo03Lambda;

/*
 * 函数式编程思想
 * Java当中使用Lambda表达式的前提是。必须有“函数式接口”。
 * 
 * 概念：有且仅有一个抽象方法的接口，叫函数式接口
 * 
  * 如何才能万无一失的检测一下当前借口是不是函数式接口呢？
  *   用一个固定的格式卸载public interface之前一行即可
 * @FunctionalInterface
 * public interface 函数式接口名{
 * 		// ...
 * }
 * 
 */

public class Demo02CalLambda {

	public static void main(String[] args) {
		method((a, b) -> a + b);
		
		/**
		 * Lamvda表达式：(a, b) -> a + b
		 * method方法需要一个Cal接口类型的参数
		 * Lambda表达式就是从当了Cal接口类型的参数
		  * 初步理解：
		 * 1.Lambda表达式前面的小括号，其实就是接口抽象方法的小括号
		 * 2.箭头代表拿着小括号的数据做什么事情，是一个指向的动作
		 * 3.箭头后面就代表达到了参数之后做什么事情。
		 * Lambda表达式语义本事就代表了怎么做这件事情，就没有对象的的概念在里面。（更加简单直观）
		 * 
		 */
	}
	
	public static void method(Cal cal) {
		int result = cal.sum(10, 20);
		System.out.println("结果是：" + result);
	}
	
}
