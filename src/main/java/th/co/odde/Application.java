package th.co.odde;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by roof on 12/30/14.
 */
@ComponentScan
@EnableAutoConfiguration
public class Application {
    @Bean
    Randomizer randomizer() {
        return new MyRandomizer();
    }

    @Bean
    CaptchaService captchaService() {
        CaptchaService captchaService = new MyCaptchaService();
        captchaService.setRandomizer(randomizer());
        return captchaService;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }
}
