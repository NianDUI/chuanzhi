package demo03_线程的名字;

/*
 * 如何获取线程对象的名称呢？
 *  String getName() 
          返回该线程的名称 
 *如何设置线程对象的名称呢？
 * void setName(String name) 
          改变线程名称，使之与参数 name 相同。 
 *
 *针对不是Thread类的子类中如何获取线程对象名称呢？
 *public static Thread currentThread()：返回对当前正在执行的线程对象的引用。
 *Thread.currentThread().getName()
 */
public class MyThreadDemo {
	public static void main(String[] args) {
//		// 创建两个线程
//		// 无参构造+setXxx()
//		MyThread my1 = new MyThread();
//		MyThread my2 = new MyThread();
//		
//		// 调用方法设置名称
//		my1.setName("林青霞");
//		my2.setName("刘健");
//
//		my1.start();
//		my2.start();
		
//		// 带参构造方法给线程起名字
//		MyThread my1 = new MyThread("林青霞");
//		MyThread my2 = new MyThread("刘健");
//
//		my1.start();
//		my2.start();
		
		
		// 我要获取main方法所在线程对象的名字，该怎么办呢？
		// 遇到这种情况，Thread类提供了一个很好玩的方法
		// public static Thread currentThread()：返回对当前正在执行的线程对象的引用。 
		System.out.println(Thread.currentThread().getName());
		
	}
}
/*
名字为什么是Thread-? 编号
class Thread {
    public Thread() {
        init(null, null, "Thread-" + nextThreadNum(), 0);
    }
    
    private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize) {
        init(g, target, name, stackSize, null, true);
    }
    
     private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize, AccessControlContext acc,
                      boolean inheritThreadLocals) {
        // 大部分被省略了
        this.name = name;
    }
    
    private static int threadInitNumber; //默认为0,1,2
    private static synchronized int nextThreadNum() {
        return threadInitNumber++; // 0,1
    }
    
    public final String getName() {
        return name;
    }
    
    public final synchronized void setName(String name) {
        checkAccess();
        if (name == null) {
            throw new NullPointerException("name cannot be null");
        }

        this.name = name;
        if (threadStatus != 0) {
            setNativeName(name);
        }
    
}

public class MyThread extends Thread {
    public MYThread() {
    	super();
    }
}
*/