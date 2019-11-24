package demotest;

public class ToolDemo {

	public static void main(String[] args) throws Exception {
		Person p = new Person();
		Tool t = new Tool();
		t.setProperty(p, "name", "ÁÖÇàÏ¼");
		t.setProperty(p, "age", 27);
		System.out.println(p);
		
		Dog d = new Dog();
		t.setProperty(d, "sex", '¹«');
		t.setProperty(d, "price", 12.34f);
		System.out.println(d);
	}

}

class Person {
	private String name;
	int age;

	@Override
	public String toString() {
		return name + "--" + age;
	}
}

class Dog {
	char sex;
	float price;

	@Override
	public String toString() {
		return sex + "--" + price;
	}
}