package dmeo.dao.Impl;

import java.util.ArrayList;

import demo.dao.UserDao;
import demo.pojo.User;

/**
 * �����û������ľ���ʵ���ࡣ�����ϰ棩
 * 
 * @author 1
 * @version V1.0
 *
 */
public class UserDaoImpl implements UserDao {
	// Ϊ�˷Ŷ������ʹ��ͬһ�����ϣ��ͰѼ��϶���Ϊ��Ա����
	// ���Ӳ������˿�������private��
	// Ϊ���ö��������ͬһ����Ա��������static
	private static ArrayList<User> array = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		// �������ϣ���ȡÿһ���û������жϸ��û����û����������Ƿ�ʹ��ݹ����ġ�
		boolean flag = false;

		for (User u : array) {
			if (u.getName().equals(username) && u.getPassword().equals(password)) {
				flag = true;
			}
		}

		return flag;
	}

	@Override
	public void regist(User user) {
		// ���û���Ϣ���뼯�ϡ�
//		ArrayList<User> array = new ArrayList<User>();
		array.add(user);

	}

}
