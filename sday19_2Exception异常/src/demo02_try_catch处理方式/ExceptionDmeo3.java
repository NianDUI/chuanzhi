package demo02_try_catch处理方式;

/*
 * a:一个异常
 * b:两个异常的处理
 * 		a:每一个写一个try...catch
 * 		b:写一个try，多个catch
 * 			try {
 * 				...
 * 			} catch(异常名 变量) {
 * 				...
 * 			} catch(异常名 变量) {
 *  			...
 *  		}
 *  		...
 *  	
 *  		注意事项：
 *  			1：能明确的尽量明确，不要用大的处理。
 *  			2： 平级关系的异常谁前谁后无所谓，如果出现了子父关系，父必须在后面。
 *  
 *  注意：
 *  	一旦try理念出了问题，就会在这里把问题抛出去一趟，
 *  	然后和catch里面的问题进行匹配，
 *  	一旦有匹配的catch就执行里面的处理,然后就结束了try...。
 *  	继续执行下面的语句
 *  	
 *  
 */
public class ExceptionDmeo3 {
	public static void main(String[] args) {
//		method1();

//		method2();
		
//		method3();
		
		
		method4();
	}

	private static void method4() {
		int a = 20;
		int b = 0;
		int[] arr = { 1, 2, 3 };
		
		
		// 爷爷在最后
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢？");
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为0");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该访问的索引");
		} catch(Exception e) {
			System.out.println("出现问题了。");
		}
		
		// 爷爷在前是不可以的
//		try {
//			System.out.println(a / b);
//			System.out.println(arr[3]);
//			System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢？");
//		} catch(Exception e) {
//			System.out.println("出现问题了。");
//		} catch (ArithmeticException ae) {
//			System.out.println("除数不能为0");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("你访问了不该访问的索引");
//		}
		
		
		System.out.println("over");
	}

	// 两个异常的处理
	private static void method3() {
		int a = 20;
		int b = 0;
		int[] arr = { 1, 2, 3 };
		
		try {
			System.out.println(arr[3]);
			System.out.println(a / b);
//			System.out.println(arr[3]);
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为0");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该访问的索引");
		}
		
		System.out.println("over");
	}

	// 两个异常
	private static void method2() {
		int a = 20;
		int b = 0;
		try {
			System.out.println(a / b); // ArithmeticException
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为0");
		}

		int[] arr = { 1, 2, 3 };
		try {
		System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该访问的索引");
		}
		
		System.out.println("over");
	}

	// 一个异常
	public static void method1() {
		// 第一阶段。
		int a = 20;
//		int b = 2;
		int b = 0;
		try {
			System.out.println(a / b); // ArithmeticException
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为0");
//			ae.printStackTrace();
		}

		// 第二阶段。
		System.out.println("over");
	}
}
