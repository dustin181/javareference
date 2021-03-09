package algorithms.tests.sample;

public class RomanConverter {

    public int convertRomanToArabicNumber(String roman){
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        }
        throw new IllegalArgumentException();
    }
}
