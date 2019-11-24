package demo.test;

import java.util.Scanner;

import demo.dao.UserDao;
import demo.game.GuessNumber;
import demo.pojo.User;
import dmeo.dao.Impl.UserDaoImpl;

/**
 * 用户测试类。
 * 
 * @author 1
 * @version V1.0
 * 
 *          新增加了两个小问题。 a:多个对象共享同一个成员变量，用静态。
 *          b:循环里面如果有switch，并在switch里面有break，那么结束的不是循环而是switch语句
 * 
 */
public class UserTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 为了能够回来、
		while (true) {
			// 欢迎界面，给出选择项
			System.out.println("--------------欢迎光临--------------");
			System.out.println("1登录");
			System.out.println("2注册");
			System.out.println("3退出");
			System.out.println("请输入你的选择：");
			// 键盘录入选择，根据选择做不同的操作。
			Scanner sc = new Scanner(System.in);
			// 为了后面录入信息的方便，我所有的数据录入都全部用字符串接收。
			String choiceString = sc.nextLine();

			// switch语句的多个地方要使用，我就定义到外面。
			UserDao ud = new UserDaoImpl();

			// 经过简单的思考，我选择了switch。必须是JDK1.7以后
			switch (choiceString) {
			case "1":
				// 登录界面，请输入用户名和密码。
				System.out.println("--------------登录界面--------------");
				System.out.println("请输入用户名");
				String username = sc.nextLine();
				System.out.println("请输入密码");
				String password = sc.nextLine();

				// 调用登录功能
//			UserDao ud = new UserDaoImpl();

				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("登录成功，可以开始玩游戏了");

					System.out.println("你玩吗？y/n");
					while (true) {
						String resultString = sc.nextLine();
						if ("y".equalsIgnoreCase(resultString)) {
							// 玩游戏
							GuessNumber.start();
							System.out.println("你还玩吗？y/n");
						} else {
							break;
						}
					}
					System.out.println("谢谢使用，欢迎下次再来。");
//					break; // 这里写break，结束的是switch
					System.exit(0);
				} else {
					System.out.println("用户名或密码错误，登录失败。");
				}
				break;
			case "2":
				// 注册界面，请输入用户名和密码。
				System.out.println("--------------注册界面--------------");
				System.out.println("请输入用户名");
				String newUsername = sc.nextLine();
				System.out.println("请输入密码");
				String newPassword = sc.nextLine();

				// 把用户名和密码封装到一个对象中。
				User user = new User();
				user.setName(newUsername);
				user.setPassword(newPassword);

				// 调用注册功能
				// 多态使用
//			UserDao ud = new UserDaoImpl();
				// 具体类使用。
//			UserDaoImpl udl = new UserDaoImpl();
				ud.regist(user);
				System.out.println("注册成功");
				break;
			case "3":
//			break;
			default:
				System.out.println("谢谢使用，欢迎下次再来。");
				System.exit(0);
				break;
			}

		}

	}
}
