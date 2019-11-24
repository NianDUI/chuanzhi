package demo01_简单工厂模式;

public class AnimalDemo {
	public static void main(String[] args) {
		// 具体类调用
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		System.out.println("----------");
		
//		// 工厂有了后
//		Dog dd = AnimalFactory.createDog();
//		Cat cc = AnimalFactory.createCat();
//		dd.eat();
//		cc.eat();
//		System.out.println("----------");
		
		// 工厂改进后
		Animal a = AnimalFactory.createAnimal("dog");
		a.eat();
		a = AnimalFactory.createAnimal("cat");
		a.eat();
		
		a = AnimalFactory.createAnimal("pig"); // 猪
//		a.eat(); // NullPointerException 空指针异常
		if (a != null) {
			a.eat();
		} else {
			System.out.println("对不起，暂时不提供该动物！");
		}
	}
}
