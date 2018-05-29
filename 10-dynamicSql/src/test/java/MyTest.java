import java.util.ArrayList;
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
	public void test01() {
		Student stu = new Student("花",11,0);
		Student stu1 = new Student("",11,0);
		Student stu2 = new Student("",0,0);
		List<Student> students = studentDao.selectStudentsByIf(stu);
		for(Student student:students)
		System.out.println(student);
	}
	
	@Test
	public void test02() {
		Student stu = new Student("花",11,0);
		Student stu1 = new Student("",11,0);
		Student stu2 = new Student("",0,0);
		List<Student> students = studentDao.selectStudentsByWhere(stu1);
		for(Student student:students)
			System.out.println(student);
	}
	@Test
	public void test03() {
		Student stu = new Student("花",11,0);
		Student stu1 = new Student("",11,0);
		Student stu2 = new Student("",0,0);
		List<Student> students = studentDao.selectStudentsByChoose(stu);
		for(Student student:students)
			System.out.println(student);
	}
	
	@Test
	public void test04() {
		int[] ids={19,23};
		List<Student> students = studentDao.selectStudentsByForeach(ids);
		for(Student student:students)
			System.out.println(student);
	}
	
	@Test
	public void test05() {
		Student stu1=new Student();
		stu1.setId(24);
		Student stu2=new Student();
		stu2.setId(25);
		List<Student> stus=new ArrayList<>();
		stus.add(stu1);
		stus.add(stu2);
		List<Student> students = studentDao.selectStudentsByForeach3(stus);
		for(Student student:students)
			System.out.println(student);
	}
	@Test
	public void test06() {
		Student stu1=new Student();
		stu1.setId(24);
		Student stu2=new Student();
		stu2.setId(25);
		List<Student> stus=new ArrayList<>();
		stus.add(stu1);
		stus.add(stu2);
		List<Student> students = studentDao.selectStudentsBySqlFragment(stus);
		for(Student student:students)
			System.out.println(student);
	}
	
	
}
