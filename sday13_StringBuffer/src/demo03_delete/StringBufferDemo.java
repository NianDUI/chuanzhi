package demo03_delete;


/*
 * StringBuffer��ɾ������
 *  StringBuffer deleteCharAt(int index) 
          �Ƴ�������ָ��λ�õ� char�� �����ر���
 * 
 *  StringBuffer delete(int start, int end) 
          �Ƴ������е����ַ����е��ַ��� 
          	ָ����ְ��ʼ��ָ��λ�ý��������ݡ������ر���
 * 
 * 
 */
public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		
//		sb.deleteCharAt(1);
//		sb.deleteCharAt(1);
		
//		sb.delete(5, 10); //���󲻰���
		
		sb.delete(0, sb.length());  // ɾ����������
		
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		
	}

}
