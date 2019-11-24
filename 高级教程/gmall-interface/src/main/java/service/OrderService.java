package service;

import java.util.List;

import bean.UserAddress;

public interface OrderService {
	
	/**
	 * ≥ı ºªØ∂©µ•
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
