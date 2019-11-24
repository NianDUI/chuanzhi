package demo01_��ǿfor;

import java.util.ArrayList;
import java.util.List;

/*
 * JDK5�����ԣ��Զ���װ�䣬���ͣ���ǿfor����̬���룬�ɱ������ö��
 *  	
 *  ��ǿfor��forѭ����һ�֡�
 *  
 *  ��ʽ��
 *  	for (Ԫ���������� ������ : �������Collection����) {
 *  		ʹ�ñ������ɣ��ñ�������Ԫ��  
 *  	}
 *  
 *  �ô���
 *  	��������ͼ��ϵı���
 *  
 *  �׶ˣ�
 *  	��ǿfor��Ŀ�겻��Ϊnull
 *  ��ν���أ�
 *  	����ǿfor��Ŀ���Ƚ��в�Ϊnull���жϣ�Ȼ���ٽ���ʹ�á�
 */
public class ForDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// ����һ��int����
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------");
		// ��ǿfor
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("----------");

		// ����һ���ַ�������
//		String[] strArray = new String[] { "a", "b", "c", "d", "e" };
		String[] strArray = { "a", "b", "c", "d", "e" };
		for (String s : strArray) {
			System.out.println(s);
		}
		System.out.println("----------");

		// ����һ������
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		// ��ǿfor
		for (String s : array) {
			System.out.println(s);
		}
		System.out.println("----------");

		List<String> list = null;
		// NullPointerException ��ָ���쳣
		// ���s�����Ǵ�list�������ȡ�����ģ��ڻ�ȡǰ�����϶���Ҫ��һ���ж�
		// ˵���ˣ�����ǵ������Ĺ��ܡ�
		if (list != null) {
			for (String s : list) {
				System.out.println(s);
			}
		}
		System.out.println("----------");
		
		// ��ǿfor��ʵ����������������ġ�
		// ConcurrentModificationException �����޸��쳣
//		for (String s : array) {
//			if ("world".equals(s)) {
//				array.add("javaee");
//			}
//		}
//		
//		System.out.println("array:" + array);
	}
}
