package demo01;

/*
 * ��������
 * ��ʽ��
 * ������::��̬������
 * 
 * 
 */
public class Demo01Abs {

	public static void main(String[] args) {
		method(num -> {
			int result;
			if (num >= 0) {
				result = num;
			} else {
				result = -num;
			}
			return result;
		});
		System.out.println("===============");

		// ����Ӧ�õ����壺Math�൱����һ��abs��̬�������Ѿ������ֳɵĹ��ܡ�ֱ�������þ����ˡ�
		method(Math::abs);
	}

	public static void method(Cal cal) {
		int result = cal.getAbs(-25);
		System.out.println("�����" + result);
	}
}
