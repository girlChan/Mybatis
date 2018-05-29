package cn.liuchan.Dao;

import java.util.List;
import cn.liuchan.Do.Student;

public interface IStudentDao {
	List<Student> selectStudentsByIf(Student student);
	List<Student> selectStudentsByWhere(Student student);
	List<Student> selectStudentsByChoose(Student student);
	List<Student> selectStudentsByForeach(int[] ids);
	List<Student> selectStudentsByForeach2(List<Integer> ids);
	List<Student> selectStudentsByForeach3(List<Student> students);
	List<Student> selectStudentsBySqlFragment(List<Student> students);
}
