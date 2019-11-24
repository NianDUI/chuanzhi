package demo01;

/*
 * 方法引用德 又一种格式：
 * 
 * 通过对象应用成员方法，格式：
 * 对象名::成员方法名
 */
public class Demo02MethodRef {

	public static void main(String[] args) {
		Cook cook= new Cook();
		method(cook::makeFood);
	}
	
	public static void method(Sitter sitter) {
		sitter.work("土豆");
	}
	
}
