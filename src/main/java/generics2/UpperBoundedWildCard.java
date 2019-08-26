package generics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UpperBoundedWildCard {

    public static void main(String[] args) {


    }

//    public void saveAll(final List<? extends Person> person){
//        for(Person person: persons){
//            save(person);
//        }
//    }

    //this also works
//    public <T extends Person> void saveAll(final List<T> person){
//        for(Person person: persons){
//            save(person);
//        }
//    }

    //use T when you need something to refer to and you want to restrict it
    //use ? when you want a parameter on a method and want some flexibility

    //UpperBounded means the class and its superclasses
    //LowerBounded would use super instead of extends.



}


