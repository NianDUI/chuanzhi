package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.UserAddress;
import service.OrderService;
import service.UserService;

/**
 * 1���������ṩ��ע�ᵽע�����ģ���¶����
 * 		1��������dubbo������2.6.2��\����zookeeper�Ŀͻ���(curator)
 * 		2�������÷����ṩ��
 * 
 * 2���÷���������ȥע�����Ķ��ķ����ṩ�ߵķ����ַ
 * @author 1
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	UserService userService;
	
	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("OrderServiceImpl.initOrder>>�û�Id:" + userId);
		// 1.��ѯ�û����ջ���ַ
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		
		for(UserAddress userAddress : addressList) {
			System.out.println(userAddress);
		}
		
		return addressList;
	}

}
