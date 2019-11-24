package demo01_概述;

/*
 * System 类包含一些有用的类字段和方法。它不能被实例化。 
 * 
 * 方法:
 * public static void gc()运行垃圾回收器。
 * 		执行System.gc()前,系统会自动调用finalize()方法清除对象占有的资源，通过super.finalize()方式
 * 			可以实现从下到上的finalize()方法的调用，即先释放自己的资源，再去释放父类的资源。
 * public static void exit(int status)终止当前正在运行的 Java 虚拟机。
 * public static long currentTimeMillis()返回以毫秒为单位的当前时间。
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * 		从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 * 
 * 
 */
public class SystemDemo {
	
	public static void main(String[] args) {
		Person p = new Person("aa", 60);
		System.out.println(p);
		
		p = null; // 让p不在指定堆内存
		System.gc();
	}

}
