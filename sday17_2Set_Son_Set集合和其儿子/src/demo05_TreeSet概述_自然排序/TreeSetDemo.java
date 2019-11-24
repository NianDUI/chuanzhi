package demo05_TreeSet概述_自然排序;

import java.util.TreeSet;

/*
 *  TreeSet集合
 *  	a:底层数据结构是红黑树（是一种自平衡的二叉树）
 *  	b:树保证元素的排序方式
 *  		a:自然排序（元素具备比较性）
 *  			让元素所属的类实现Comparable接口
 *  		b:比较器排序（集合具备比较性）
 *  			让集合构造方法接受Comparator接口的实现类对象
 *  	c:讲过的代码看一遍即可
 *  	
 *  	主要条件和多个次要条件：
 *  		主要条件：就是题目要求的，
 *  		次要条件：就是该元素对象所在类的所有成员变量进行compareTo()比较，
 *  
 *  
 *  TreeSet是基于 TreeMap实现的。
 *  TreeMap底层实现是二叉树。（红黑树是一种自平衡的二叉树）
 *  	能够对元素按照某种规则进行排序。
 *  排序有两种方式。并具体取决于构造。
 *  a:自然排序
 *  b:比较器排序
 *  publlic TreeSet() 
 *  	构造一个新的空 set，该 set 根据其元素的自然顺序进行排序。
 *  public TreeSet(Comparator<? super E> comparator)
 *  	构造一个新的空 TreeSet，它根据指定比较器进行排序。
 *  
 *  tree（树）
 *  
 *  TreeSet集合的特点：排序和唯一
 *  
 *  通过观察过观察TreeSet的Add()方法，我们知道了最终要看TreeMap的put()方法
 *  
 *  TreeMap的底层实现是基于二叉树结构的
 *  真正的比较是依赖于元素的compareTo()方法，
 *  而这个方法是定义在Comparable（代表自然排序）里面的。
 *  所以，你要想重写该方法，就必须先实现Comparable接口。
 *  这个借口表示的就是自然排序。
 *  
 *  你一定要分析好主要条件和多个次要条件：
 *  	看例子2
 *  
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// 创建集合对象
		// 自然排序进行排序
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// 创建元素并添加
		ts.add(20);
		ts.add(18); //
		ts.add(23);
		ts.add(22);
		ts.add(17);
		ts.add(24);
		ts.add(19);
		ts.add(18); //
		ts.add(24);

		// 遍历
		for (Integer i : ts) {
			System.out.println(i);
		}
	}
}
