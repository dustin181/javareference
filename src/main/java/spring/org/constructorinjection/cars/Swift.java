package spring.org.constructorinjection.cars;

import spring.org.constructorinjection.interfaces.Car;

public class Swift implements Car {

    @Override
    public String specs() {

        return "Hatchback from Suzuki";
    }
}
