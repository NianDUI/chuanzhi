package demo02mathes;

import java.util.Scanner;

/*
 * У������
 * 	760664212@qq.com
 * 	liuyi@163.com
 * 	lingqingxia@126.com
 * 	fengqingyang@sina.com.cn
 * 	fpy@itcast.cn
 */
public class RegexTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������䣺");
		String emile = sc.nextLine();
		
		// С����()��ʾ���е���һ������
		String regex = "[a-zA-Z_0-9]*@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
//		String regex = "\\w*@\\w{2,6}(\\.\\w{2,3})+";
		
		boolean flag = emile.matches(regex);
		
		System.out.println("flag:" + flag);
	}

}
