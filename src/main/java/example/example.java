package example;

/**
 * Created by bilalturk on 11.03.2016.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class example {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(example.class, args);
    }
}
