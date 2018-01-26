package top.jalo.demo.qcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaAuditing
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"top.jalo.commons", "top.jalo.demo"})
public class QcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcsApplication.class, args);
	}
}
