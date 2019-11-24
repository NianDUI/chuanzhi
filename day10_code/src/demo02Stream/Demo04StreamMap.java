package demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * ��ȡ��֮�󣬿���ʹ��ӳ��ķ�����map������ת����Lambda���ʽ��
 * 
 * ӳ�䣺���ǽ�һ������ת������һ�����󣬰��϶���ӳ�䵽�¶�����
 * 
 * ������ӱ��98�� ת���� ��98�� ��һ�����ַ���ת��Ϊһ�����ַ���
 */
public class Demo04StreamMap {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("100");
		list.add("200");
		list.add("300");
		list.add("400");
		
		Stream<Integer> streamA = list.stream().map((String str) ->{
			int num = Integer.parseInt(str);
			return num;
		});
		Stream<Integer> streamB = list.stream().map(str ->{
			int num = Integer.parseInt(str);
			return num;
		});
		Stream<Integer> streamC = list.stream().map(str ->{
			return Integer.parseInt(str);
		});
		Stream<Integer> streamD = list.stream().map(Integer::parseInt);

		streamD.forEach(System.out::println);
		
		
	}

}
