package cn.lxx.Dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.lxx.entity.Student;
import cn.lxx.mapper.StudentMapper;

public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentMapper{

	@Override
	public int addStudent(Student student) {
		SqlSession session = super.getSqlSession();
		StudentMapper stuDao = session.getMapper(StudentMapper.class);
		int result = stuDao.addStudent(student);
		return result;
	}

}
