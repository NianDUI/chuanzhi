package demo03_�̵߳�����;

/*
 * ��λ�ȡ�̶߳���������أ�
 *  String getName() 
          ���ظ��̵߳����� 
 *��������̶߳���������أ�
 * void setName(String name) 
          �ı��߳����ƣ�ʹ֮����� name ��ͬ�� 
 *
 *��Բ���Thread�����������λ�ȡ�̶߳��������أ�
 *public static Thread currentThread()�����ضԵ�ǰ����ִ�е��̶߳�������á�
 *Thread.currentThread().getName()
 */
public class MyThreadDemo {
	public static void main(String[] args) {
//		// ���������߳�
//		// �޲ι���+setXxx()
//		MyThread my1 = new MyThread();
//		MyThread my2 = new MyThread();
//		
//		// ���÷�����������
//		my1.setName("����ϼ");
//		my2.setName("����");
//
//		my1.start();
//		my2.start();
		
//		// ���ι��췽�����߳�������
//		MyThread my1 = new MyThread("����ϼ");
//		MyThread my2 = new MyThread("����");
//
//		my1.start();
//		my2.start();
		
		
		// ��Ҫ��ȡmain���������̶߳�������֣�����ô���أ�
		// �������������Thread���ṩ��һ���ܺ���ķ���
		// public static Thread currentThread()�����ضԵ�ǰ����ִ�е��̶߳�������á� 
		System.out.println(Thread.currentThread().getName());
		
	}
}
/*
����Ϊʲô��Thread-? ���
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
        // �󲿷ֱ�ʡ����
        this.name = name;
    }
    
    private static int threadInitNumber; //Ĭ��Ϊ0,1,2
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