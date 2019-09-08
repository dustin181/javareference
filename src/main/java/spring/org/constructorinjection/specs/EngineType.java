package spring.org.constructorinjection.specs;

import spring.org.constructorinjection.interfaces.Engine;

public class EngineType implements Engine {

    String type;

    public EngineType() {

        type = "unknown";
    }

    public EngineType(String type) {
        this.type = type;
    }

    @Override
    public String type() {

        return type;
    }
}
