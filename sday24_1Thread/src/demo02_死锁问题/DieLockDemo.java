package demo02_��������;

/*
 * ͬ���ı׶�:
 * 		a:Ч�ʵ͡�
 * 		b:���ײ���������
 * 
 * ������
 * 		���������������ϵ��߳���������Դ�Ĺ����з����ˣ�һ���໥�ȴ�������
 * 
 * ������
 * 		�й��ˣ������˳Է��İ�����
 * 		���������
 * 			�й��ˣ�������ֻ
 * 			�����ˣ����Ͳ�
 * 		���ڣ�
 * 			�й��ˣ�����һֻ����һ��
 * 			�����ˣ�����һֻ����һ��
 * 
 */
public class DieLockDemo {
	
	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);
		
		dl1.start();
		dl2.start();
	}

}
