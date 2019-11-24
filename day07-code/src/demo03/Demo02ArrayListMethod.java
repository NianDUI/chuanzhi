package demo03;

import java.util.ArrayList;

/*
 * ctrl+shift+o 自动导包
 */
public class Demo02ArrayListMethod {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list);
		
		//添加add
		list.add("鹿晗");
		list.add("吴亦凡");
		list.add("张一凡");
		System.out.println(list);
		
		boolean success = list.add("关晓彤");
		System.out.println("添加是否成功:" + success);
		System.out.println(list);
		System.out.println("=============");
		
		//获取几个数据get()
		String name = list.get(0);
		System.out.println(name);
		System.out.println(list);
		
		//集合的长度
		System.out.println("集合长度" + list.size());
		list.add("赵丽颖");
		System.out.println("集合长度" + list.size());
		
		for (String s : list) {
			System.out.print(s + " ");
		}
		
		
	}
	
}
