package demo02;

/*
 * 
 * public static void exit(int status)��ֹ��ǰ�������е� Java �������
 * 	��������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ�� 
		�÷������� Runtime ���е� exit �������÷�����Զ�����������ء� 
		���� System.exit(n) ʵ���ϵ�Ч�ڵ��ã� 
 		Runtime.getRuntime().exit(n)
 * public static long currentTimeMillis()�����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
 * 	���أ�
		��ǰʱ����Э������ʱ 1970 �� 1 �� 1 ��0����ҹ֮���ʱ���Ժ���Ϊ��λ��������
 * 
 */
public class SystemDemo {
	
	public static void main(String[] args) {
//		System.out.println("����ϲ������ϼ");
//		System.exit(0);
//		System.out.println("��ôҲϲ������֥");
		
		System.out.println(System.currentTimeMillis());
		// �����õ�������ʱ�䣬Ŀǰ��������˵���岻��
		// ��ô��������ʲô�����أ�
		// Ҫ�����Ҹ���ͳ�Ƶöγ��������ʱ�䡣
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			System.out.println("Hello" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "����");
		
		
	}

}
