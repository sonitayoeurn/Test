package co.istad.demospring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MyFirstSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringApplication.class, args);
	}

	@Value("${server.port}")
	private Integer port;

	@Value("${devops.class}")
	private String devOpsClass;


	@Override
	public void run(String... args) throws Exception {
		log.info("Port = {}", port);
		log.info("DevOps Class = {}", devOpsClass);
	}
}
