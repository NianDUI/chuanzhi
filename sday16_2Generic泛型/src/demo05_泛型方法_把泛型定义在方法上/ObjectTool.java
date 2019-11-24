package demo05_泛型方法_把泛型定义在方法上;

//public class ObjectTool<T> {
//
//	// 不够友好
////	public void show(String s) {
////		System.out.println(s);
////	}
////
////	public void show(Integer i) {
////		System.out.println(i);
////	}
////
////	public void show(boolean b) {
////		System.out.println(b);
////	}
//	
//
//	public void show(T t) {
//		System.out.println(t);
//	}
//}

/*
 * 泛型方法：把泛型定义在方法上。
 * 
 * 
 * 格式：public <泛型类型> 返回类型 方法名(泛型类型  .)
 */
public class ObjectTool {
	public <T> void show(T t) {
		System.out.println(t);
	}
}
