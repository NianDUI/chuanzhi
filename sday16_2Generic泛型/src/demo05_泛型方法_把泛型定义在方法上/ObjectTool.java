package demo05_���ͷ���_�ѷ��Ͷ����ڷ�����;

//public class ObjectTool<T> {
//
//	// �����Ѻ�
////	public void show(String s) {
////		System.out.println(s);
////	}
////
////	public void show(Integer i) {
////		System.out.println(i);
////	}
////
////	public void show(boolean b) {
////		System.out.println(b);
////	}
//	
//
//	public void show(T t) {
//		System.out.println(t);
//	}
//}

/*
 * ���ͷ������ѷ��Ͷ����ڷ����ϡ�
 * 
 * 
 * ��ʽ��public <��������> �������� ������(��������  .)
 */
public class ObjectTool {
	public <T> void show(T t) {
		System.out.println(t);
	}
}
