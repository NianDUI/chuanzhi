package demo.test;

import java.util.Scanner;

import demo.dao.UserDao;
import demo.game.GuessNumber;
import demo.pojo.User;
import dmeo.dao.Impl.UserDaoImpl;

/**
 * �û������ࡣ
 * 
 * @author 1
 * @version V1.0
 * 
 *          ������������С���⡣ a:���������ͬһ����Ա�������þ�̬��
 *          b:ѭ�����������switch������switch������break����ô�����Ĳ���ѭ������switch���
 * 
 */
public class UserTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Ϊ���ܹ�������
		while (true) {
			// ��ӭ���棬����ѡ����
			System.out.println("--------------��ӭ����--------------");
			System.out.println("1��¼");
			System.out.println("2ע��");
			System.out.println("3�˳�");
			System.out.println("���������ѡ��");
			// ����¼��ѡ�񣬸���ѡ������ͬ�Ĳ�����
			Scanner sc = new Scanner(System.in);
			// Ϊ�˺���¼����Ϣ�ķ��㣬�����е�����¼�붼ȫ�����ַ������ա�
			String choiceString = sc.nextLine();

			// switch���Ķ���ط�Ҫʹ�ã��ҾͶ��嵽���档
			UserDao ud = new UserDaoImpl();

			// �����򵥵�˼������ѡ����switch��������JDK1.7�Ժ�
			switch (choiceString) {
			case "1":
				// ��¼���棬�������û��������롣
				System.out.println("--------------��¼����--------------");
				System.out.println("�������û���");
				String username = sc.nextLine();
				System.out.println("����������");
				String password = sc.nextLine();

				// ���õ�¼����
//			UserDao ud = new UserDaoImpl();

				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("��¼�ɹ������Կ�ʼ����Ϸ��");

					System.out.println("������y/n");
					while (true) {
						String resultString = sc.nextLine();
						if ("y".equalsIgnoreCase(resultString)) {
							// ����Ϸ
							GuessNumber.start();
							System.out.println("�㻹����y/n");
						} else {
							break;
						}
					}
					System.out.println("ллʹ�ã���ӭ�´�������");
//					break; // ����дbreak����������switch
					System.exit(0);
				} else {
					System.out.println("�û�����������󣬵�¼ʧ�ܡ�");
				}
				break;
			case "2":
				// ע����棬�������û��������롣
				System.out.println("--------------ע�����--------------");
				System.out.println("�������û���");
				String newUsername = sc.nextLine();
				System.out.println("����������");
				String newPassword = sc.nextLine();

				// ���û����������װ��һ�������С�
				User user = new User();
				user.setName(newUsername);
				user.setPassword(newPassword);

				// ����ע�Ṧ��
				// ��̬ʹ��
//			UserDao ud = new UserDaoImpl();
				// ������ʹ�á�
//			UserDaoImpl udl = new UserDaoImpl();
				ud.regist(user);
				System.out.println("ע��ɹ�");
				break;
			case "3":
//			break;
			default:
				System.out.println("ллʹ�ã���ӭ�´�������");
				System.exit(0);
				break;
			}

		}

	}
}
