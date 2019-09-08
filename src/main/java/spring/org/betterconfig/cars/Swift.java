package spring.org.betterconfig.cars;

import org.springframework.stereotype.Component;
import spring.org.betterconfig.interfaces.Car;

public class Swift implements Car {

    @Override
    public String specs() {

        return "Hatchback from Suzuki";
    }
}
