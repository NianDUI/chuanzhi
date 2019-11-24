package demo02toString;

/*
 * Object累的方法:
 * 		public String toString()返回该对象的字符串表示
 * 
 * Integer类
 * 		public static String toHexString(int i)
 * 		以十六进制（基数 16）无符号整数形式返回一个整数参数
 * 			的字符串表示形式。 
 * 
 */
public class StudentDemo {
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("--------------");
		System.out.println(s.toString()); // demo02toString.Student@4411d970
		System.out.println("--------------");
		// 该方法返回一个字符串，它的值等于： 
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// this.getClass().getName() + '@' + Integer.toHexString(this.hashCode())
	
		System.out.println(s.getClass().getName()
				+ '@' + Integer.toHexString(s.hashCode()));
		System.out.println(s);
		
	}

}
