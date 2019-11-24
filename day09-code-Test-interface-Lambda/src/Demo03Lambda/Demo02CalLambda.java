package Demo03Lambda;

/*
 * ����ʽ���˼��
 * Java����ʹ��Lambda���ʽ��ǰ���ǡ������С�����ʽ�ӿڡ���
 * 
 * ������ҽ���һ�����󷽷��Ľӿڣ��к���ʽ�ӿ�
 * 
  * ��β�������һʧ�ļ��һ�µ�ǰ����ǲ��Ǻ���ʽ�ӿ��أ�
  *   ��һ���̶��ĸ�ʽж��public interface֮ǰһ�м���
 * @FunctionalInterface
 * public interface ����ʽ�ӿ���{
 * 		// ...
 * }
 * 
 */

public class Demo02CalLambda {

	public static void main(String[] args) {
		method((a, b) -> a + b);
		
		/**
		 * Lamvda���ʽ��(a, b) -> a + b
		 * method������Ҫһ��Cal�ӿ����͵Ĳ���
		 * Lambda���ʽ���Ǵӵ���Cal�ӿ����͵Ĳ���
		  * ������⣺
		 * 1.Lambda���ʽǰ���С���ţ���ʵ���ǽӿڳ��󷽷���С����
		 * 2.��ͷ��������С���ŵ�������ʲô���飬��һ��ָ��Ķ���
		 * 3.��ͷ����ʹ���ﵽ�˲���֮����ʲô���顣
		 * Lambda���ʽ���屾�¾ʹ�������ô��������飬��û�ж���ĵĸ��������档�����Ӽ�ֱ�ۣ�
		 * 
		 */
	}
	
	public static void method(Cal cal) {
		int result = cal.sum(10, 20);
		System.out.println("����ǣ�" + result);
	}
	
}
