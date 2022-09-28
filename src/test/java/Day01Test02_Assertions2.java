import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test02_Assertions2 {


    @Test
    public void testToFindMin(){

        assertTrue(Math.min(4,10)==4);
        assertFalse(Math.min(4,10)==10);
    }


    @Test
    public void testArrays(){

        String str= "Test islemi cok kolay";
        String[] actualArr = str.split(" ");
        String[] expectedArr = {"Test","islemi","cok","kolay"};

        assertTrue(Arrays.equals(expectedArr,actualArr));
    }


}
