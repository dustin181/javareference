package spring.org.autowire.specs;

import org.springframework.stereotype.Component;
import spring.org.autowire.interfaces.Engine;

@Component("V8Engine")
public class V8 implements Engine {
    @Override
    public String type() {
        return "V8 engine";
    }
}
