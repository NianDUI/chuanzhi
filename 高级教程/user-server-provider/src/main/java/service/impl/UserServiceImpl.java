package service.impl;

import java.util.Arrays;
import java.util.List;

import bean.UserAddress;
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
public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		
		System.out.println("UserServiceImpl.getUserAddressList....:"
				+ "old");
		
		UserAddress address1 = new UserAddress(1, "����", "1", "��ʦ", "1234567891", "Y");
		UserAddress address2 = new UserAddress(1, "�ӱ�", "2", "ѧ��", "1234567892", "N");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Arrays.asList(address1, address2);
	}

}
