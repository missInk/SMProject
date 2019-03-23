package cn.lxx.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lxx.Service.IStudentService;
import cn.lxx.entity.Student;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService studentService = (IStudentService)context.getBean("studentService");
		Student stu = new Student();
		stu.setSage("18");
		stu.setSex("ÕÅÈý");
		stu.setSname("¹þ¹þ¹þ¹þ°ÁÊÓ");
		studentService.addStudent(stu);
	}

}
