package cn.liuchan.Dao;

import java.util.List;
import java.util.Map;

import cn.liuchan.Do.Student;

public interface IStudentDao {
	void insertStudent(Student student);
	void insertStudentCacheId(Student student);
	
	void deleteStudentById(int id);
	void updateStudentById(Student student);
	
	
	List<Student> selectAllStudents();
	Map<String, Object> selectAllStudentsMap();

	Student selectStudentById(int id);
	List<Student> selectStudentsByName(String name);
}
