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

	// 此方法在执行testFindUserById()之前执行。
	@Before
	public void setUp() throws Exception {
		// 创建sqlSessionFactory

		// mybatis配置文件
		String resource = "SqlMapConfig.xml";

		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建了会话工厂。
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindOrdersUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// 创建代理对象
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		// 调用mapper的方法
		List<OrdersCustom> list = ordersMapperCustom.findOrdersUser();
		
		System.out.println(list);
		
		sqlSession.close();
	}
	
	
	@Test
	public void testFindOrdersUserResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// 创建代理对象
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		// 调用mapper的方法
		List<Orders> list = ordersMapperCustom.findOrdersUserResultMap();
		
		System.out.println(list);
		
		sqlSession.close();
	}
	
	@Test
	public void testFindOrdersUserAndOrderDetailResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// 创建代理对象
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		// 调用mapper的方法
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
	
	
	// 查询订单关联用户查询。用户信息使用延迟加载。
	@Test
	public void testFindOrdersUserLazyLoading() throws Exception {
		//创建代理对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// 查询订单信息。(单表)
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		List<Orders> list = ordersMapperCustom.findOrdersUserLazyLoading();
		
		sqlSession.close();
		
		// 遍历上面儿的订单列表
		for(Orders o : list) {
			// 执行getUser()去查询用户信息，这里实现按需加载
			System.out.println(o.getUser());
			Thread.sleep(1000);
		}
		
 		System.out.println(list);
		
	}
	
	
	// 一级缓存测试
	@Test
	public void testCatch1() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		// 下边查询使用一个SqlSession
		// 第一次发请求。查询id为4的用户
		User user1 = userMapper.findUserById(4);
		System.out.println(user1);
		
		// 如果sqlSession去执行commit操作(执行插入,更新,删除)。
		// 清空sqLSession中的一级缓存，这样做的目的为了让缓存中存储的是最新的信息，避免脏读。
		
		// 更新user1的信息
		user1.setUsername("wangxiaojun22");
		userMapper.updateUser(user1);
		// 执行commit操作去清空缓存
		sqlSession.commit();
		
		// 第二次发请求。查询id为4的用户
		User user2 = userMapper.findUserById(4);
		System.out.println(user2);
		
		sqlSession.close();
	}
	
	
	// 二级缓存测试
	@Test
	public void testCatch2() throws Exception {
		SqlSession sqlSession1 = sqlSessionFactory.openSession();
		SqlSession sqlSession2 = sqlSessionFactory.openSession();
		SqlSession sqlSession3 = sqlSessionFactory.openSession();
		
		UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
		// 下边查询使用一个SqlSession
		// 第一次发请求。查询id为4的用户
		User user1 = userMapper1.findUserById(4);
		System.out.println(user1);
		
		// 这里执行关闭操作。其sqlSession中的数据写到二级缓存区域。
		sqlSession1.close();
		
		
//		// 使用SqlSession3之执行commit()操作
//		UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
//		User user = userMapper3.findUserById(4);
//		user.setUsername("wangxiaojun");
//		userMapper3.updateUser(user);
//		// 执行commit操作, 清空UserMappe下的二级缓存
//		sqlSession3.commit();
//		sqlSession3.close();
		
		/*二级缓存， select中useCache="false"时，
		该sql禁用二级缓存，默认为true*/
		
		UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
		// 第二次发请求。查询id为4的用户
		User user2 = userMapper2.findUserById(4);
		System.out.println(user2);

		sqlSession2.close();
		
		
		
	}
	
}

