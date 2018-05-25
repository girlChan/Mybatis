package test;

import org.junit.Test;

import kedacom.Student;
import kedacom.dao.IStudentDao;
import kedacom.dao.impl.StudentDaoImpl;

public class MyTest {

	@Test
	public void test01() {
     IStudentDao dao=new StudentDaoImpl();
     Student student=new Student(11,"lc",00);
     dao.insertStu(student);
	}
}
