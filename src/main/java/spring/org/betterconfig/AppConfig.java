package spring.org.betterconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.org.betterconfig.cars.Corolla;
import spring.org.betterconfig.cars.Swift;
import spring.org.betterconfig.specs.V6;
import spring.org.betterconfig.specs.V8;

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

    @Bean("V6Engine")
    public V6 v6(){
        return new V6();
    }

    @Bean("V8Engine")
    public V8 v8(){
        return new V8();
    }


}
