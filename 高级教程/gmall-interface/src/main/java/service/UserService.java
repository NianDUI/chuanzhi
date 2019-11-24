package service;

import java.util.List;

import bean.UserAddress;

/**
 * 用户服务
 * @author 1
 *
 */
public interface UserService {
	
	/**
	 * 按照用户id，返回用户收货地址
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);
	
}
