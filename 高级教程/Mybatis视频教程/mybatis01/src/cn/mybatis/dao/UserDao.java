package cn.mybatis.dao;

import java.util.List;

import cn.mybatis.po.User;

/**
 * @author 1 dao�ӿڣ��û�����
 */
public interface UserDao {
	// ����id��ѯ�û���Ϣ��
	public User findUserById(int id) throws Exception;

	// ����id��ѯ�û���Ϣ��
	public List<User> findUserByIdName(String name) throws Exception;
	
	// ����û���Ϣ��
	public void insertUser(User user) throws Exception;
	
	// ɾ���û���Ϣ��
	public void deleteUser(int id) throws Exception;
	
	
	
}
