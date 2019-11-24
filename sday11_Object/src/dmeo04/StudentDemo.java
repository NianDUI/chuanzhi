package dmeo04;

/*
 * Object累的方法:
 * 		protected void finalize()  用于垃圾回收,什么时候回收不确定
                 throws Throwable
                 当垃圾回收器确定不存在对该对象的更多引用时，
                  由对象的垃圾回收器调用此方法。
 * 
 * 		protected Object clone()
                throws CloneNotSupportedException
                创建并返回此对象的一个副本
 * 
 *  public interface Cloneable 这是一个标记接口，
 *  	此类实现了 Cloneable 接口，以指示 Object.clone()
 *  		方法可以合法地对该类实例进行按字段复制。
 *  	如果在没有实现 Cloneable 接口的实例上调用 Object 的 
 *  		clone 方法，则会导致抛出 CloneNotSupportedException
 *  		 异常。  
 * 
 * 
 */
public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student("林青霞", 27);
		Object obj = s.clone();
		Student s2 = (Student) obj;
		System.out.println(s2.getName()+s2.getAge());
	}

}
