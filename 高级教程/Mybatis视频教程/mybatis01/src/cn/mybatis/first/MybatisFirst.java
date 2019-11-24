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

	// ����id��ѯ�û�����Ϣ���õ�һ����¼���
	@Test
	public void findUserByIdTest() throws IOException {

		// mybatis�����ļ�
		String resource = "SqlMapConfig.xml";

		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// �����˻Ự������
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// ͨ��SqlSession�������ݿ�
		// ��һ������:ӳ���ļ���statement��id,����=namespace+"."+statement��id
		// �ڶ�������:ָ����ӳ���ļ�����ƥ���parameterType���͵Ĳ���
		// sqlSession.selectOne�������ӳ���ļ�����ƥ���resultType���͵Ķ���
		// selectOne��ѯ��һ����¼
		User user = sqlSession.selectOne("test.findUserById", 1);

		System.out.println(user);

		// �ͷ���Դ
		sqlSession.close();

	}

	// �����û�����ģ����ѯ�û��б�
	@Test
	public void findUserByNameTest() throws IOException {

		// mybatis�����ļ�
		String resource = "SqlMapConfig.xml";

		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// �����˻Ự������
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		List<User> list = sqlSession.selectList("test.findUserByName", "1");
		// list�е�user��ӳ���ļ���resultType��ָ��������һ��

		System.out.println(list);
		sqlSession.close();

	}

	// ����û���Ϣ
	@Test
	public void insertUser() throws IOException {

		// mybatis�����ļ�
		String resource = "SqlMapConfig.xml";

		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// �����˻Ự������
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// �����û�����
		User user = new User();
		user.setUsername("wangxiaojun");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("henanzhuzhou");
		sqlSession.insert("test.insertUser", user);
		// list�е�user��ӳ���ļ���resultType��ָ��������һ��

		// �ύ����
		sqlSession.commit();

		// ��ȡ�û���Ϣ����
		System.out.println(user.getId());

		sqlSession.close();

	}

	// ����idɾ���û���Ϣ
	@Test
	public void deleteUser() throws IOException {

		// mybatis�����ļ�
		String resource = "SqlMapConfig.xml";

		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// �����˻Ự������
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// ����idɾ���û�
		sqlSession.delete("test.deleteUser", 7);

		// �ύ����
		sqlSession.commit();

		sqlSession.close();

	}
	
	// �����û���Ϣ
	@Test
	public void updateUser() throws IOException {

		// mybatis�����ļ�
		String resource = "SqlMapConfig.xml";

		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// �����˻Ự������
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// �����û���Ϣ
		User user = new User();
		// ��������id
		user.setId(5);
		user.setUsername("wangdajun");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("henanzhengzhou");
		sqlSession.insert("test.updateUser", user);
		// list�е�user��ӳ���ļ���resultType��ָ��������һ��

		// �ύ����
		sqlSession.commit();

		// ��ȡ�û���Ϣ����
		System.out.println(user.getId());

		sqlSession.close();

	}

}
