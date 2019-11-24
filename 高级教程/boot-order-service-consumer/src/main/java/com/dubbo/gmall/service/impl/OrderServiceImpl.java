package com.dubbo.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import bean.UserAddress;
import service.OrderService;
import service.UserService;

/**
 * 1、导入依赖 1）、导入dubbo-starter 2）、导入dubbo的其他依赖
 * 
 * @author 1
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

//	@Autowired
//	@Reference // 引用消费dubbo服务,注册中心宕机后，仍然可以使用因为有缓存（保存的地址）
//	@Reference(url="127.0.0.1:20880") // 无注册中心宕机，通过配置url可以直接连接服务提供者，绕过配置中心zookeeper（dubbo直连）
	@Reference(loadbalance = "random", timeout = 1000) // 负载均衡机制 AbstractLoadBalance的子类 ctrl+t
	UserService userService;

	@HystrixCommand(fallbackMethod="hello")
	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("OrderServiceImpl.initOrder>>用户Id:" + userId);
		// 1.查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);

		return addressList;
	}
	
	public List<UserAddress> hello(String userId) {
		// TODO Auto-generated method stub
		System.out.println("OrderServiceImpl.hello>>用户Id:" + userId);

		return Arrays.asList(new UserAddress(10, "测试地址", "1", "测试", "测试", "Y"));
	}

}
