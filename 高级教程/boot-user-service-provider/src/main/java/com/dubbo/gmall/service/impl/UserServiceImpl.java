package com.dubbo.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import bean.UserAddress;
import service.UserService;

/**
 * 1、导入依赖 1）、导入dubbo-starter 2）、导入dubbo的其他依赖
 * 
 * @author 1
 *
 */
@Service // 暴露服务
@Component
public class UserServiceImpl implements UserService {

	@HystrixCommand // 让Hystrix代理方法，出错时由Hystrix处理
	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub

		System.out.println("UserServiceImpl.getUserAddressList..." + "3" + "...");

		UserAddress address1 = new UserAddress(1, "北京", "1", "老师", "1234567891", "Y");
		UserAddress address2 = new UserAddress(1, "河北", "2", "学生", "1234567892", "N");
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		if (Math.random() > 0.5) {
			throw new RuntimeException();
		}

		return Arrays.asList(address1, address2);
	}

}
