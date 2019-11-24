package demo03_HashSet存储自定义对象并便利;

import java.util.HashSet;

/*
 * HashSet集合存储士兵对象，并便利。如果对象的成员变量值相同，既为同一对象。
 * 
 * 注意了：
 *  你使用的是HashSet集合。这个集合底层实现是哈希表结构
 * 	而哈希表结构底层依赖的是对象的：hashCode()和equals()方法
 * 如果你认为对象的成员变量值相同，既为同一个对象的话，你就应该重写这两个方法。
 * 如何从写呢？不用担心，自动生成即可。
 *  
 */
public class DogDemo {
	public static void main(String[] args) {
		// 创建集合对象
		HashSet<Dog> hs = new HashSet<Dog>();

		// 创建对象
		Dog d1 = new Dog("秦桧", 25, "红色", '男');
		Dog d2 = new Dog("a", 25, "bs", 'n');
		Dog d3 = new Dog("秦桧", 20, "红色", 'm');
		Dog d4 = new Dog("秦桧", 25, "红色", '男');
		Dog d5 = new Dog("e", 56, "cs", 'm');
		Dog d6 = new Dog("f", 22, "hs", 'n');
		Dog d7 = new Dog("f", 22, "hs", 'n');
		Dog d8 = new Dog("f", 22, "hs", 'm');

		// 添加到集合
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		hs.add(d7);
		hs.add(d8);

		// 遍历
		for (Dog d : hs) {
			System.out.println(d);
		}
	}
}
