package demo03;

import java.util.ArrayList;

/*
 * ctrl+shift+o �Զ�����
 */
public class Demo02ArrayListMethod {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list);
		
		//���add
		list.add("¹��");
		list.add("���ෲ");
		list.add("��һ��");
		System.out.println(list);
		
		boolean success = list.add("����ͮ");
		System.out.println("����Ƿ�ɹ�:" + success);
		System.out.println(list);
		System.out.println("=============");
		
		//��ȡ��������get()
		String name = list.get(0);
		System.out.println(name);
		System.out.println(list);
		
		//���ϵĳ���
		System.out.println("���ϳ���" + list.size());
		list.add("����ӱ");
		System.out.println("���ϳ���" + list.size());
		
		for (String s : list) {
			System.out.print(s + " ");
		}
		
		
	}
	
}
