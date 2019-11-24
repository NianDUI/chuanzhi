package demo01;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;


/**
 * 演示XStream
 * 可以把JavaBean转换为（序列化）xml
 * @author 1
 *
 */
/*
 * 使用细节：
 * XStream xstream = new XStream();
 * String xmlStr = xstream.toXML(provinceList);
 * 1.别名：把类型对应的元素名修改了
 * 	》xstream.alias("china", List.class); 让List类型生成的元素名为china
 * 	》xstream.alias("province", Province.class); 让Province类型生成的元素名为province
 * 2.使成员变为元素的属性，默认类的成员，生成的是元素的子元素！我们希望类的成员生成元素的属性
 * 	》xstream.useAttributeFor(Province.class, "name"); 把Province类的名为name成员，生成<province>元素的属性
 * 3.去除Collection（集合）类型的成员：我们只需要Collection的内容，而不希望Collection本身也生成一个元素
 * 	》xstream.addImplicitCollection(Province.class, "cities"); 让Province类的名为cities(他是List类型，它的内容还会生成元素)的成员不生成元素
 * 4.去除类的指定成员，让其不生成xml元素
 * 	》xstream.omitField(City.class, "description"); 再生成的xml中不会出现City类的，名为description的对应元素！
 * 
 */
public class Demo01 {
	// 返回JavaBean集合
	public static List<Province> getProvinceList() {
		Province p1 = new Province();
		p1.setName("北京");
		p1.addCity(new City("东城区", "DongChengQu"));
		p1.addCity(new City("昌平区", "ChangPingQu"));

		Province p2 = new Province();
		p2.setName("辽宁");
		p2.addCity(new City("沈阳", "ShenYang"));
		p2.addCity(new City("葫芦岛", "HuLuDao"));

		List<Province> provinceList = new ArrayList<Province>();
		provinceList.add(p1);
		provinceList.add(p2);

		return provinceList;
	}

//	@Test
//	public void fun1() {
//		List<Province> provinceList = getProvinceList();
//		/*
//		 * 创建XStream对象
//		 * 调用toXML把集合转换成XML字符串
//		 */
//		XStream xstream = new XStream();
//		String s = xstream.toXML(provinceList);
//		System.out.println(s);
//	}

