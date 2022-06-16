package geektime.spring.web.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import geektime.spring.web.foo.Teacher;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentService{
	public void save() {
		log.info("学生信息保存成功");
	}
	
	@Bean
	public Teacher teacher() {
		Teacher teacher = new Teacher();
		teacher.setId(1L);
		teacher.setName("史密斯");
		teacher.setClass_name("五年四班");
		return teacher;
	}
}