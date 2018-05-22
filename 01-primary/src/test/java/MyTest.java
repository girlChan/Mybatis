import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import cn.liuchan.Dao.IStudentDao;
import cn.liuchan.Dao.IStudentDaoImpl;

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
	
}
}
