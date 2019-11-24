package demo01_异常概述;

/*
 *  异常：
 *  举例：今天天气很好，班长出去旅游。骑着自行车，去山里面呼吸新鲜空气。
 *  	问题1：山路塌陷了，班长及时 停住了，但是过不去了。
 *  	问题2：班长出门推自行车，发现气没了，把气吹起来。
 *  			出发前就应该检查的问题。
 *  	问题3：班长骑着车在山路上惬意的行驶着，山路两边有 小石子，中间是平坦的水泥路。
 *  			一直在平坦的水泥路上形式是没有任何问题的，但是呢，他就偏偏喜欢骑到小石子上，结果爆胎了。
 *  			旅游的过程中出现问题。
 *  
 *  程序的异常：Throwable
 *  	严重问题：Error	我们不处理，这种问题一般都是很严重的问题，比如说内存溢出。
 *  	问题：Exception 
 *  		编译期问题：不是RuntimeException的异常	
 *  			必须进行除理的，因为你不处理，编译就不能通过
 *  		运行期问题：RuntimeException	
 *  			这种问题我们也不处理，因为是你的问题，而且这个问题出现肯定是我们的代码不够严谨，需要修改代码的。
 *  
 *  Throwable类:是 Java 语言中所有错误或异常的超类。
 *  |
 *  |--Error	
 *  	|--子类
 *  |
 *  |--Exception
 *  	|--子类
 *  	|--RuntimeException
 *  		|--子类
 *  
 *  如果程序出现了问题，我们没有做任何处理，最终JVM会做出默认的处理。
 *  把异常的名称，原因及出现的问题等信息输出在控制台。
 *  同时会结束程序。
 *  	
 */
public class ExceptionDmeo {
	public static void main(String[] args) {
		// 第一阶段。
		int a = 20;
//		int b = 2;
		int b = 0;
		System.out.println(a / b); // ArithmeticException
		
		// 第二阶段。
		System.out.println("over");
		
	}
}
