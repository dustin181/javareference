package designpatterns.challenges.factorysolution;

public interface Animal {
    void speak();
}

class Duck implements Animal{

    @Override
    public void speak() {
        System.out.println("speaking duck");
    }
}

class Tiger implements Animal{

    @Override
    public void speak() {
        System.out.println("speaking tiger");
    }
}
