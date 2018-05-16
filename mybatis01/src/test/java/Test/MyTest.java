package Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dao.ISomeDao;
import Dao.IStudentDao;
import Do.Country;
import Do.Student;
import Utils.MybatisUtils;

public class MyTest {
	private IStudentDao studentDao;
	private ISomeDao someDao;
	private SqlSession session;

	@Before
	public void setup() {
		session = MybatisUtils.getSqlSession();
		studentDao = session.getMapper(IStudentDao.class);
	}

	@After
	public void tearDown() {
		if (session != null) {
			session.close();
		}
	}
	
	@org.junit.Test
	public void test01(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "张三");
		map.put("age", 18);
		List<Student> students=studentDao.selectStudentMap(map);
		for(Student student :students){
			System.out.println(student);
		}
	}
	@org.junit.Test
	public void test02(){
		List<Student> students=studentDao.selectStudentByConditions(19, "李四");
		for(Student student :students){
			System.out.println(student);
		}
	}
	@Test
	public void test03(){
		Country country=someDao.selectCountryById(1);
		System.out.println(country);
	}
}
