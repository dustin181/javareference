package multithreading;

public class LongWrapper {

    private long l;

    public long getValue() {
        return l;
    }

    public void setValue(long l) {
        this.l = l;
    }

    public void incrementValue() {
        l = l +1;
    }
}
