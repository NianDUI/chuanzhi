package demo05_JDK5������;

/*
 * JDK5������
 * �Զ�װ�䣺�������� ��������װ������
 * �Զ����䣺��װ������ -����������
 * 
 * ע��һ��С����
 * 	
 */
public class IntegerDemo {

	public static void main(String[] args) {
//		Integer i = new Integer(100);
		Integer ii = 100; // ii = Integer.valueOf(100)
		ii += 200; // ii = Integer.valueOf(ii.inValue() + 200)
		System.out.println("ii:" + ii); // new StringBuilder("ii:").append(ii).toString()

		// ע��һ��С����
		Integer iii = null;
		// java.lang.NullPointerException
		if (iii != null) { // �������ж�null��ʹ��
			iii += 100;
			System.out.println(iii);
		}
	}

}
