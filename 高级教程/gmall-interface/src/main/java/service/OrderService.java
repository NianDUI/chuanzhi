package service;

import java.util.List;

import bean.UserAddress;

public interface OrderService {
	
	/**
	 * ��ʼ������
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
