package algorithms.tests.sample;

import org.junit.Test;


import static org.junit.Assert.*;

public class RomanConverterTest {

    @Test
    public void ConvertI(){
        assertEquals(1, new RomanConverter().convertRomanToArabicNumber("I"));
    }

    @Test
    public void ConvertII(){
        assertEquals(2, new RomanConverter().convertRomanToArabicNumber("II"));
    }
}
