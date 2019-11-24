package demo12_��ʱ��Timer;

import java.util.Timer;
import java.util.TimerTask;

/*
 *  ��ʱ����������������ָ����ʱ����ĳ���£��������ظ�����ĳ���¡�
 *  ����Timer��TimerTask�������ࣺ
 *  Timer����ʱ����
 *  	public Timer()
 *  		����һ���¼�ʱ������ص��̲߳� ��Ϊ�ػ��������С�
 *  	public void schedule(TimerTask task, long delay)
 *  		������ָ���ӳٺ�ִ��ָ�������� ��ִֻ��һ�Σ�
 *  	public void schedule(TimerTask task, long delay, long period)
 *  		����ָ���������ָ�����ӳٺ�ʼ�����ظ��Ĺ̶��ӳ�ִ�С�
 *  		��ִ�ж�Σ��Խ��ƹ̶���ʱ��������ָ�������ڷָ������к���ִ�С�
 *  	public void cancel() ������������ִ�к�
 *  		��ֹ�˼�ʱ�����������е�ǰ�Ѱ��ŵ����� 
 *  TimerTask��������, ������
 *  	public abstract void run()
 *  		�˼�ʱ������Ҫִ�еĲ���.
 *  	public boolean cancel()
 *  		ȡ���˼�ʱ������
 *  	
 *  	
 */
public class TimerDemo {
	public static void main(String[] args) {
		// ������ʱ������
		Timer t = new Timer();
		// 3���ִ�б�ը����
//		t.schedule(new MyTask(), 3000);
		// 3���ִ�б�ը����Ȼ���������
		t.schedule(new MyTask(t), 3000);

	}
}

// ��һ������
class MyTask extends TimerTask {
	private Timer t;

	public MyTask() {
	}

	public MyTask(Timer t) {
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println("beng����ը��");
		t.cancel();
	}

}
