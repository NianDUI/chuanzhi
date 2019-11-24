package demo01;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;


/**
 * ��ʾXStream
 * ���԰�JavaBeanת��Ϊ�����л���xml
 * @author 1
 *
 */
/*
 * ʹ��ϸ�ڣ�
 * XStream xstream = new XStream();
 * String xmlStr = xstream.toXML(provinceList);
 * 1.�����������Ͷ�Ӧ��Ԫ�����޸���
 * 	��xstream.alias("china", List.class); ��List�������ɵ�Ԫ����Ϊchina
 * 	��xstream.alias("province", Province.class); ��Province�������ɵ�Ԫ����Ϊprovince
 * 2.ʹ��Ա��ΪԪ�ص����ԣ�Ĭ����ĳ�Ա�����ɵ���Ԫ�ص���Ԫ�أ�����ϣ����ĳ�Ա����Ԫ�ص�����
 * 	��xstream.useAttributeFor(Province.class, "name"); ��Province�����Ϊname��Ա������<province>Ԫ�ص�����
 * 3.ȥ��Collection�����ϣ����͵ĳ�Ա������ֻ��ҪCollection�����ݣ�����ϣ��Collection����Ҳ����һ��Ԫ��
 * 	��xstream.addImplicitCollection(Province.class, "cities"); ��Province�����Ϊcities(����List���ͣ��������ݻ�������Ԫ��)�ĳ�Ա������Ԫ��
 * 4.ȥ�����ָ����Ա�����䲻����xmlԪ��
 * 	��xstream.omitField(City.class, "description"); �����ɵ�xml�в������City��ģ���Ϊdescription�Ķ�ӦԪ�أ�
 * 
 */
public class Demo01 {
	// ����JavaBean����
	public static List<Province> getProvinceList() {
		Province p1 = new Province();
		p1.setName("����");
		p1.addCity(new City("������", "DongChengQu"));
		p1.addCity(new City("��ƽ��", "ChangPingQu"));

		Province p2 = new Province();
		p2.setName("����");
		p2.addCity(new City("����", "ShenYang"));
		p2.addCity(new City("��«��", "HuLuDao"));

		List<Province> provinceList = new ArrayList<Province>();
		provinceList.add(p1);
		provinceList.add(p2);

		return provinceList;
	}

//	@Test
//	public void fun1() {
//		List<Province> provinceList = getProvinceList();
//		/*
//		 * ����XStream����
//		 * ����toXML�Ѽ���ת����XML�ַ���
//		 */
//		XStream xstream = new XStream();
//		String s = xstream.toXML(provinceList);
//		System.out.println(s);
//	}

