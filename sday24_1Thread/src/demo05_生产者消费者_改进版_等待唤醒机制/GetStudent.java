package demo05_生产者消费者_改进版_等待唤醒机制;

public class GetStudent implements Runnable {
	private Student s;

	public GetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				// 判断有没有
				if (!s.flag) {
					try {
						s.wait(); // t2就等待了。立即释放锁。将来醒过来的时候，是从这里醒过来
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(s.name + "---" + s.age);
				
				// 修改标记
				s.flag = false;
				// 唤醒线程
				s.notify();
			}
		}

	}

}
