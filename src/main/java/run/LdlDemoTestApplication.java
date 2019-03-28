package run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="run.com.dongli")
@ComponentScan
/* @MapperScan(value = {"com.dongli.dao"}) */
public class LdlDemoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LdlDemoTestApplication.class, args);
	}

}
