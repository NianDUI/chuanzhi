package demo03_泛型的由来;

/*
 * 早期的时候，我们使用Object来代替任意类型。
 * 
 * 向上转型是没有任何问题的，但是再向下转型的时候，其实隐含了类型转换的问题。
 * 也就是说这样的程序其实并不是安全的。所以Java在JDK5以后引入了泛型，提高程序的安全性。
 * 
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();

		// 正常使用
		ot.setObj(Integer.valueOf(27));
		Integer i = (Integer) ot.getObj();
		System.out.println("年龄是：" + i);

		ot.setObj(new String("林青霞"));
		String s = (String) ot.getObj();
		System.out.println("姓名是：" + s);
		
		System.out.println("----------");
		ot.setObj(Integer.valueOf(30));
		String ss = (String) ot.getObj(); // ClassCastException
		System.out.println("姓名是：" + ss);
		
		
		
	}
}
