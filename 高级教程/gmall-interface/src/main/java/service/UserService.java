package service;

import java.util.List;

import bean.UserAddress;

/**
 * �û�����
 * @author 1
 *
 */
public interface UserService {
	
	/**
	 * �����û�id�������û��ջ���ַ
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);
	
}
