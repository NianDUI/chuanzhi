package demo02_��̬����ĸ�����ʹ��;

import java.lang.Math;
/*
 * ��̬����:
 *  ��ʽ��import static ����...����.������;
 *  ����ֱ�ӵ��뵽�����ļ���
 *  
 *  ��̬�����ע�����
 *  	a:���������Ǿ�̬�ġ�
 *  	b:����ж��ͬ���ľ�̬���������ײ�֪��ʹ��˭�����ʱ��Ҫʹ�ã������ǰ׺��
 *  		�ɴ˿ɼ������岻������һ�㲻�á�����Ҫ�ܿ�����
 */
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;

// ����
//import static java.util.ArrayList.add; // ���Ǿ�̬��

public class StaticImportDemo {
	public static void main(String[] args) {
//		System.out.println(java.lang.Math.abs(-100));
//		System.out.println(java.lang.Math.pow(2, 3));
//		System.out.println(java.lang.Math.max(20, 30));
		// ̫���ӣ����Ǿ����뵽import

//		System.out.println(Math.abs(-100));
//		System.out.println(Math.pow(2, 3));
//		System.out.println(Math.max(20, 30));
		// ̫�����ˣ��и��򵥵�

//		System.out.println(abs(-100));
		System.out.println(java.lang.Math.abs(-100));
		System.out.println(pow(2, 3));
		System.out.println(max(20, 30));

	}

    public static String abs(String s) {
        return s;
    }
}
