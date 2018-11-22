package cn.qdama.siss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
/*@MapperScan("cn.qdama.siss.mapper")*/
@EnableScheduling
public class SissApplication {

	public static void main(String[] args) {
		SpringApplication.run(SissApplication.class, args);
	}
}
