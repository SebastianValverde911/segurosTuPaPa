package segurosTuPapa.seguro;

import org.springframework.context.annotation.PropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class SeguroApplication {

	public static void main(String[] args) {
		printEnvVariables(); // Llama al método para imprimir las variables de entorno
		SpringApplication.run(SeguroApplication.class, args);
	}

	private static void printEnvVariables() {
		System.out.println("DATABASE_URL: " + System.getenv("DATABASE_URL"));
		System.out.println("DATABASE_USERNAME: " + System.getenv("DATABASE_USERNAME"));
		System.out.println("DATABASE_PASSWORD: " + System.getenv("DATABASE_PASSWORD"));
	}
}
