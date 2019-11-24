package demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * ϣ�������н��б�������������ʹ��forEach����
 * 
 * forEach(Lambda���)����˼�ǣ��������е�ÿһ��Ԫ�ض����в�����
 * ����Lambda���ʽ������һ���ܹ�����һ�����������Ҳ��������ݽ����Lambda
 *
 * ���磺
 * Lambda��s -> System.out.println(s);
 * �������ã�System.out::println
 */
public class Demo06StreamForEach {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("�����Ȱ�");
		list.add("��������");
		list.add("�������");
		
		Stream<String> streamA = list.stream();
		streamA.forEach((String str) -> {
			System.out.println(str);
		});
		
		list.stream().forEach(s -> System.out.println(s));
		System.out.println("=========");
		list.stream().forEach(System.out::println);
	}
	

}
