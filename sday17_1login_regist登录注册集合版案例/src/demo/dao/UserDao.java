package demo.dao;

import demo.pojo.User;

/**
 * ��������û����в����Ľӿڡ�
 * 
 * @author 1
 * @version V1.0
 *
 */
public interface UserDao {
	/**
	 * �����û���¼����
	 * 
	 * @param userName �û���
	 * @param password ����
	 * @return ���ص�¼�Ƿ�ɹ���
	 */
	public abstract boolean isLogin(String username, String password);

	/**
	 * �����û�ע�Ṧ�ܡ�
	 * 
	 * @param user Ҫע����û���Ϣ
	 */
	public abstract void regist(User user);

}
