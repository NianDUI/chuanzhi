package demo07_面试题;

import java.util.Hashtable;

/*
 *  1：Hashtable和HashMap的区别？
 *  	Hashtable：
 *  		线程安全，效率低。不允许使用null键和null值
 *  	HashMap：
 *  		线程不安全，效率高。允许使用null键和null值
 *  
 *  HashMap就是用来替代Hashtable的
 *  
 *  2：List,Set,Map等接口是否都继承Map接口？
 *  	List，Set不是继承Map接口，他们继承自Collection接口
 *  	Map接口本神就是一个顶层接口
 *  
 *  
 */
public class HashtableDemo {
	public static void main(String[] args) {
//		HashMap<String, String> hm = new HashMap<String, String>();
		Hashtable<String, String> hm = new Hashtable<String, String>();

		hm.put("iy001", "hello");
//		hm.put(null, "world"); // NullPointerException	空值异常
//		hm.put("java", null); // NullPointerException	空值异常

		System.out.println("hm:" + hm);

	}
}
