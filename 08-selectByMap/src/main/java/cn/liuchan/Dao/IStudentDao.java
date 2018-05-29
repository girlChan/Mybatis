package cn.liuchan.Dao;

import java.util.List;
import java.util.Map;

import cn.liuchan.Do.Student;

public interface IStudentDao {
	List<Student> selectStudentsByCondition(Map<String, Object> map);
}
