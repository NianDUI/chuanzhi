package demo03;

import java.util.ArrayList;

/*
 * 基本类型  对应的包装类
 * byte    Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 * 
 * 从JDK1.5开始，基本类型可以和对应的包装类进行自动装箱拆箱
 * 装箱：基本类型 --》包装类
 * 拆箱：包装类 --》 基本类型
 */
public class Demo04ArrayListWrapper {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(100);
		list.add(200);
		list.add(300);

		System.out.println(list.get(1));

	}

}
