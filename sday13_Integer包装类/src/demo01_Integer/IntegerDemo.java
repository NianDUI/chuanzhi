package demo01_Integer;

/*
 * 	����һ����Ҫ���Ұ��°�������ݵĶ����ư˽��ƣ�ʮ�����Ƽ��������
 * 	���������Ҫ�����ж�һ�������Ƿ�int�ķ�Χ�ڵġ�
 * 		�������֪��int�ķ�Χ�Ƕ��
 * 
 * �������� ��װ������
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 * 
 * �����Ĳ���:���ڻ��������������ַ���֮���ת����
 */
public class IntegerDemo {

	public static void main(String[] args) {
		//���鷳�ģ������ˡ�
		
		// public static String toBinaryString(int i)�Զ����ƣ����� 2���޷���������ʽ����һ�������������ַ�����ʾ��ʽ�� 
		System.out.println(Integer.toBinaryString(100));
		// public static String toOctalString(int i)�԰˽��ƣ����� 8���޷���������ʽ����һ�������������ַ�����ʾ��ʽ�� 
		System.out.println(Integer.toOctalString(100));
		// public static String toHexString(int i)��ʮ�����ƣ����� 16���޷���������ʽ����һ�������������ַ�����ʾ��ʽ�� 
		System.out.println(Integer.toHexString(100));
		
		// public static final int MAX_VALUEֵΪ 2^31��1 �ĳ���������ʾ int �����ܹ���ʾ�����ֵ�� 
		System.out.println(Integer.MAX_VALUE);
		// public static final int MIN_VALUEֵΪ ��2^31 �ĳ���������ʾ int �����ܹ���ʾ����Сֵ�� 
		System.out.println(Integer.MIN_VALUE);
		
	}
	
}
