package Demo03Lambda;

/*
 * Java����ʹ��Lambda���ʽ��ǰ���ǡ������С�����ʽ�ӿڡ���
 * 
 * ������ҽ���һ�����󷽷��Ľӿڣ��к���ʽ�ӿ�
 *   * ��β�������һʧ�ļ��һ�µ�ǰ����ǲ��Ǻ���ʽ�ӿ��أ�
  *   ��һ���̶��ĸ�ʽж��public interface֮ǰһ�м���
 * @FunctionalInterface
 * public interface ����ʽ�ӿ���{
 * 		// ...
 * }
 */
@FunctionalInterface
public interface Cal {

	int sum(int a, int b);
}
