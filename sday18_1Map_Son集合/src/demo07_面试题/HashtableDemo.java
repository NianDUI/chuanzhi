package demo07_������;

import java.util.Hashtable;

/*
 *  1��Hashtable��HashMap������
 *  	Hashtable��
 *  		�̰߳�ȫ��Ч�ʵ͡�������ʹ��null����nullֵ
 *  	HashMap��
 *  		�̲߳���ȫ��Ч�ʸߡ�����ʹ��null����nullֵ
 *  
 *  HashMap�����������Hashtable��
 *  
 *  2��List,Set,Map�Ƚӿ��Ƿ񶼼̳�Map�ӿڣ�
 *  	List��Set���Ǽ̳�Map�ӿڣ����Ǽ̳���Collection�ӿ�
 *  	Map�ӿڱ������һ������ӿ�
 *  
 *  
 */
public class HashtableDemo {
	public static void main(String[] args) {
//		HashMap<String, String> hm = new HashMap<String, String>();
		Hashtable<String, String> hm = new Hashtable<String, String>();

		hm.put("iy001", "hello");
//		hm.put(null, "world"); // NullPointerException	��ֵ�쳣
//		hm.put("java", null); // NullPointerException	��ֵ�쳣

		System.out.println("hm:" + hm);

	}
}
