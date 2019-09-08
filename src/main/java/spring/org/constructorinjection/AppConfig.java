package spring.org.constructorinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.org.constructorinjection.cars.Corolla;
import spring.org.constructorinjection.cars.Swift;
import spring.org.constructorinjection.specs.EngineType;

@Configuration
@ComponentScan("spring.org.betterconfig")
public class AppConfig {

    @Bean("corolla")
    public Corolla corolla(){
        return new Corolla();
    }

    @Bean("swift")
    public Swift swift(){
        return new Swift();
    }

    @Bean("engineType")
    public EngineType engineType(){
        return new EngineType("V8 Engine");
    }
}
