package cleancode.staticfactory;

import java.util.Collections;
import java.util.List;

public class StaticFactoryTest {

    public static void main(String[] args) {
        User user = User.createWithDefault();

        System.out.println(user);

    }
}
