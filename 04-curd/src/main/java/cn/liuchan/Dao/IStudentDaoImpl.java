package cn.liuchan.Dao;


import java.io.InputStream;
import java.util.List;
import java.util.Map;

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

	@Override
	public void insertStudentCacheId(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudentById(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> selectAllStudentsMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student selectStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectStudentsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
