package demo02Stream;

import java.util.ArrayList;

//          Stream��ʽ˼��
/*
 * map��Ӧ��ӳ�����
 * filer �����ˣ�ֻ�������������ģ������������
 * forEach ,ѭ��	
 */
public class Demo02ArrayListStream {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("����ӱ,98");
		list.add("¹��,95");
		list.add("��С��,87");
		
		// Stream API����д����
		list.stream().map(s -> s.split(",")[1]).map(Integer::parseInt)
			.filter(n -> n > 90).forEach(System.out::println);
		
	}
}
