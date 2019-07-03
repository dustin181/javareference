package generics;

class LockerSubTwo<T, R> extends FirstLocker<T> {
    private R renter;

    public LockerSubTwo() {
        this(null, null);
    }

    public LockerSubTwo(T item, R renter) {
        super();
        store(item);
        setRenter(renter);
    }

    public R getRenter() {
        return renter;
    }

    public void setRenter(R renter) {
        this.renter = renter;
    }

    public static void main(String[] args) {
        LockerSubTwo<String, Integer> lockerOne;
        LockerSubTwo<Integer, Double> lockerTwo;
    }
}
