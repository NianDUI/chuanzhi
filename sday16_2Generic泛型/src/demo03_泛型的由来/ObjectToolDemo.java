package demo03_���͵�����;

/*
 * ���ڵ�ʱ������ʹ��Object�������������͡�
 * 
 * ����ת����û���κ�����ģ�����������ת�͵�ʱ����ʵ����������ת�������⡣
 * Ҳ����˵�����ĳ�����ʵ�����ǰ�ȫ�ġ�����Java��JDK5�Ժ������˷��ͣ���߳���İ�ȫ�ԡ�
 * 
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();

		// ����ʹ��
		ot.setObj(Integer.valueOf(27));
		Integer i = (Integer) ot.getObj();
		System.out.println("�����ǣ�" + i);

		ot.setObj(new String("����ϼ"));
		String s = (String) ot.getObj();
		System.out.println("�����ǣ�" + s);
		
		System.out.println("----------");
		ot.setObj(Integer.valueOf(30));
		String ss = (String) ot.getObj(); // ClassCastException
		System.out.println("�����ǣ�" + ss);
		
		
		
	}
}
