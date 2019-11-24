package demo03_�������ģʽ;

import java.io.IOException;

/*
 * Runtime: ����ģʽ�����Ե���DOS����
 * public class Runtime extends Object
 * 		ÿ�� Java Ӧ�ó�����һ�� Runtime ��ʵ����
 * 		ʹӦ�ó����ܹ��������еĻ��������ӡ�
 * 		����ͨ�� getRuntime ������ȡ��ǰ����ʱ�� 
 * 	Ӧ�ó����ܴ����Լ��� Runtime ��ʵ����������ģʽ�� 
 * public Process exec(String command) throws IOException
 * 		�ڵ����Ľ�����ִ��ָ�����ַ������ 
 * 		����ִ��DOS����
 * 
 */
public class RuntimeDemo {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
//		r.exec("notepad"); // �򿪼��±���������ģ�����
//		System.out.println(r.exec("ipconfig"));
//		r.exec("calc"); // �򿪼�����
		r.exec("shutdown -s -t 10000"); // 10000s��ػ�
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		r.exec("shutdown -a"); // ȡ���ػ�
		
		
	}
}

/*
public class Runtime {
    private Runtime() {}
    
    private static final Runtime currentRuntime = new Runtime();

    public static Runtime getRuntime() {
        return currentRuntime;
    }
}
*/