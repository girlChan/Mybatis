package cn.liuchan.Dao;


import java.io.InputStream;
import org.apache.ibatis.session.SqlSession;
import cn.liuchan.Do.Student;
import cn.liuchan.utils.MybatisUtils;

public class IStudentDaoImpl implements IStudentDao{

	private SqlSession sqlSession;

	@Override
	public void insertStudent(Student student) {
		InputStream inputStream;
		try {
		    sqlSession=MybatisUtils.getSqlSession();
			sqlSession.insert("insertStudent", student);
			sqlSession.commit();
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		
	}

}
