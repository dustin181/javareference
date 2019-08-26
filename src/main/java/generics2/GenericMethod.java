package generics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GenericMethod {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>(Arrays.asList(789, 55, 22, 33, 100, 2));
        System.out.println(min(ints, Integer::compareTo));
    }


    public static <T> T min(List<T> values, Comparator<T> comparator){

        if(values.isEmpty()){
            throw new IllegalArgumentException("List is empty.  Cannot find minimum");
        }

        T lowestElement = values.get(0);

        for(int i = 1;i < values.size();i++){
            final T element = values.get(i);

            if(comparator.compare(element, lowestElement) < 0){
                lowestElement = element;
            }
        }

        return lowestElement;

    }
}


