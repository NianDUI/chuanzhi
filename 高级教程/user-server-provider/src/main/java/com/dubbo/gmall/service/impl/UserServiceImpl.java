package com.dubbo.gmall.service.impl;

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
		
		UserAddress address1 = new UserAddress(1, "����", "1", "��ʦ", "1234567891", "Y");
		UserAddress address2 = new UserAddress(1, "�ӱ�", "2", "ѧ��", "1234567892", "N");
		
		return Arrays.asList(address1, address2);
	}

}
