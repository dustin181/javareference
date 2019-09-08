package spring.org.constructorinjection.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring.org.constructorinjection.interfaces.Car;
import spring.org.constructorinjection.interfaces.Engine;

public class Corolla implements Car {

    @Autowired
    @Qualifier("engineType")
    Engine engine;

    @Override
    public String specs() {
        String specs = "Sedan from Toyota with engine type as " + engine.type();
        return specs;
    }
}
