package cn.mybatis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest {

	public static void main(String[] args) {

		// ���ݿ����ӡ�
		Connection connection = null;

		// Ԥ�����Statement
		PreparedStatement preparedStatement = null;

		// �����
		ResultSet resultSet = null;

		try {
			// �������ݿ�������
			Class.forName("com.mysql.jdbc.Driver");

			// ͨ�������������ȡ���ݿ����ӡ�
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mybatis?characterEncoding=utf-8",
					"root", "root");

			// ����sql��䣬?��ʾռλ����
			String sql = "select * from user where username = ?";

			// ��ȡԤ�����Statement
			preparedStatement = connection.prepareStatement(sql);

			// ���ò�������һ������Ϊsql����в��������(��һ��ʼ),�ڶ�������Ϊ�����ֵ��
			preparedStatement.setString(1, "1");

			// �����ݿⷢ��sqlִ�в�ѯ����ѯ�������
			resultSet = preparedStatement.executeQuery();

			// ���������
			while (resultSet.next()) {
				System.out.println(resultSet.getString("id") + " " + resultSet.getString("username"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ͷ���Դ��
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
