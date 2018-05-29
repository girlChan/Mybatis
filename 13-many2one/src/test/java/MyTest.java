import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.liuchan.Dao.IMinisterDao;
import cn.liuchan.Do.Country;
import cn.liuchan.Do.Minister;
import cn.liuchan.utils.MybatisUtils;

public class MyTest {
	private IMinisterDao ministerDao;
	private SqlSession sqlSession;

	@Before
	public void before() {
		sqlSession = MybatisUtils.getSqlSession();
		ministerDao = sqlSession.getMapper(IMinisterDao.class);
	}

	@After
	public void after() {
      if(sqlSession!=null){
    	  sqlSession.close();
      }
	}

	@Test
	public void test01() {
		Minister minister=ministerDao.selectMinisterById(2);
		System.out.println(minister);
	}
	
}
