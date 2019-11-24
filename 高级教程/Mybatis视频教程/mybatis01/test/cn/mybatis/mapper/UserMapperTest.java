package cn.mybatis.mapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.mybatis.po.User;
import cn.mybatis.po.UserCustom;
import cn.mybatis.po.UserQueryVo;

public class UserMapperTest {
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
	public void testFindUserById() throws Exception{
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 
		// 创建UserMapper对象。mybatis自动生成mapper代理对象
		UserMapper usreMapper = sqlSession.getMapper(UserMapper.class);
		
		// 调用usreMapper的方法
		User user = usreMapper.findUserById(4);
		
		sqlSession.close();
		
		System.out.println(user);
		
	}
	

	// 用户信息综合。
	@Test
	public void testFindUserList() throws Exception{
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 
		// 创建UserMapper对象。mybatis自动生成mapper代理对象
		UserMapper usreMapper = sqlSession.getMapper(UserMapper.class);
		
		// 创建包装对象，设置查询条件。
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		
		// 由于这里使用的动态sql。如果不设置某个值。条件不会拼接在sql中
//		userCustom.setSex("1");
		userCustom.setUsername("wang");
		userQueryVo.setUserCustom(userCustom);
		
		// 传入多个id
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(4);
		ids.add(5);
		userQueryVo.setIds(ids);
		
		// 调用usreMapper的方法
		List<UserCustom> list = usreMapper.findUserList(userQueryVo);
		
		sqlSession.close();
		
		System.out.println(list);
		
	}
	
	// 用户信息综合查询总数
	@Test
	public void testFindUserCount() throws Exception{
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 
		// 创建UserMapper对象。mybatis自动生成mapper代理对象
		UserMapper usreMapper = sqlSession.getMapper(UserMapper.class);
		
		// 创建包装对象，设置查询条件。
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setSex("1");
		userCustom.setUsername("wang");
//		userQueryVo.setUserCustom(userCustom);
		
		// 传入多个id
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(4);
		ids.add(5);
		userQueryVo.setIds(ids);
		
		// 调用usreMapper的方法
		int count  = usreMapper.findUserCount(userQueryVo);
		
		sqlSession.close();
		
		System.out.println(count);
		
	}
	
	// 根据id查询用户信息。使用resultMap输出
	@Test
	public void testFindUserByIdResulMap() throws Exception{
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 
		// 创建UserMapper对象。mybatis自动生成mapper代理对象
		UserMapper usreMapper = sqlSession.getMapper(UserMapper.class);
		
		// 调用usreMapper的方法
		User user = usreMapper.findUserByIdResultMap(4);
		
		sqlSession.close();
		
		System.out.println(user);
		
	}

}
