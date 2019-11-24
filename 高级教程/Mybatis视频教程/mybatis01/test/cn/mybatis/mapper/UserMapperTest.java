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
	public void testFindUserById() throws Exception{
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 
		// ����UserMapper����mybatis�Զ�����mapper�������
		UserMapper usreMapper = sqlSession.getMapper(UserMapper.class);
		
		// ����usreMapper�ķ���
		User user = usreMapper.findUserById(4);
		
		sqlSession.close();
		
		System.out.println(user);
		
	}
	

	// �û���Ϣ�ۺϡ�
	@Test
	public void testFindUserList() throws Exception{
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 
		// ����UserMapper����mybatis�Զ�����mapper�������
		UserMapper usreMapper = sqlSession.getMapper(UserMapper.class);
		
		// ������װ�������ò�ѯ������
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		
		// ��������ʹ�õĶ�̬sql�����������ĳ��ֵ����������ƴ����sql��
//		userCustom.setSex("1");
		userCustom.setUsername("wang");
		userQueryVo.setUserCustom(userCustom);
		
		// ������id
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(4);
		ids.add(5);
		userQueryVo.setIds(ids);
		
		// ����usreMapper�ķ���
		List<UserCustom> list = usreMapper.findUserList(userQueryVo);
		
		sqlSession.close();
		
		System.out.println(list);
		
	}
	
	// �û���Ϣ�ۺϲ�ѯ����
	@Test
	public void testFindUserCount() throws Exception{
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 
		// ����UserMapper����mybatis�Զ�����mapper�������
		UserMapper usreMapper = sqlSession.getMapper(UserMapper.class);
		
		// ������װ�������ò�ѯ������
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setSex("1");
		userCustom.setUsername("wang");
//		userQueryVo.setUserCustom(userCustom);
		
		// ������id
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(4);
		ids.add(5);
		userQueryVo.setIds(ids);
		
		// ����usreMapper�ķ���
		int count  = usreMapper.findUserCount(userQueryVo);
		
		sqlSession.close();
		
		System.out.println(count);
		
	}
	
	// ����id��ѯ�û���Ϣ��ʹ��resultMap���
	@Test
	public void testFindUserByIdResulMap() throws Exception{
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		 
		// ����UserMapper����mybatis�Զ�����mapper�������
		UserMapper usreMapper = sqlSession.getMapper(UserMapper.class);
		
		// ����usreMapper�ķ���
		User user = usreMapper.findUserByIdResultMap(4);
		
		sqlSession.close();
		
		System.out.println(user);
		
	}

}
