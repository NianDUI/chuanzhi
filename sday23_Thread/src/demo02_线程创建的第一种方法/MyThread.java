package demo02_�̴߳����ĵ�һ�ַ���;

/*
 * 	������������run()������
 *  	Ϊʲô��run()������
 *  �������е����д��붼��Ҫ���߳�ִ�С�
 *  �����ʱ��Ϊ��������Щ�����ܹ����߳�ִ�У�java�ṩ��Thread���е�run()����������Щ���߳�ִ�еĴ��롣
 */
public class MyThread extends Thread {
	
	@Override
	public void run() {
		// �Լ�д����
		// System.out.println("�ú�ѧϰ����������");
		// һ����˵�����߳�ִ�еĴ���϶��ǱȽϺ�ʱ�ġ���������Ҫ��ѭ���Ľ���
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}
