import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import cn.liuchan.Dao.IStudentDao;
import cn.liuchan.Dao.IStudentDaoImpl;
import cn.liuchan.Do.Student;

public class MyTest {
	private IStudentDao studentDao;

	@Before
	public void before() {
		studentDao = new IStudentDaoImpl();
	}

	@After
	public void after() {

	}

	@Test
	public void test01() {
		Student student = new Student("梨花", 12, 99.3);
		System.out.println("插入数据前" + student);
		studentDao.insertStudent(student);
		System.out.println("插入数据后" + student);
	}


	/* 查询所有 */
	@Test
	public void test05() {
		List<Student> students = studentDao.selectAllStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}


	@Test
	public void test07() {
		Student student = studentDao.selectStudentById(53);
		System.out.println(student);
	}
}
