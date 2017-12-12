package lessons;

import lessons.services.GreetingService;
import lessons.services.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

/**
 * Конфигурационный класс Spring IoC контейнера
 */
@Configuration
public class LessonsConfiguration {

//    @Bean(name = "gServiceName")
    @Bean
    @Description("Greeting Bean description")
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}
