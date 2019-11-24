package demo08_����10��1��20֮��������Ҫ�����ظ�;

import java.util.HashSet;
import java.util.Random;

/*
 * ��дһ������,��ȡ10��1��20֮��������Ҫ�����ظ�;
 * 
 * Set���ϱ�֤��Ψһ������size()������֤
 * HashSet,Ψһ������
 * 
 * ������
 *  	a:�������������
 *  	b:����һ��HashSet���ϡ�
 *  	c:�жϼ��ϵĳ����ǲ���С��10��
 *  		�ǣ��ʹ���һ���������ӡ�
 *  		���ǣ���������
 *  	d:����HashSet���ϡ�
 *  
 */
public class HashSetDemo {
	public static void main(String[] args) {
		// �������������
		Random r = new Random();
		
		// ����һ��HashSet���ϡ�
		HashSet<Integer> ts = new HashSet<Integer>();
		
		// �жϼ��ϵĳ����ǲ���С��10��
		while (ts.size() < 10) {
			int num = r.nextInt(20)  + 1;
			ts.add(num);
		}
		
		// ����Set���ϡ�
		for (Integer i : ts) {
			System.out.println(i);
		}
		
	}
}