	public static void main(String[] args) {
		List<Province> provinceList = getProvinceList();
		/*
		 * ����XStream����
		 *  ����toXML�Ѽ���ת����XML�ַ���
		 */
		XStream xstream = new XStream();
		String s = xstream.toXML(provinceList);
		System.out.println(s);
		/*
<list> --> List������ʾΪlist
  <demo01.Province> --> JavaBean������ΪProvince������Ԫ������Ϊ������
    <name>����</name> --> JavaBean��������
    <cities> --> JavaBean��������
      <demo01.City> --> ����
        <name>������</name> --> ������
        <description>DongChengQu</description> --> ������
      </demo01.City>
      <demo01.City>
        <name>��ƽ��</name>
        <description>ChangPingQu</description>
      </demo01.City>
    </cities>
  </demo01.Province>
  <demo01.Province>
    <name>����</name>
    <cities>
      <demo01.City>
        <name>����</name>
        <description>ShenYang</description>
      </demo01.City>
      <demo01.City>
        <name>��«��</name>
        <description>HuLuDao</description>
      </demo01.City>
    </cities>
  </demo01.Province>
</list>
		 */
		
		System.out.println("==================2");
		/*
		 * ������alias��
		 * ϣ����
		 * * Ĭ��List���Ͷ�Ӧ<list>Ԫ�أ�ϣ����List���Ͷ�Ӧ<china>Ԫ��
		 * * Ĭ��Province���Ͷ�Ӧ<demo01.Province>Ԫ�أ�ϣ��������Ӧ<province>Ԫ��
		 * * Ĭ��City���Ͷ�Ӧ<demo01.City>Ԫ�أ�ϣ��������Ӧ<city>Ԫ��
		 * 
		 */
		/*
		 * ��ָ��������ָ������
		 */
		XStream xstream2 = new XStream();
		xstream2.alias("china", List.class); // ��List����ָ��������java.util.List.class
		xstream2.alias("province", Province.class); // ��Provinceָ������
		xstream2.alias("city", City.class); // ��Cityָ������
		String s2 = xstream2.toXML(provinceList);
		System.out.println(s2);
		/*
<china>
  <province>
    <name>����</name>
    <cities>
      <city>
        <name>������</name>
        <description>DongChengQu</description>
      </city>
      <city>
        <name>��ƽ��</name>
        <description>ChangPingQu</description>
      </city>
    </cities>
  </province>
  <province>
    <name>����</name>
    <cities>
      <city>
        <name>����</name>
        <description>ShenYang</description>
      </city>
      <city>
        <name>��«��</name>
        <description>HuLuDao</description>
      </city>
    </cities>
  </province>
</china>
		 */
		
		System.out.println("==================3");
		/*
		 * Ĭ��javabean�����Զ���������Ԫ�أ�������ϣ������Ԫ�ص�����
		 */
		XStream xstream3 = new XStream();
		xstream3.alias("china", List.class); // ��List����ָ��������java.util.List.class
		xstream3.alias("province", Province.class); // ��Provinceָ������
		xstream3.alias("city", City.class); // ��Cityָ������
		// ��Province���͵�name���ԣ�����<province>Ԫ�ص�����
		xstream3.useAttributeFor(Province.class, "name");
		String s3 = xstream3.toXML(provinceList);
		System.out.println(s3);
		/*
<china>
  <province name="����">
    <cities>
      <city>
        <name>������</name>
        <description>DongChengQu</description>
      </city>
      <city>
        <name>��ƽ��</name>
        <description>ChangPingQu</description>
      </city>
    </cities>
  </province>
  <province name="����">
    <cities>
      <city>
        <name>����</name>
        <description>ShenYang</description>
      </city>
      <city>
        <name>��«��</name>
        <description>HuLuDao</description>
      </city>
    </cities>
  </province>
</china>
		 */
		
		System.out.println("==================4");
		/*
		 * ȥ��List���͵����ԣ�ֻ��list�е�Ԫ������xmlԪ��
		 * ȥ��<cities>������Collection���͵�����
		 */
		XStream xstream4 = new XStream();
		xstream4.alias("china", List.class); // ��List����ָ��������java.util.List.class
		xstream4.alias("province", Province.class); // ��Provinceָ������
		xstream4.alias("city", City.class); // ��Cityָ������
		xstream4.useAttributeFor(Province.class, "name");
		// ȥ��Province�����Ϊcities��List���͵�����
		xstream4.addImplicitCollection(Province.class, "cities");
		String s4 = xstream4.toXML(provinceList);
		System.out.println(s4);
		/*
<china>
  <province name="����">
    <city>
      <name>������</name>
      <description>DongChengQu</description>
    </city>
    <city>
      <name>��ƽ��</name>
      <description>ChangPingQu</description>
    </city>
  </province>
  <province name="����">
    <city>
      <name>����</name>
      <description>ShenYang</description>
    </city>
    <city>
      <name>��«��</name>
      <description>HuLuDao</description>
    </city>
  </province>
</china>
		 */
		
		System.out.println("==================5");
		/*
		 * ȥ������Ҫ��JavaBean����
		 * ������ĳJavaBean���ԣ������ɶ�Ӧ��XMLԪ�أ�
		 */
		XStream xstream5 = new XStream();
		xstream5.alias("china", List.class); // ��List����ָ��������java.util.List.class
		xstream5.alias("province", Province.class); // ��Provinceָ������
		xstream5.alias("city", City.class); // ��Cityָ������
		xstream5.useAttributeFor(Province.class, "name");
		xstream5.addImplicitCollection(Province.class, "cities");
		// ��City�۵ģ���Ϊdescription���Բ����ɶ�Ӧ��xmlԪ��
		xstream5.omitField(City.class, "description");
		String s5 = xstream5.toXML(provinceList);
		System.out.println(s5);
		/*
<china>
  <province name="����">
    <city>
      <name>������</name>
    </city>
    <city>
      <name>��ƽ��</name>
    </city>
  </province>
  <province name="����">
    <city>
      <name>����</name>
    </city>
    <city>
      <name>��«��</name>
    </city>
  </province>
</china>
		 */
		
	}
	

}
