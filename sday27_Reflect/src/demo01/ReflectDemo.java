package demo01;

public class ReflectDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Person p = new Person();
		Class c = p.getClass();
		
		Person p2 = new Person();
		Class c2 = p2.getClass();
		
		System.out.println(p == p2); // false
		System.out.println(c == c2); // true
		
		// 方式2
		Class c3 = Person.class;
//		int.class;
//		String.class;
		
		System.out.println(c == c3); // true
		
		// 方式3
		// demo01.Person
		Class c4 = Class.forName("demo01.Person");
		System.out.println(c == c4); // true
	}

}
