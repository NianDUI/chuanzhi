package dmeo.dao.Impl;

import java.util.ArrayList;

import demo.dao.UserDao;
import demo.pojo.User;

/**
 * 这是用户操作的具体实现类。（集合版）
 * 
 * @author 1
 * @version V1.0
 *
 */
public class UserDaoImpl implements UserDao {
	// 为了放多个方法使用同一个集合，就把集合定义为成员变量
	// 妹子不让外人看到，用private。
	// 为了让多个对象共享同一个成员变量。用static
	private static ArrayList<User> array = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		// 遍历集合，获取每一个用户，并判断该用户的用户名和密码是否和传递过来的。
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
		// 将用户信息存入集合。
//		ArrayList<User> array = new ArrayList<User>();
		array.add(user);

	}

}
