package demo01;

/*
 * Object累的方法:
 * 		public int hashCode()返回该对象的哈希码值
 * 			注意：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关
 * 				但不是实际地址值，可以理解为地址值。
 * 
 * 		public final Class<?> getClass()返回此 Object 的运行时类
 * 			Class类的：
 * 				public String getName()以 String 的形式返回此 Class 对象
 * 					所表示的实体（类、接口、数组类、基本类型或 void）名称。
 */
public class StudentDemo {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		
		Student s2 = new Student();
		System.out.println(s2.hashCode());
		
		Student s3 = s1;
		System.out.println(s3.hashCode());
		
		System.out.println("------------");
		
		Student s = new Student();
		Class c = s.getClass();
		System.out.println(c.getName()); // demo01.Student
		
		System.out.println(s.getClass().getName());
	}

}
