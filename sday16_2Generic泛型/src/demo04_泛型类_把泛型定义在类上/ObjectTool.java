package demo04_������_�ѷ��Ͷ���������;

/*
 * ������:�ѷ��Ͷ��������ϡ�
 * 
 * ��ʽ���������ӣ�<����>
 * ����:�������ͱ�ʶ�����С�T,abc...
 * 
 * ��ʽ��public class ����<��������1, ...>
 * ע�⣺�������ͱ�������������
 */
public class ObjectTool<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
