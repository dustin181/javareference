package designpatterns.challenges.factorysolution;

public class AnimalClient {



    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal duck = animalFactory.getAnimal(AnimalType.DUCK);
        duck.speak();

        Animal tiger = animalFactory.getAnimal(AnimalType.TIGER);
        tiger.speak();
    }

}
