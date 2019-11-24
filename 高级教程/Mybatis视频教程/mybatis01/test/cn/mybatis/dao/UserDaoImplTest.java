package cn.mybatis.dao;

import static org.junit.Assert.fail;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.mybatis.po.User;

public class UserDaoImplTest {
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
	public void testFindUserById() throws Exception {
		// ����UserDao�Ķ���
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);

		// ����UserDao�ķ���
		User user = userDao.findUserById(1);

		System.out.println(user);
	}

	@Test
	public void testInsertUser() {
		
	}

	@Test
	public void testDeleteUser() {

	}

}
