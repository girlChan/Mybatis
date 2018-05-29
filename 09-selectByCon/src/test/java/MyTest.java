import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import cn.liuchan.Dao.IStudentDao;
import cn.liuchan.Do.Student;
import cn.liuchan.utils.MybatisUtils;

public class MyTest {
	private IStudentDao studentDao;
	private SqlSession sqlSession;

	@Before
	public void before() {
		sqlSession = MybatisUtils.getSqlSession();
		studentDao = sqlSession.getMapper(IStudentDao.class);
	}

	@After
	public void after() {
      if(sqlSession!=null){
    	  sqlSession.close();
      }
	}

	@Test
	public void test08() {
		List<Student> students = studentDao.selectStudentsByCondition("花",11);
		for(Student student:students)
		System.out.println(student);
	}
	
	
}
