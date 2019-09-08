package spring.org.betterconfig.specs;

import org.springframework.stereotype.Component;
import spring.org.betterconfig.interfaces.Engine;

public class V8 implements Engine {
    @Override
    public String type() {
        return "V8 engine";
    }
}
