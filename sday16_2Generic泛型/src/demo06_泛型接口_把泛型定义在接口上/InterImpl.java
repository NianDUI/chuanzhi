package demo06_���ͽӿ�_�ѷ��Ͷ����ڽӿ���;

/*
 * ʵ������ʵ�ֽӿڵ�ʱ��
 * ��һ�����: �Ѿ�֪������ʲô�����ˡ���������
 * �ڶ������: ����֪����ʲô���͵ġ�
 */

// ��һ�����: �Ѿ�֪������ʲô�����ˡ���������
//public class InterImpl implements Inter<String>{ // ʵ�ֵ�ʱ���֪���ˡ�
//
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//	}
//
//}

// �ڶ������: ����֪����ʲô���͵ġ�
public class InterImpl<T> implements  Inter<T> { // ������ʱ���֪����

	@Override
	public void show(T t) {
		System.out.println(t);
	}
	
}