package demo02_add;

/*
 * StringBuffer����ӹ���
 * ���
 *  StringBuffer append(String str) �����з������أ���������
          ��ָ�����ַ���׷�ӵ����ַ����С� 
          	���صĶ�����ʵ�������Լ����� ��û�����¿��ռ�
 * 
 * ����
 *  StringBuffer insert(int offset, String str) 
          ���ַ���������ַ������С� 
          	��ָ��λ�ò��� �����з������أ���������
 * 
 * 
 * 
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

//		StringBuffer sb2 = sb.append("hello"); // 
//		System.out.println(sb);
//		System.out.println(sb2);
//		System.out.println(sb == sb2); // true
//		System.out.println("-----------");

//		sb.append("hello");
//		sb.append(true);
//		sb.append(12);
//		sb.append(34.56);

		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println(sb);
		
		sb.insert(5, "world");
		System.out.println(sb);
		
		
	}

}
