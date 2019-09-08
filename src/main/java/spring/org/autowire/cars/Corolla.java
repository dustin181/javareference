package spring.org.autowire.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring.org.autowire.interfaces.Car;
import spring.org.autowire.interfaces.Engine;

@Component("corolla")
public class Corolla implements Car {

    @Autowired
    @Qualifier("V6Engine")
    Engine engine;

    @Override
    public String specs() {
        String specs = "Sedan from Toyota with engine type as " + engine.type();
        return specs;
    }
}
