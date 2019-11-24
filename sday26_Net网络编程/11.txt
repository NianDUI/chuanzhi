package demo01_InetAddress_IP地址对象类;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 *  如果一个类没有构造方法：
 *  a:成员你全部是静态的（Math,Arrays,Collections）
 *  b:单例设计模式（Runtime）
 *  c:类中有静态方法返回该类的对象(InetAddress)
 *  	class Demo {
 *          private Demo() {}
 *          
 *          public staitc Demo getXxx() {
 *          	return new Demo();
 *          }
 *  	}
 *  
 *  看InetAddress类：
 *  	public static InetAddress getByName(String host) throws UnknownHostException
 *  		根据主机名或IP地址的字符串得到IP地址的对象。
 *      public String getHostName()
 *      	获取此 IP 地址的主机名。  
 *      public String getHostAddress()
 *      	返回 IP 地址字符串（以文本表现形式）。 
 * 
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		// public static InetAddress getByName(String host)
//		InetAddress address = InetAddress.getByName("DESKTOP-C3SM76N");
		InetAddress address = InetAddress.getByName("192.168.3.10");

		// 获取两个东西：主机名，IP地址
		// public String getHostName()
		String name = address.getHostName();
		// public String getHostAddress()
		String ip = address.getHostAddress();
		System.out.println(name + "---" + ip);
	}
}
