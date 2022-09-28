import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Day02Test04_PerformansTest {


    @Test
    void testPrintPerformans(){
        assertTimeout(Duration.ofSeconds(3),()-> IntStream.rangeClosed(1,100000).forEach(System.out::println));
    }

    // 2. ornek
    @Test
    void testPrintPerformans2(){
        assertTimeout(Duration.ofSeconds(2),()->IntStream.rangeClosed(1,50000).reduce((x,y)->Math.addExact(x,y)));
        //  Bunu nerede kullanabiliriz ? Mesela Task olarak verilen sorunun cozumu icin
        //  yazilan kodun maksimum 2 saniye icinde ekrana vermesini istiyorsam performans testlerini uygularim
    }

}
