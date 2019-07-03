package designpatterns.challenges.factorysolution;

public class AnimalFactory {

    Animal getAnimal(AnimalType type){
        if(type.equals(AnimalType.DUCK)){
            return new Duck();
        }
        else if (type.equals(AnimalType.TIGER)){
            return new Tiger();
        }

        return null;
    }
}

enum AnimalType {
    DUCK,
    TIGER
}