	public static void main(String[] args) {
		List<Province> provinceList = getProvinceList();
		/*
		 * 创建XStream对象
		 *  调用toXML把集合转换成XML字符串
		 */
		XStream xstream = new XStream();
		String s = xstream.toXML(provinceList);
		System.out.println(s);
		/*
<list> --> List类型显示为list
  <demo01.Province> --> JavaBean的类型为Province，他的元素名称为完整名
    <name>北京</name> --> JavaBean的属性名
    <cities> --> JavaBean的属性名
      <demo01.City> --> 类名
        <name>东城区</name> --> 属性名
        <description>DongChengQu</description> --> 属性名
      </demo01.City>
      <demo01.City>
        <name>昌平区</name>
        <description>ChangPingQu</description>
      </demo01.City>
    </cities>
  </demo01.Province>
  <demo01.Province>
    <name>辽宁</name>
    <cities>
      <demo01.City>
        <name>沈阳</name>
        <description>ShenYang</description>
      </demo01.City>
      <demo01.City>
        <name>葫芦岛</name>
        <description>HuLuDao</description>
      </demo01.City>
    </cities>
  </demo01.Province>
</list>
		 */
		
		System.out.println("==================2");
		/*
		 * 别名（alias）
		 * 希望：
		 * * 默认List类型对应<list>元素，希望让List类型对应<china>元素
		 * * 默认Province类型对应<demo01.Province>元素，希望让它对应<province>元素
		 * * 默认City类型对应<demo01.City>元素，希望让它对应<city>元素
		 * 
		 */
		/*
		 * 给指定的类型指定别名
		 */
		XStream xstream2 = new XStream();
		xstream2.alias("china", List.class); // 给List类型指定别名，java.util.List.class
		xstream2.alias("province", Province.class); // 给Province指定别名
		xstream2.alias("city", City.class); // 给City指定别名
		String s2 = xstream2.toXML(provinceList);
		System.out.println(s2);
		/*
<china>
  <province>
    <name>北京</name>
    <cities>
      <city>
        <name>东城区</name>
        <description>DongChengQu</description>
      </city>
      <city>
        <name>昌平区</name>
        <description>ChangPingQu</description>
      </city>
    </cities>
  </province>
  <province>
    <name>辽宁</name>
    <cities>
      <city>
        <name>沈阳</name>
        <description>ShenYang</description>
      </city>
      <city>
        <name>葫芦岛</name>
        <description>HuLuDao</description>
      </city>
    </cities>
  </province>
</china>
		 */
		
		System.out.println("==================3");
		/*
		 * 默认javabean的属性都会生成子元素，而现在希望生成元素的属性
		 */
		XStream xstream3 = new XStream();
		xstream3.alias("china", List.class); // 给List类型指定别名，java.util.List.class
		xstream3.alias("province", Province.class); // 给Province指定别名
		xstream3.alias("city", City.class); // 给City指定别名
		// 把Province类型的name属性，生成<province>元素的属性
		xstream3.useAttributeFor(Province.class, "name");
		String s3 = xstream3.toXML(provinceList);
		System.out.println(s3);
		/*
<china>
  <province name="北京">
    <cities>
      <city>
        <name>东城区</name>
        <description>DongChengQu</description>
      </city>
      <city>
        <name>昌平区</name>
        <description>ChangPingQu</description>
      </city>
    </cities>
  </province>
  <province name="辽宁">
    <cities>
      <city>
        <name>沈阳</name>
        <description>ShenYang</description>
      </city>
      <city>
        <name>葫芦岛</name>
        <description>HuLuDao</description>
      </city>
    </cities>
  </province>
</china>
		 */
		
		System.out.println("==================4");
		/*
		 * 去除List类型的属性，只把list中的元素生成xml元素
		 * 去除<cities>这样的Collection类型的属性
		 */
		XStream xstream4 = new XStream();
		xstream4.alias("china", List.class); // 给List类型指定别名，java.util.List.class
		xstream4.alias("province", Province.class); // 给Province指定别名
		xstream4.alias("city", City.class); // 给City指定别名
		xstream4.useAttributeFor(Province.class, "name");
		// 去除Province类的名为cities的List类型的属性
		xstream4.addImplicitCollection(Province.class, "cities");
		String s4 = xstream4.toXML(provinceList);
		System.out.println(s4);
		/*
<china>
  <province name="北京">
    <city>
      <name>东城区</name>
      <description>DongChengQu</description>
    </city>
    <city>
      <name>昌平区</name>
      <description>ChangPingQu</description>
    </city>
  </province>
  <province name="辽宁">
    <city>
      <name>沈阳</name>
      <description>ShenYang</description>
    </city>
    <city>
      <name>葫芦岛</name>
      <description>HuLuDao</description>
    </city>
  </province>
</china>
		 */
		
		System.out.println("==================5");
		/*
		 * 去除不想要的JavaBean属性
		 * 就是让某JavaBean属性，不生成对应的XML元素！
		 */
		XStream xstream5 = new XStream();
		xstream5.alias("china", List.class); // 给List类型指定别名，java.util.List.class
		xstream5.alias("province", Province.class); // 给Province指定别名
		xstream5.alias("city", City.class); // 给City指定别名
		xstream5.useAttributeFor(Province.class, "name");
		xstream5.addImplicitCollection(Province.class, "cities");
		// 让City累的，名为description属性不生成对应的xml元素
		xstream5.omitField(City.class, "description");
		String s5 = xstream5.toXML(provinceList);
		System.out.println(s5);
		/*
<china>
  <province name="北京">
    <city>
      <name>东城区</name>
    </city>
    <city>
      <name>昌平区</name>
    </city>
  </province>
  <province name="辽宁">
    <city>
      <name>沈阳</name>
    </city>
    <city>
      <name>葫芦岛</name>
    </city>
  </province>
</china>
		 */
		
	}
	

}
