package demo02_HashSet;

import java.util.HashSet;

/*
 * HashSet集合
 *  	a:底层数据结构是哈希表
 * 		b:哈希表底层依赖的元素的：hashCode()和equals()方法
 * 			执行顺序：
 * 				首先比较哈希值是否相同
 * 					相同：据需执行equals()方法
 * 						返回true：元素重复了，不添加
 * 						返回false：直接把元素添加到集合
 * 					不相同：就直接把元素添加到集合
 * 		c:如何保证元素的唯一性的呢？
 * 			有hashCode()和equals()保证的
 * 		d:开发的时候，代码非常简单，自动生成即可。
 * 
 * 
 * 问题：
 *  	为什么存储字符串只存储了一个呢？
 *  
 *  通过查看add方法的源码，我们知道了这个方法底层是依赖两个方法：hashCode()和equals()
 *  步骤：
 *  	首先比较哈希值。
 *  	如果相同，继续走，比较地址值或者走equals()。
 *  	如果不同，就直接添加到集合中。
 *  按照方法的步骤来说：
 *  	a:首先看hashCode()值是否相同。
 *  		相同：继续走equals()方法
 *  			返回true：说明原宿重复就不添加。
 *  			返回false：说明元素不重复，就添加到集合。
 *  		不同：就直接把元素添加到集合。
 *  
 *  如果类没有重写这两个方法，默认使用的Object()。一般来说不相同。  
 *  而String类重写了hashCode()和equals()方法。所以他就可以把内容相同的字符串去掉，只留下一个
 *  
 */
public class HashSetDemo {
	public static void main(String[] args) {
		// 创建集合对象
		HashSet<String> hs = new HashSet<String>();
		
		// 创建并添加元素
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		
		// 遍历集合
		for (String s : hs) {
			System.out.println(s);
		}
	}
}
