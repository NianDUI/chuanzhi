package demo06_substring;

/*
 * StringBuffer�Ľ�ȡ����
 *  String substring(int start) 
          ����һ���µ� String�����������ַ����е�ǰ���������ַ������С� 
 * 
 *  String substring(int start, int end) 
          ����һ���µ� String�������������е�ǰ���������ַ������С� 
 * 
 * 
 */
public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		
		
		System.out.println(sb.substring(5));
		System.out.println(sb.substring(5, 10));
		System.out.println(sb);
		
		
	}

}
