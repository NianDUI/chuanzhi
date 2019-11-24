package demo05_LinkedList实现栈结构;

import java.util.LinkedList;

/**
 * 自定义的栈集合。
 * 
 * @author 1
 * @version V1.0
 */
public class MyStack {
	private LinkedList link;
	
	public MyStack() {
		link = new LinkedList();
	}
	
	public void add(Object obj) {
		link.addFirst(obj);
	}
	
	public Object get() {
//		return link.getFirst(); // 错误
		return link.removeFirst();
	}
	
	public boolean isEmpty() {
		return link.isEmpty();
	}
}
