import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.vrutech.*"})
@EntityScan(basePackages = {"com.vrutech.*"})
@EnableJpaRepositories(basePackages = {"com.vrutech.*"})

public class Main {

    public static void main(String[] c) {
        SpringApplication.run(Main.class);

    }


}
