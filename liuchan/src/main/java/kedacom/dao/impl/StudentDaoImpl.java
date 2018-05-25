package kedacom.dao.impl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kedacom.Student;
import kedacom.dao.IStudentDao;

public class StudentDaoImpl implements IStudentDao{

	private SqlSession session;

	@Override
	public void insertStu(Student student) {
		try {
			InputStream inputStream=Resources.getResourceAsStream("mybatis.xml");
			SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			session = sessionFactory.openSession();
			session.insert("insertStu",student);
			session.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null){session.close();}
		}
		
		
	}

}
