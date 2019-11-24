package demo04_Ïß³Ì¿ØÖÆ;

public class ThreadDaemon extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + ":" + i);
		}
	}
}
