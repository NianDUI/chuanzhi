package cn.mybatis.mapper;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.mybatis.po.Orders;
import cn.mybatis.po.OrdersCustom;
import cn.mybatis.po.User;

public class OrdersMapperCustomTest {
	private SqlSessionFactory sqlSessionFactory;

	// �˷�����ִ��testFindUserById()֮ǰִ�С�
	@Before
	public void setUp() throws Exception {
		// ����sqlSessionFactory

		// mybatis�����ļ�
		String resource = "SqlMapConfig.xml";

		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// �����˻Ự������
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindOrdersUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// �����������
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		// ����mapper�ķ���
		List<OrdersCustom> list = ordersMapperCustom.findOrdersUser();
		
		System.out.println(list);
		
		sqlSession.close();
	}
	
	
	@Test
	public void testFindOrdersUserResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// �����������
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		// ����mapper�ķ���
		List<Orders> list = ordersMapperCustom.findOrdersUserResultMap();
		
		System.out.println(list);
		
		sqlSession.close();
	}
	
	@Test
	public void testFindOrdersUserAndOrderDetailResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// �����������
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		// ����mapper�ķ���
		List<Orders> list = ordersMapperCustom.findOrdersUserAndOrderDetailResultMap();
		
		System.out.println(list);
		
		sqlSession.close();
	}
	
	
	@Test
	public void testFindUserAndItemsResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		List<User> list = ordersMapperCustom.findUserAndItemsResultMap();
		
		sqlSession.close();
		
		System.out.println(list);
		
	}
	
	
	// ��ѯ���������û���ѯ���û���Ϣʹ���ӳټ��ء�
	@Test
	public void testFindOrdersUserLazyLoading() throws Exception {
		//�����������
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// ��ѯ������Ϣ��(����)
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		List<Orders> list = ordersMapperCustom.findOrdersUserLazyLoading();
		
		sqlSession.close();
		
		// ����������Ķ����б�
		for(Orders o : list) {
			// ִ��getUser()ȥ��ѯ�û���Ϣ������ʵ�ְ������
			System.out.println(o.getUser());
			Thread.sleep(1000);
		}
		
 		System.out.println(list);
		
	}
	
	
	// һ���������
	@Test
	public void testCatch1() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		// �±߲�ѯʹ��һ��SqlSession
		// ��һ�η����󡣲�ѯidΪ4���û�
		User user1 = userMapper.findUserById(4);
		System.out.println(user1);
		
		// ���sqlSessionȥִ��commit����(ִ�в���,����,ɾ��)��
		// ���sqLSession�е�һ�����棬��������Ŀ��Ϊ���û����д洢�������µ���Ϣ�����������
		
		// ����user1����Ϣ
		user1.setUsername("wangxiaojun22");
		userMapper.updateUser(user1);
		// ִ��commit����ȥ��ջ���
		sqlSession.commit();
		
		// �ڶ��η����󡣲�ѯidΪ4���û�
		User user2 = userMapper.findUserById(4);
		System.out.println(user2);
		
		sqlSession.close();
	}
	
	
	// �����������
	@Test
	public void testCatch2() throws Exception {
		SqlSession sqlSession1 = sqlSessionFactory.openSession();
		SqlSession sqlSession2 = sqlSessionFactory.openSession();
		SqlSession sqlSession3 = sqlSessionFactory.openSession();
		
		UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
		// �±߲�ѯʹ��һ��SqlSession
		// ��һ�η����󡣲�ѯidΪ4���û�
		User user1 = userMapper1.findUserById(4);
		System.out.println(user1);
		
		// ����ִ�йرղ�������sqlSession�е�����д��������������
		sqlSession1.close();
		
		
//		// ʹ��SqlSession3ִ֮��commit()����
//		UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
//		User user = userMapper3.findUserById(4);
//		user.setUsername("wangxiaojun");
//		userMapper3.updateUser(user);
//		// ִ��commit����, ���UserMappe�µĶ�������
//		sqlSession3.commit();
//		sqlSession3.close();
		
		/*�������棬 select��useCache="false"ʱ��
		��sql���ö������棬Ĭ��Ϊtrue*/
		
		UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
		// �ڶ��η����󡣲�ѯidΪ4���û�
		User user2 = userMapper2.findUserById(4);
		System.out.println(user2);

		sqlSession2.close();
		
		
		
	}
	
}

