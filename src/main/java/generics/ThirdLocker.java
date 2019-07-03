package generics;

public class ThirdLocker<T> {
    private T content1;
    private T content2;

    public ThirdLocker( ) {
        this(null, null);
    }
    public ThirdLocker(T item1, T item2) {
        storeFirstItem(item1);
        storeSecondItem(item2);
    }
    public T retrieveFirstItem( ) {
        return content1;
    }
    public void storeFirstItem(T item) {
        content1 = item;
    }
    public T retrieveSecondItem( ) {
        return content2;
    }
    public void storeSecondItem(T item) {
        content2 = item;
    }

    public static void main(String[] args) {
        ThirdLocker<String> myLocker1 = new ThirdLocker<String>( );
        ThirdLocker<String> myLocker2
                = new ThirdLocker<String>("Hello", "Java");
    }
}


