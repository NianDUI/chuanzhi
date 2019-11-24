package demo06_泛型接口_把泛型定义在接口上;

/*
 * 实现类在实现接口的时候。
 * 第一种情况: 已经知道该是什么类型了。并不常见
 * 第二种情况: 还不知道是什么类型的。
 */

// 第一种情况: 已经知道该是什么类型了。并不常见
//public class InterImpl implements Inter<String>{ // 实现的时候就知道了。
//
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//	}
//
//}

// 第二种情况: 还不知道是什么类型的。
public class InterImpl<T> implements  Inter<T> { // 创建的时候才知道。

	@Override
	public void show(T t) {
		System.out.println(t);
	}
	
}