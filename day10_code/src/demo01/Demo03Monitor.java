package demo01;

/*
 * С�᣺
 * 1.һ��Ҫ�к���ʽ�ӿڣ�����ʹ��Lambda��
 * 2.�����ظ���Lambda����������ʹ�÷������������м�
 */
public class Demo03Monitor {

	public static void main(String[] args) {
		// ����ʹ��Lambda��������println����
		method((String str) -> {
			System.out.println(str);
		});
		method(str -> System.out.println(str));
		
		// ʹ�÷����ã�ֱ�ӽ�����println����Ӧ��ȥ����
 		method(System.out::println);
	}

	public static void method(Monitor monitor) {
		monitor.show("Hello, world!");
	}

}
