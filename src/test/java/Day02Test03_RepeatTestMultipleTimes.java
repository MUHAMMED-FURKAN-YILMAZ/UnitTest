import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test03_RepeatTestMultipleTimes {

    // testimi tekrarlatmak istersem ?

    @RepeatedTest(5)
    void testSubstring(){
        assertEquals("Java","Java is an OOP language".substring(0,4));
        System.out.println("test calisti");
    }

    // 2. ornek
    //@Disabled  -> Her hangi bir testi disable etmek istersek @Disabled annotation'i ilgili test methodunun uzerine yazmamiz yeterli
    @RepeatedTest(3)
    void testRepeat(){
        assertEquals(2,Math.addExact(1,1));
        System.out.println("calisti");
    }

    // 3. ornek
    Random rm= new Random();
    @RepeatedTest(5)
    void testMathexact(){
        int sayi1=rm.nextInt(10);
        int sayi2=rm.nextInt(10);

        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 = " + sayi1 + " sayi2 = "+sayi2);

    }


}
