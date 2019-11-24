package demo09_键盘录入学生信息按照总分排序后输出在控制台案例;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入五个学生信息(姓名，语文成绩，数学成绩，英语成绩)，按照总分从高到低输出到控制台。
 * 
 *  分析
 *  	a:定义学生类
 *  	b:创建一个TreeSet集合
 *  	c:总分从高到低，如何实现呢？
 *  	e:键盘录入五个学生信息。
 *  	f:遍历TreeSet集合。
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// 创建一个TreeSet集合
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// 总分从高到低
				int num = s2.getSum() - s1.getSum();
				// 总分从低到高
//				int num = s1.getSum()- s2.getSum();
				
				// 总分相同的不一定语文相同
				int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
				// 总分相同的不一定数学相同
				int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
				// 总分相同的不一定英语相同
				int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
				// 姓名还不一定相同
				int num5 = num4 == 0 ? s1.getName().compareTo(s2.getName()) : num4;

				return num5;
			}

		});
		
		
		// 键盘录入五个学生信息。
		for (int i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第" + i + "个学生的姓名:");
			String name = sc.nextLine();
			System.out.println("请输入第" + i + "个学生的语文成绩:");
			String chineseString = sc.nextLine();
			System.out.println("请输入第" + i + "个学生的数学成绩:");
			String mathString = sc.nextLine();
			System.out.println("请输入第" + i + "个学生的英语成绩:");
			String englishString = sc.nextLine();
			
			// 把数据封装到学生对象。
			Student s = new Student();
			s.setName(name);
			s.setChinese(Integer.parseInt(chineseString));
			s.setMath(Integer.parseInt(mathString));
			s.setEnglish(Integer.parseInt(englishString));
			
			// 把学生对象添加到集合
			ts.add(s);
		}
		System.out.println("学生信息录入完毕");
		
		System.out.println("学生成绩从高到低排序如下:");
		// 遍历TreeSet集合。
		for (Student s : ts) {
			System.out.println(s);
		}

	}
}
