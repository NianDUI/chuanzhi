package demo01;

/*
 * �������õ� ��һ�ָ�ʽ��
 * 
 * ͨ������Ӧ�ó�Ա��������ʽ��
 * ������::��Ա������
 */
public class Demo02MethodRef {

	public static void main(String[] args) {
		Cook cook= new Cook();
		method(cook::makeFood);
	}
	
	public static void method(Sitter sitter) {
		sitter.work("����");
	}
	
}
