package cn.liuchan.Dao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import cn.liuchan.Do.Student;
import cn.liuchan.utils.MybatisUtils;

public class IStudentDaoImpl implements IStudentDao{

	private SqlSession sqlSession;

	@Override
	public void insertStudent(Student student) {
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
		try {
		    sqlSession=MybatisUtils.getSqlSession();
			sqlSession.insert("insertStudentCacheId", student);
			sqlSession.commit();
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}

	@Override
	public void deleteStudentById(int id) {
		try {
		    sqlSession=MybatisUtils.getSqlSession();
			sqlSession.delete("deleteStudentById", id);
			sqlSession.commit();
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		
	}

	@Override
	public void updateStudentById(Student student) {
		try {
		    sqlSession=MybatisUtils.getSqlSession();
			sqlSession.update("updateStudentById", student);
			sqlSession.commit();
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		
	}

	@Override
	public List<Student> selectAllStudents() {
		List<Student> students=null;
		try {
		    sqlSession=MybatisUtils.getSqlSession();
		    students = sqlSession.selectList("selectAllStudents");
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return students;
	}

	@Override
	public Map<String, Object> selectAllStudentsMap() {
		Map<String, Object> map=new HashMap<>();
		try {
		    sqlSession=MybatisUtils.getSqlSession();
		    map = sqlSession.selectMap("selectAllStudents", "name");
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return map;
	}

	@Override
	public Student selectStudentById(int id) {
		Student student = new Student();
		try {
		    sqlSession=MybatisUtils.getSqlSession();
		    student = sqlSession.selectOne("selectStudentById",id);
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return student;
	}

	@Override
	public List<Student> selectStudentsByName(String name) {
		List<Student> students=null;
		try {
		    sqlSession=MybatisUtils.getSqlSession();
		    students = sqlSession.selectList("selectStudentsByName",name);
		}finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return students;
	}

}
