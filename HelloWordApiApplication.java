import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"school.hei.hellowordapi","controller"})
public class HelloWordApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWordApiApplication.class, args);
    }

}