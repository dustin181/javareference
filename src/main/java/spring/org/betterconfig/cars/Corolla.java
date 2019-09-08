package spring.org.betterconfig.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring.org.betterconfig.interfaces.Car;
import spring.org.betterconfig.interfaces.Engine;

public class Corolla implements Car {

    @Autowired
    @Qualifier("V8Engine")
    Engine engine;

    @Override
    public String specs() {
        String specs = "Sedan from Toyota with engine type as " + engine.type();
        return specs;
    }
}
