package demo03Equals;

/*
 * Object累的方法:
 * 		public boolean equals(Object obj)
 * 			指示其他某个对象是否与此对象“相等”。
 * 这个方法，默认情况下比较的是地址值。
 * 怎么重写？
 * 		一般是比较对象的成员变量值是否相同
 * 
 * 		public boolean equals(Object obj) {
        	return (this == obj);
    	}
 * 
 * ==:
 * 		基本类型：比较值是否相等
 * 		引用类型：比较的就是地址值是否相同
 * 
 * 
 */
public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("林青霞", 27);

		System.out.println(s1 == s2);
		Student s3 = s1;
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		Student s4 = new Student("风清扬", 30);
		System.out.println(s1.equals(s4));
	}

}
