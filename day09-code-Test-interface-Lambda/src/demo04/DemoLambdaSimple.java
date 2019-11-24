package demo04;

/*
 * ��Lambda���ʽ���У����ǿ��Ƶ��ģ����ǿ�ʡ�Եġ�
 * 1.Lambda���ʽ���еĲ������Ϳ���ʡ�Բ�д
 * 2.�����������ֻ��һ������ôС���ſ���ʡ��
 * 3.������ֻ��һ������ô�����ź�returnҲ����ʡ��
 * 
 */
public class DemoLambdaSimple {
	private static DemoLambdaSimple demo;
	private int a;

	private DemoLambdaSimple() {

	}

	private DemoLambdaSimple(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		// ��׼��ʽ��
		method((int x) -> {
			return ++x;
		});

		// ʡ�Բ�������
		method((x) -> {
			return ++x;
		});

		// ʡ�Բ���С����
		method(x -> {
			return ++x;
		});

		// ʡ�Դ����ź�return�ؼ���
		method(x -> ++x);

		System.out.println(getDemo(10).toString());
		System.out.println(getDemo(10).toString());
		System.out.println(getDemo(10).toString());
		
	
		
	}

	public static void method(MyInter inter) {
		int result = inter.singlePlus(10);
		System.err.println(result);
	}

	public static synchronized DemoLambdaSimple getDemo() {
		if (demo == null) {
			demo = new DemoLambdaSimple();
		}
		return demo;
	}

	public static synchronized DemoLambdaSimple getDemo(int a) {
		if (demo == null) {
			demo = new DemoLambdaSimple(a);
		}
		return demo;
	}
}
