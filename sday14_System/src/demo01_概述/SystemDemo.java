package demo01_����;

/*
 * System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
 * 
 * ����:
 * public static void gc()����������������
 * 		ִ��System.gc()ǰ,ϵͳ���Զ�����finalize()�����������ռ�е���Դ��ͨ��super.finalize()��ʽ
 * 			����ʵ�ִ��µ��ϵ�finalize()�����ĵ��ã������ͷ��Լ�����Դ����ȥ�ͷŸ������Դ��
 * public static void exit(int status)��ֹ��ǰ�������е� Java �������
 * public static long currentTimeMillis()�����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * 		��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
 * 
 * 
 */
public class SystemDemo {
	
	public static void main(String[] args) {
		Person p = new Person("aa", 60);
		System.out.println(p);
		
		p = null; // ��p����ָ�����ڴ�
		System.gc();
	}

}
