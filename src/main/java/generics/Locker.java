package generics;

class Locker<T> {

    private T content;
    public Locker( ) {
        store(null);
    }
    public T retrieve( ) {
        return content;
    }
    public void store(T item) {
        content = item;
    }

    public static void main(String[] args) {
        Locker<String> lockerOne; //content is set to string
        Locker<Integer> lockerTwo; //content is set to Integer

        lockerOne = new Locker<String>( ); //create lockers
        lockerTwo = new Locker<Integer>( );

        lockerOne.store("Hello"); //store an appropriate
        lockerTwo.store(new Integer(100)); //content

        String str = lockerOne.retrieve( ); //fetch content
        Integer intObj = lockerTwo.retrieve( );

        System.out.println(str);
        System.out.println(intObj);
    }

}
