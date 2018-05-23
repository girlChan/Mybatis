package cn.liuchan.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	private static SqlSessionFactory sessionFactory;

	public static SqlSession getSqlSession() {
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis.xml");
			if (sessionFactory == null) {
				sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}
			return sessionFactory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
