package demo05_reverse;

/*
 * StringBuffer�ķ�ת����
 *  StringBuffer reverse() 
          �����ַ��������䷴ת��ʽȡ���� 
 * 
 * 
 */
public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
	}

}
