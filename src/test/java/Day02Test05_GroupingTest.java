import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test05_GroupingTest {

    // amacimiz, birbiriyle iliskili testleri gruplamak, ayni sinifin icinde
    // 2 parametreli test yazarak gruplamak istiyoruz


    @Nested
    // Math classinin multiplyExact() methodunu, sifili veya sifirsiz parametreler ile test etmek icin yazdigim 2 test methodunu
    // @Nested annotation'i ile grupladim
    class MultiplyTest {
        @ParameterizedTest
        @CsvSource(value = {"-12,-4,3","-12,4,-3","12,-4,-3"})
        void testMultiplyWİthNonZero(int rs, int x, int y){
            assertEquals(rs,Math.multiplyExact(x,y));
        }

        @ParameterizedTest
        @CsvSource(value = {"0,-4,0","0,4,0","0,0,4"})
        void testMultiplyWİthZero(int rs, int x, int y){
            assertEquals(rs,Math.multiplyExact(x,y));
        }

        // 1. grup testin sonu
    }


    @Nested
    // Math classinin addExact() methodunu, sifili veya sifirsiz parametreler ile test etmek icin yazdigim 2 test methodunu
    // @Nested annotation'i ile grupladim
    class AddTest {

        @ParameterizedTest
        @CsvSource(value = {"-1,-4,3", "1,4,-3", "-7,-4,-3"})
        void testAddWithNonZero(int rs, int x, int y) {

            assertEquals(rs, Math.addExact(x, y));
        }

        @ParameterizedTest
        @CsvSource(value = {"9,0,9", "2,2,0", "4,4,0"})
        void testAddWithZero(int rs, int x, int y) {

            assertEquals(rs, Math.addExact(x, y));
        }

        // '. grup testin sonu
    }

}
