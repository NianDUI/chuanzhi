package demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*\
 * ���ϣ���������е�Ԫ�ؽ��й��ˣ�����ʹ�ù��˷�����
 * 
 * filter(�ܲ���boolean�����Lambda)���������Lambda������true����ҪԪ�أ������false����ҪԪ�ء�
 */
public class Demo05StreamFilter {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(80);
		list.add(70);
		
		Stream<Integer> stream1 = list.stream().filter((Integer num) -> {
			boolean b = num > 80;
			return b;
		});
		Stream<Integer> stream2 = list.stream().filter(num -> {
			boolean b = num > 80;
			return b;
		});
		Stream<Integer> stream3 = list.stream().filter(num -> {
			return num > 80;
		});
		Stream<Integer> stream4 = list.stream().filter(num -> num >80);
		System.out.println("===========");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("�����Ȱ�");
		list2.add("��������");
		list2.add("�������");
		
		list2.stream().filter(s -> "��������".equals(s));
		
	}
	
}
