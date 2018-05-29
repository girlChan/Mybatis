import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.liuchan.Dao.ICountryDao;
import cn.liuchan.Do.Country;
import cn.liuchan.Do.Student;
import cn.liuchan.utils.MybatisUtils;

public class MyTest {
	private ICountryDao countryDao;
	private SqlSession sqlSession;

	@Before
	public void before() {
		sqlSession = MybatisUtils.getSqlSession();
		countryDao = sqlSession.getMapper(ICountryDao.class);
	}

	@After
	public void after() {
      if(sqlSession!=null){
    	  sqlSession.close();
      }
	}

	@Test
	public void test01() {
		Country country=countryDao.selectCountryById(1);
		System.out.println(country);
	}
	
}
