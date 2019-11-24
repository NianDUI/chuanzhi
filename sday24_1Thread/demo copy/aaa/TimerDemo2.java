package demo12_��ʱ��Timer;

import java.util.Date;
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
public class TimerDemo2 {
	public static void main(String[] args) {
		// ������ʱ������
		Timer t = new Timer();
		// 3���ִ�б�ը�����һ�Σ�������ɹ���ÿ��2s�ڼ���ը
		t.schedule(new MyTask2(), 3000, 2000);
		System.out.println(new Date());

	}
}

// ��һ������
class MyTask2 extends TimerTask {
	@Override
	public void run() {
		System.out.println("beng����ը��" + new Date());
	}

}
