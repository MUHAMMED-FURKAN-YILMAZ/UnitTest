import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day02Test02_ParameterizedTest {

    @Test
    void testLength(){

        assertTrue("Mirac".length()>0);
        assertTrue("Tarik".length()>0);
        assertTrue("Ismail".length()>0);
        assertTrue("Taha".length()>0);
    }
    // yukaridaki method'u daha kolay yazmak icin parametreli testler kullaniriz
    @ParameterizedTest
    @ValueSource(strings = {"Mirac","Tarik","Ismail","Taha"})
    void testLength2(String str){
        assertTrue(str.length()>0);
    }

    // 2. ornek
    @Test
    void testUpperCase(){
        String str1= "Merhaba";
        String str2= "Java";
        String str3= "Test";

        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }
    // yukaridaki ornegi parametreli test edelim
    @ParameterizedTest
    @CsvSource(value = //-> csvSource ile test ederken str1 -> expected olan MERHABA
                       //                              str2 -> actual olan merhaba kismini alir
            {
                    "MERHABA, merhaba",
                    "JAVA, java",
                    "TEST, test"
            })
    void testUpperCase(String str1, String str2){

        assertEquals(str1,str2.toUpperCase());
    }

    // 3. ornek
    @ParameterizedTest
    @CsvSource(value = {"true,java,a","true,junit,u","false,hello,a"})
    void testContains(boolean b, String str1, String str2){
        assertEquals(b,str1.contains(str2));
    }

}
