package demo02Stream;

import java.util.ArrayList;

/*
 * ������е�Ԫ���ر�࣬����ʹ�ò�����
 * 
 * ��λ�ȡ��������֧�ֲ�������������
 * .parallelStream()
 * 
 * ע�����
 * 1.ʹ�ò�����������ʱ�򣬵����м�����ͬʱ���в����ģ����ùܣ���JDK�Լ�����
 * 2.ֻҪ��ȷʹ�ã��Ͳ�����ֹ���������ͬһ��Ԫ�ص����
 * 3.����Ѿ�����һ����ͨ��������ôֻ��Ҫ�ٵ���һ��parallel()����Ҳ���ɲ�����
 * 
 */
public class Demo07StreamParallel {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			list.add("Hello-" + i);
		}
		
//		list.stream().forEach(System.out::println);
		
		list.parallelStream().forEach(System.out::println);
		
		list.stream().parallel().forEach(System.out::println);
	}

}
