package demo04_������_�ѷ��Ͷ���������;

/*
 * ������Ĳ���
 * 
 * ���͵��÷�
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
//		ObjectTool ot = new ObjectTool();
//
//		ot.setObj(new String("������"));
//		String s = (String) ot.getObj();
//		System.out.println("�����ǣ�" + s);
//		
//		ot.setObj(Integer.valueOf(30));
//		Integer i = (Integer) ot.getObj();
//		System.out.println("�����ǣ�" + i);

//		ot.setObj(new String("����ϼ"));
//		// ClassCastException
//		Integer ii = (Integer) ot.getObj();
//		System.out.println("�����ǣ�" + ii);

		System.out.println("---------------");

		ObjectTool<String> ot = new ObjectTool<String>();
//		ot.setObj(Integer.valueOf(27)); // ���ʱ������ڼ�͹���ȥ��
		ot.setObj("����ϼ");
		String s = ot.getObj();
		System.out.println("�����ǣ�" + s);

		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
//		ot2.setObj("������"); // ���ʱ������ڼ�͹���ȥ��
		ot2.setObj(Integer.valueOf(27));
		Integer i = ot2.getObj();
		System.out.println("�����ǣ�" + i);

	}
}
