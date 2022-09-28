import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Day01Test04_BeforeAll_AfterAll {

    @BeforeAll
    static void beforeAll(TestInfo info){

        System.out.println(info.getDisplayName()+" open a file");
    }

    @AfterAll
    static void afterAll(TestInfo info){

        System.out.println(info.getDisplayName()+" close a file");
    }


    @Test
    void testWithArrays(TestInfo info){
        String str = "Unit test with JUnit";
        String[] actualValue= str.split(" ");
        String[] expecetedValue= {"Unit","test","with","JUnit"};

        assertArrayEquals(expecetedValue,actualValue,"diziler esit degil");
        System.out.println(info.getDisplayName()+" calisti");

    }

}
