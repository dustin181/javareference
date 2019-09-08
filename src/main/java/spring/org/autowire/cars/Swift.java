package spring.org.autowire.cars;

import org.springframework.stereotype.Component;
import spring.org.autowire.interfaces.Car;

@Component("swift")
public class Swift implements Car {

    @Override
    public String specs() {

        return "Hatchback from Suzuki";
    }
}
