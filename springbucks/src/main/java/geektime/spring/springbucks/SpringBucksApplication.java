package geektime.spring.springbucks;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableTransactionManagement
@SpringBootApplication
@EnableCaching

@MapperScan("geektime.spring.springbucks.mapper")
public class SpringBucksApplication  {
    
	public static void main(String[] args) {
		SpringApplication.run(SpringBucksApplication.class, args);
	}

}

