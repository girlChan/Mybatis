import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.liuchan.Dao.INewsLabelDao;
import cn.liuchan.Do.NewsLabel;
import cn.liuchan.utils.MybatisUtils;

public class MyTest {
	private INewsLabelDao newsLabelDao;
	private SqlSession sqlSession;

	@Before
	public void before() {
		sqlSession = MybatisUtils.getSqlSession();
		newsLabelDao = sqlSession.getMapper(INewsLabelDao.class);
	}

	@After
	public void after() {
      if(sqlSession!=null){
    	  sqlSession.close();
      }
	}

	/**
	 * 查询指定栏目所有子孙栏目
	 */
	@Test
	public void test01(){
		List<NewsLabel> childrens=newsLabelDao.selectChildrenByParent(2);
		for(NewsLabel children:childrens){
			System.out.println(children);
		}
	}
	/**
	 * 查询指定栏目及其所有子孙栏目
	 */
	@Test
	public void test02(){
		NewsLabel children=newsLabelDao.selectNewsLabelById(2);
			System.out.println(children);
	}
	
}
