package demo12_定时器Timer;

import java.util.Timer;
import java.util.TimerTask;

/*
 *  定时器：可以让我们在指定的时间做某件事，还可以重复的做某件事。
 *  依赖Timer和TimerTask这两个类：
 *  Timer：定时器类
 *  	public Timer()
 *  		创建一个新计时器。相关的线程不 作为守护程序运行。
 *  	public void schedule(TimerTask task, long delay)
 *  		安排在指定延迟后执行指定的任务。 （只执行一次）
 *  	public void schedule(TimerTask task, long delay, long period)
 *  		安排指定的任务从指定的延迟后开始进行重复的固定延迟执行。
 *  		（执行多次）以近似固定的时间间隔（由指定的周期分隔）进行后续执行。
 *  	public void cancel() ：必须在任务执行后
 *  		终止此计时器，丢弃所有当前已安排的任务。 
 *  TimerTask：任务类, 抽象类
 *  	public abstract void run()
 *  		此计时器任务要执行的操作.
 *  	public boolean cancel()
 *  		取消此计时器任务。
 *  	
 *  	
 */
public class TimerDemo {
	public static void main(String[] args) {
		// 创建定时器对象
		Timer t = new Timer();
		// 3秒后执行爆炸任务
//		t.schedule(new MyTask(), 3000);
		// 3秒后执行爆炸任务，然后结束任务
		t.schedule(new MyTask(t), 3000);

	}
}

// 做一个任务
class MyTask extends TimerTask {
	private Timer t;

	public MyTask() {
	}

	public MyTask(Timer t) {
		this.t = t;
	}

	@Override
	public void run() {
		System.out.println("beng，爆炸了");
		t.cancel();
	}

}
