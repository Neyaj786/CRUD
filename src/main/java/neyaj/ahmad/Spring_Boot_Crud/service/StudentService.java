package neyaj.ahmad.Spring_Boot_Crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neyaj.ahmad.Spring_Boot_Crud.dao.StudentDao;
import neyaj.ahmad.Spring_Boot_Crud.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao dao;
	
	public String addStudent(Student student) {
		dao.save(student);
		return "All New Student added into Database, name :"+student.getName();
	}
	
	public String addStudents(List<Student> students) {
		dao.saveAll(students);
		return "All New Student added into Database";
	}
	
	public String deleteStudent(String name) {
		Student student = dao.getById(name);
		System.out.println(student);
		dao.delete(student);
		return "Name is deleted :"+name;
	}
	
	public String updateStudent(Student student) {
		dao.save(student);
		return "Name is update :"+student.getName();
	}
	
	public Student getStudent(String name) {
		return dao.findById(name).get();
	}

}
