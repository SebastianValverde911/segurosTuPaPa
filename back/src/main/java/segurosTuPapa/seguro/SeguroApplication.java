package segurosTuPapa.seguro;

import org.springframework.context.annotation.PropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class SeguroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeguroApplication.class, args);
	}
}
