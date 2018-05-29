package cn.liuchan.Dao;

import java.util.List;

import cn.liuchan.Do.NewsLabel;

public interface INewsLabelDao {

	/**
	 * 查询指定栏目所有子孙栏目
	 */
	List<NewsLabel> selectChildrenByParent(int pid);
	/**
	 * 查询指定栏目及其所有子孙栏目
	 */
	NewsLabel selectNewsLabelById(int id);
}
