package demo01_����;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList�洢�ַ���������\
 * 
 *  ���ǰ�����ȷ��д����д������򣬽��ȴ�����ˡ�
 *  Ϊʲô�أ�
 *  	��Ϊ���ǿ�ʼ�洢��ʱ�򣬴洢��String��Integer�������͵����ݡ�
 *  	���ڱ�����ʱ�����ǰ����Ƕ�������String���ʹ�������ת�������Ծͱ����ˡ�
 *  �����أ����ڱ����ڼ�ȴû�и������ǡ�
 *  ���ԣ��Ҿ;��������ƵĲ��á�
 *  ����һ�£����ǵ�����
 *  	String[] strArray = new String[3];
 *  	strArray[0] = "hello";
 *  	strArray[1] = "world";
 *  	strArray[2] = 10; // ����
 *  ����Ҳģ��������������������ڴ��������ʱ����ȷԪ�ص��������ͣ������Ͳ������������ˡ�
 *  �����ּ�������Ϊ�����͡�
 *  
 *  ���ͣ���һ�ְ�������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȥ��ȷ���������͡�
 *  	Ҳ�в��������ͣ������͵�������һ���Ĵ��ݡ�
 *  ��ʽ��
 *  	<��������>
 *  	�˴�����������ֻ�����������͡�
 *  
 *  �ô���
 *  	a:������ʱ�ڵ�������ǰ���˱����ڼ䡣
 *  	b:������ǿ������ת����
 *  	c:�Ż��˳�����ƣ�����˻�ɫ�����ߡ�
 */
public class GenericDemo {
	public static void main(String[] args) {
		// ����
		ArrayList<String> array = new ArrayList<String>();

		// ���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
//		array.add(new Integer(100));
//		array.add(10); // ֻ�����������ͣ�JDK1.5�Զ�װ��
		// �ȼ��ڣ�array.add(Integer.valueOf(10));

		// ����
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			// ClassCastException
//			String s = (String) it.next();
			String s = it.next();
			System.out.println(s);
		}

//		// ������Ĵ���
//		String[] strArray = new String[3];
//		strArray[0] = "hello";
//		strArray[1] = "world";
//		strArray[2] = 10; // ����
	}
}
