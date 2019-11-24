package demo03_delete;


/*
 * StringBuffer的删除功能
 *  StringBuffer deleteCharAt(int index) 
          移除此序列指定位置的 char。 并返回本身
 * 
 *  StringBuffer delete(int start, int end) 
          移除此序列的子字符串中的字符。 
          	指定文职开始，指定位置结束的内容。并返回本身
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
		
//		sb.delete(5, 10); //包左不包右
		
		sb.delete(0, sb.length());  // 删除所有数据
		
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		
	}

}
