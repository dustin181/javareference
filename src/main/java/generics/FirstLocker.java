package generics;

class FirstLocker<T> {

    private T content;
    public FirstLocker( ) {
        store(null);
    }
    public T retrieve( ) {
        return content;
    }
    public void store(T item) {
        content = item;
    }

    public static void main(String[] args) {
        FirstLocker<String> lockerOne; //content is set to string
        FirstLocker<Integer> lockerTwo; //content is set to Integer

        lockerOne = new FirstLocker<String>( ); //create lockers
        lockerTwo = new FirstLocker<Integer>( );

        lockerOne.store("Hello"); //store an appropriate
        lockerTwo.store(new Integer(100)); //content

        String str = lockerOne.retrieve( ); //fetch content
        Integer intObj = lockerTwo.retrieve( );

        System.out.println(str);
        System.out.println(intObj);
    }

}
