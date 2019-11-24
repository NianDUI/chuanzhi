package demo04_泛型类_把泛型定义在类上;

/*
 * 泛型类的测试
 * 
 * 泛型的用法
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
//		ObjectTool ot = new ObjectTool();
//
//		ot.setObj(new String("风清扬"));
//		String s = (String) ot.getObj();
//		System.out.println("姓名是：" + s);
//		
//		ot.setObj(Integer.valueOf(30));
//		Integer i = (Integer) ot.getObj();
//		System.out.println("年龄是：" + i);

//		ot.setObj(new String("林青霞"));
//		// ClassCastException
//		Integer ii = (Integer) ot.getObj();
//		System.out.println("年龄是：" + ii);

		System.out.println("---------------");

		ObjectTool<String> ot = new ObjectTool<String>();
//		ot.setObj(Integer.valueOf(27)); // 这个时候编译期间就过不去。
		ot.setObj("林青霞");
		String s = ot.getObj();
		System.out.println("姓名是：" + s);

		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
//		ot2.setObj("风清扬"); // 这个时候编译期间就过不去。
		ot2.setObj(Integer.valueOf(27));
		Integer i = ot2.getObj();
		System.out.println("年龄是：" + i);

	}
}
