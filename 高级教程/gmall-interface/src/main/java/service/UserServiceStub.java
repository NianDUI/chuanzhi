package service;

import java.util.List;


import bean.UserAddress;

/**
 * 本地存根 消费着放保存 dubbo在调用远程过程时，如有本地存根，先调用本地存根，再有本地存根判断是否调用远程 
 * 
 * 格式如下：
 * 
 * 还有在xml中的配置
 * 
 * @author 1
 *
 */
public class UserServiceStub implements UserService {

	@SuppressWarnings("unused")
	private final UserService userService;

	public UserServiceStub(UserService userService) {
		this.userService = userService;
	}

	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceStub.getUserAddressList");
		
		if (!userId.isEmpty()) {
			return userService.getUserAddressList(userId);
		}
		return null;
	}

}
