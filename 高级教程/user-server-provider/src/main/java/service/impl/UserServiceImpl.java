package service.impl;

import java.util.Arrays;
import java.util.List;

import bean.UserAddress;
import service.UserService;

/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 * 		1）、导入dubbo依赖（2.6.2）\操作zookeeper的客户端(curator)
 * 		2）、配置服务提供者
 * 
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 * @author 1
 *
 */
public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		
		System.out.println("UserServiceImpl.getUserAddressList....:"
				+ "old");
		
		UserAddress address1 = new UserAddress(1, "北京", "1", "老师", "1234567891", "Y");
		UserAddress address2 = new UserAddress(1, "河北", "2", "学生", "1234567892", "N");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Arrays.asList(address1, address2);
	}

}
