package demo05_泛型方法_把泛型定义在方法上;

/*
 * 泛型方法：把泛型定义在方法上。
 * 	他就能接受任意类型了
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
//		ObjectTool ot = new ObjectTool();
//		ot.show("hello");
//		ot.show(100); // 自动装箱
//		ot.show(true);

//		ObjectTool<String> ot = new ObjectTool<String>();
//		ot.show("hello");
//
//		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
//		ot2.show(100);
//		
//		ObjectTool<Boolean> ot3 = new ObjectTool<Boolean>();
//		ot3.show(true);

		// 如果还听得懂，那就说明泛型类是没有问题的。
		// a:但是呢，谁说了我的方法一定要和类的类型一致呢？
		// b:我要是累上没有发型的话，方法还能不能接受任意类型的参数了呢？

		ObjectTool ot = new ObjectTool();
		ot.show("hello");
		ot.show(100);
		ot.show(true);
	}
}
