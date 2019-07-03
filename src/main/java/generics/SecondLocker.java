package generics;

public class SecondLocker<T1, T2> {
    private T1 content1;
    private T2 content2;

    public SecondLocker( ) {
        this(null, null);
    }
    public SecondLocker(T1 item1, T2 item2) {
        storeFirstItem(item1);
        storeSecondItem(item2);
    }
    public T1 retrieveFirstItem( ) {
        return content1;
    }
    public void storeFirstItem(T1 item) {
        content1 = item;
    }
    public T2 retrieveSecondItem( ) {
        return content2;
    }
    public void storeSecondItem(T2 item) {
        content2 = item;
    }

    public static void main(String[] args) {
        SecondLocker<String, Integer> myLocker =
                new SecondLocker<String, Integer>("Hello",
                        new Integer(20));
        String str = myLocker.retrieveFirstItem( );
        Integer intObj = myLocker.retrieveSecondItem( );

        SecondLocker<String, String> myLocker2 =
                new SecondLocker<String, String>("Hello", "Java");
    }
}


