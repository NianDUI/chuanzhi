package demo01;

/*
 * 线程安全
 * 安全-- 同步 -- 数据是安全的
 * 不安全-- 不同步 -- 效率高一些
 * 安全和效率问题是永远困扰我们的问题。
 * 
 * 安全：银行、医院的网站
 * 效率：新闻网站、论坛之类的
 * 
 * StringBuffer
 * 	线程安全的可变字符序列
 * 内容长度可变，String不可变
 * 构造方法
 * 		StringBuffer() 
 * 		          构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。 
 * 		StringBuffer(int capacity) 
 * 		          构造一个不带字符，但具有指定初始容量的字符串缓冲区。 
 * 		StringBuffer(String str) 
 * 		          构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。 
 * 		
 * 	int capacity() 
          返回当前容量。 理论值
 *  int length() 
          返回长度（字符数）。 实际值
 * 
 */
public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb); // 重写了toString方法
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("------------");
		
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println(sb2); // 重写了toString方法
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println("------------");
		
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println(sb3); // 重写了toString方法
		System.out.println(sb3.length());
		System.out.println(sb3.capacity()); // 16 + 5 = 21
		System.out.println("------------");
	}

}
