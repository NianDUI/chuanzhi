package service;

import java.util.List;


import bean.UserAddress;

/**
 * ���ش�� �����ŷű��� dubbo�ڵ���Զ�̹���ʱ�����б��ش�����ȵ��ñ��ش�������б��ش���ж��Ƿ����Զ�� 
 * 
 * ��ʽ���£�
 * 
 * ������xml�е�����
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
