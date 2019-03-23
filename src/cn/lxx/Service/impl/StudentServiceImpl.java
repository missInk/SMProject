package cn.lxx.Service.impl;

import cn.lxx.Service.IStudentService;
import cn.lxx.entity.Student;
import cn.lxx.mapper.StudentMapper;

public class StudentServiceImpl implements IStudentService{

	private StudentMapper studentDaoImpl;
	
	public StudentMapper getStudentDaoImpl() {
		return studentDaoImpl;
	}

	public void setStudentDaoImpl(StudentMapper studentDaoImpl) {
		this.studentDaoImpl = studentDaoImpl;
	}

	@Override
	public int addStudent(Student stu) {
		return studentDaoImpl.addStudent(stu);
	}

}
