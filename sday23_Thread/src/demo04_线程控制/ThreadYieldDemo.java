package demo04_�߳̿���;

/*
 *  �����̣߳�
 * public static void yield()
 * 		��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳� 
 * 
 *  ���̵߳�ִ�и���г�����ǲ��ܿ�����֤һ��һ��
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("����ϼ");
		ty2.setName("����");
		
		ty1.start();
		ty2.start();
	}
}
