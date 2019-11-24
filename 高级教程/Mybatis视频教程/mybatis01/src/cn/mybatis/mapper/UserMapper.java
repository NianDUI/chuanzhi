package cn.mybatis.mapper;

import java.util.List;

import cn.mybatis.po.User;
import cn.mybatis.po.UserCustom;
import cn.mybatis.po.UserQueryVo;

/**
 * @author 1 mapper�ӿڣ��൱��dao�ӿڣ��û�����
 */
public interface UserMapper {
	
	// �û���Ϣ�ۺϲ�ѯ
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;

	// �û���Ϣ�ۺϲ�ѯ����
	public int findUserCount(UserQueryVo userQueryVo) throws Exception;
	
	// ����id��ѯ�û���Ϣ��
	public User findUserById(int id) throws Exception;

	// ����id��ѯ�û���Ϣ��ʹ��resultMap���
	public User findUserByIdResultMap(int id) throws Exception;

	
	// ����id��ѯ�û���Ϣ��
	public List<User> findUserByIdName(String name) throws Exception;

	// ����û���Ϣ��
	public void insertUser(User user) throws Exception;

	// ɾ���û���Ϣ��
	public void deleteUser(int id) throws Exception;

	// �����û���Ϣ��
	public void updateUser(User user) throws Exception;

}
