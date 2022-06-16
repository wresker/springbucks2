package geektime.spring.web.context;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import geektime.spring.web.foo.Teacher;
import geektime.spring.web.services.StudentService;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class BeanAssembleApplication implements ApplicationRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(BeanAssembleApplication.class, args);
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//xml装配
		log.info("============={}",context.getBean("student1"));
		log.info("============={}",context.getBean("student2"));
		//注解装配
		StudentService studentService = (StudentService) context.getBean("studentService");
		studentService.save();
		log.info("============={}",context.getBean("teacher"));
		((ConfigurableApplicationContext)context).close();
		
	}
}
