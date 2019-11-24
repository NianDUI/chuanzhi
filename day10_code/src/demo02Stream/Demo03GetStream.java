package demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * Java 8 ���е�����ʵ����Stream�ӿڵĶ���
 * 
 * JDK�ṩ��һ�����ӿڣ�java.util.stream.Stream<T>
 * 
 * ��λ�ȡ����
 * 1.���ݼ��ϻ�ȡ������������.stream()
 * 2.���������ȡ���� Stream.of(��������)
 */
public class Demo03GetStream {

	public static void main(String[] args) {
		// 1.���ݽ�ϻ�ȡ��
		ArrayList<String> list = new ArrayList<>();
		list.add("�����Ȱ�");
		list.add("��������");
		list.add("�������");

		Stream<String> streamA = list.stream();

		// 2�����������ȡ�������鵱�е�Ԫ�ر������������Ͳ���.
		String[] arrayStr = { "aaa", "bbb", "sdf" };
		Stream<String> streamB = Stream.of(arrayStr);

		Integer[] aI = { 10, 21, 21 };
		Stream<Integer> streamC = Stream.of(aI);

	}

}
