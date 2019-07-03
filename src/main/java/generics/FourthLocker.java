package generics;

class FourthLocker<T extends Number> {
    private T content;

    public FourthLocker( ) {
        this(null);
    }
    public FourthLocker(T item) {
        store(item);
    }
    public T retrieve( ) {
        return content;
    }
    public void store(T item) {
        content = item;
    }
    public boolean isSameValue(FourthLocker<?> item) {
        return this.retrieve().doubleValue() ==
                item.retrieve().doubleValue();
    }

    public static void main(String[] args) {
        FourthLocker<Double> locker1 =
                new FourthLocker<Double>(new Double(3.0));
        FourthLocker<Integer> locker2 =
                new FourthLocker<Integer>(new Integer(3));
        System.out.println("Values in locker1 and locker2 " +
                "are the same: " +
                locker1.isSameValue(locker2));
    }
}


