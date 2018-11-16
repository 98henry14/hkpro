package cn.qdama.siss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@MapperScan("cn.qdama.siss.dao")*/
public class SissApplication {

	public static void main(String[] args) {
		SpringApplication.run(SissApplication.class, args);
	}
}
