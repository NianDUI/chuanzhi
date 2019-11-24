package cn.mybatis.first;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.mybatis.po.User;

/**
 * 
 * @author 1
 *
 */
public class MybatisFirst {

	// 根据id查询用户的信息。得到一条记录结果
	@Test
	public void findUserByIdTest() throws IOException {

		// mybatis配置文件
		String resource = "SqlMapConfig.xml";

		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建了会话工厂。
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// 通过工厂得到SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 通过SqlSession操作数据库
		// 第一个参数:映射文件中statement的id,等于=namespace+"."+statement的id
		// 第二个参数:指定和映射文件中所匹配的parameterType类型的参数
		// sqlSession.selectOne结果是与映射文件中所匹配的resultType类型的对象。
		// selectOne查询出一条记录
		User user = sqlSession.selectOne("test.findUserById", 1);

		System.out.println(user);

		// 释放资源
		sqlSession.close();

	}

	// 根据用户名称模糊查询用户列表
	@Test
	public void findUserByNameTest() throws IOException {

		// mybatis配置文件
		String resource = "SqlMapConfig.xml";

		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建了会话工厂。
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// 通过工厂得到SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		List<User> list = sqlSession.selectList("test.findUserByName", "1");
		// list中的user和映射文件中resultType所指定的类型一致

		System.out.println(list);
		sqlSession.close();

	}

	// 添加用户信息
	@Test
	public void insertUser() throws IOException {

		// mybatis配置文件
		String resource = "SqlMapConfig.xml";

		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建了会话工厂。
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// 通过工厂得到SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 插入用户对象
		User user = new User();
		user.setUsername("wangxiaojun");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("henanzhuzhou");
		sqlSession.insert("test.insertUser", user);
		// list中的user和映射文件中resultType所指定的类型一致

		// 提交事务
		sqlSession.commit();

		// 获取用户信息主键
		System.out.println(user.getId());

		sqlSession.close();

	}

	// 根据id删除用户信息
	@Test
	public void deleteUser() throws IOException {

		// mybatis配置文件
		String resource = "SqlMapConfig.xml";

		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建了会话工厂。
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// 通过工厂得到SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 传入id删除用户
		sqlSession.delete("test.deleteUser", 7);

		// 提交事务
		sqlSession.commit();

		sqlSession.close();

	}
	
	// 更新用户信息
	@Test
	public void updateUser() throws IOException {

		// mybatis配置文件
		String resource = "SqlMapConfig.xml";

		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建了会话工厂。
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// 通过工厂得到SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 更新用户信息
		User user = new User();
		// 必须设置id
		user.setId(5);
		user.setUsername("wangdajun");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("henanzhengzhou");
		sqlSession.insert("test.updateUser", user);
		// list中的user和映射文件中resultType所指定的类型一致

		// 提交事务
		sqlSession.commit();

		// 获取用户信息主键
		System.out.println(user.getId());

		sqlSession.close();

	}

}
