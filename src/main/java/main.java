import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class main {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RobotProjec.class);
        app.run(args);
    }
}
