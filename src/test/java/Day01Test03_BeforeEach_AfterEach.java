import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test03_BeforeEach_AfterEach {

    String str;

    @BeforeEach
    void beforeEach(){
        str="JUnit5 is better than JUnit4";
        System.out.println("beforeEach() method'u calisti");
    }

    @AfterEach
    void afterEach(){
        str=null;
        System.out.println("afterEach() calisti");
    }


    @Test
    void testArrays( TestInfo info ){ // hangi testin calistigini anlamak icin parametre girildi
        String[] actualArr= str.split(" ");
        String[] expecetedArr= {"JUnit5","is","better","than","JUnit4"};
        System.out.println(info.getDisplayName()+" calisti");
        assertTrue(Arrays.equals(expecetedArr,actualArr));
    }


    // farkli bir ornek
    @Test
    void testStringLength( TestInfo info ){

        int actualValue=str.length();
        int expectedValue= 28;

        assertEquals(expectedValue,actualValue);
        System.out.println(info.getDisplayName()+" calisti");
    }


}
