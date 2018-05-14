package Dao;

import java.util.List;
import java.util.Map;
import Do.Student;

public interface IStudentDao {
	Student selectStudentById(int id);

	List<Student> selectStudentMap(Map<String, Object> map);
	List<Student> selectStudentByConditions(int age,String name);
}