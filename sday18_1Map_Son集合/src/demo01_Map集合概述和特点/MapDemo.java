package demo01_Map���ϸ������ص�;

import java.util.HashMap;
import java.util.Map;

/*
 *  ��Ϊѧ����˵���Ǹ���ѧ�������ֲ�ͬ��ѧ���ġ�
 *  ��ô�����������Ѿ�֪����ѧ����ѧ�ţ���Ҫ����ѧ����ѧ��ȥ��ȡѧ����������
 *  ��ô���أ�
 *  �������ǰ��Ľ�����ļ��ϣ�����ֻ�ܰ�ѧ�ź�ѧ��������Ϊһ������ĳ�Ա��
 *  Ȼ��洢����������������ʱ���жϣ���ȡ��Ӧ�����ơ�
 *  �����أ�����Ҷ��ܰ�ѧ���������ó����ˣ�����Ҫ���ݱ��ȥ����
 *  
 *  �������Ŀǰ����������
 *  	����֪��ѧ�ţ�����֪��ѧ�������������զ���ṩ��һ���µļ���Map��
 *  	ͨ���鿴API������֪����Map���ϵ�һ�������ص㣬���������Դ洢��ֵ�Ե�Ԫ�ء�
 *  	���ʱ��洢�������������	���Ϳ����������� 
 *  		ѧ��1	����1
 *  		ѧ��2	����2
 *  		ѧ��3	����3
 *  		ѧ��2(����)	����4
 *  		ѧ��4	����3(����)
 *  
 *  public interface Map<K,V>�����ص㣩
 *  	����ӳ�䵽ֵ�Ķ���
 *  	һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ�� 
 *  
 *  K - ��ӳ����ά���ļ�������
 *  V - ӳ��ֵ������
 *  
 *  Map���Ϻ�Collection���ϵ�����
 *  	Map���ϴ洢Ԫ���ǳɶԳ��ֵģ�Map���ϵļ���Ψһ��ֵ�����ظ������԰�������Ϊ�����޶�
 *  	Collection���ϴ洢Ԫ���ǵ������ֵģ�Collection�Ķ���Set��Ψһ�ģ�List�ǿ����ظ��ġ����԰�������Ϊ�����
 *  
 *  ע�⣺
 *  	Map���ϵ����ݽṹ��Լ���Ч����ֵ�޹�
 *  	Collection���ϵ����ݽṹ�����Ԫ����Ч��
 *  
 *  Map��
 *  	HashMap
 *  	TreeMap
 *  
 *  Map���ϵĹ��ܸ�����
 *  1����ӹ���
 *  	V put(K key, V value)�����Ԫ�ء������ʵ������һ�����ܣ�
 *  		��������ǵ�һ�δ洢�;�ֱ�Ӵ洢Ԫ�أ�����null
 *  		��������ǵ�һ�δ洢������ֵ����ǰ��ֵ�滻����������ǰ��ֵ��
 *  	
 *  		��ָ����ֵ���ӳ���е�ָ������������ѡ��������
 *  	void putAll(Map<? extends K,? extends V> m)��
 *  2��ɾ������
 *  	void clear()���Ƴ����еļ�ֵ��Ԫ��
 *  	V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
 *  		�������һ������ӳ���ϵ������Ӵ�ӳ�����Ƴ�����ѡ��������
 *  3���жϹ���
 *  	boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
 *  		�����ӳ�����ָ������ӳ���ϵ���򷵻� true��
 *  	boolean containsValue(Object value)���жϼ����Ƿ����ָ����ֵ
 *  		�����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true��
 *  	boolean isEmpty()���жϼ����Ƿ�Ϊ��
 *  		�����ӳ��δ������-ֵӳ���ϵ���򷵻� true�� 
 *  4����ȡ����
 *  	Set<Map.Entry<K,V>> entrySet()����ȡ���м�ֵ�Զ���ļ���
 *  		���ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ��
 *  	V get(Object key)�����ݼ���ȡֵ
 *  		����ָ������ӳ���ֵ�������ӳ�䲻�����ü���ӳ���ϵ���򷵻� null�� 
 *  	Set<K> keySet()����ȡ���������м��ļ���
 *  		���ش�ӳ���а����ļ��� Set ��ͼ��
 *  	Collection<V> values()����ȡ����������ֵ�ļ���
 *  		���ش�ӳ���а�����ֵ�� Collection ��ͼ
 *  5�����ȹ���
 *  	int size()�����ؼ����еļ�ֵ�ԵĶ���
 *  		���ش�ӳ���еļ�-ֵӳ���ϵ����
 *  
 *  
 *  
 */
public class MapDemo {
	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();
		
		// ���Ԫ��
		// V put(K key, V value)�����Ԫ�ء������ʵ������һ�����ܣ�
//		System.out.println("put:" + map.put("����", "�����P"));
//		System.out.println("put:" + map.put("����", "Ҧ��"));
		
		map.put("�˳�", "��ٳ");
		map.put("������", "��ӱ");
		map.put("�ܽ���", "������");
		map.put("������", "����");
		
		// void clear()���Ƴ����еļ�ֵ��Ԫ��
//		map.clear();
		
		// V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
		// ���ڷ��ؼ��������ڷ���null
//		System.out.println("remove:" + map.remove("������")); // remove:��ӱ
//		System.out.println("remove:" + map.remove("�ƺ���")); // remove:null
		
		// boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
//		System.out.println("containsKey:" + map.containsKey("������")); // containsKey:true
//		System.out.println("containsKey:" + map.containsKey("�ƺ���")); // containsKey:false
		
		// boolean isEmpty()���жϼ����Ƿ�Ϊ��
//		System.out.println("isEmpty:" + map.isEmpty());
		
		// int size()�����ؼ����еļ�ֵ�ԵĶ���
		System.out.println("size:" + map.size());
		
		// �����������
		System.out.println("map:" + map); 
	}
}
