package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Dao.IStudentDao;
import Do.Student;
import Utils.MybatisUtils;

public class MyTest {
	private IStudentDao Dao;
	private SqlSession session;

	@Before
	public void setup() {
		session = MybatisUtils.getSqlSession();
		Dao = session.getMapper(IStudentDao.class);
	}

	@After
	public void tearDown() {
		if (session != null) {
			session.close();
		}
	}
	
	@Test
	public void test01(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "张三");
		map.put("age", 18);
		List<Student> students=Dao.selectStudentMap(map);
		for(Student student :students){
			System.out.println(student);
		}
	}
}
