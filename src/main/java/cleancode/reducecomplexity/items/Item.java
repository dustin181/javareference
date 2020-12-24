package cleancode.reducecomplexity.items;

public abstract class Item {

    public abstract double price();

    public abstract boolean isAgeRestrictedItem();

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
