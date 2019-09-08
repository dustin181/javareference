package spring.org.betterconfig.specs;

import org.springframework.stereotype.Component;
import spring.org.betterconfig.interfaces.Engine;

public class V6 implements Engine {
    @Override
    public String type() {
        return "V6 engine";
    }
}
