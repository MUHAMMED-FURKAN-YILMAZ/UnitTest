import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test01_Assertions {


    @Test
    public void test(){
        // main method'u yokken nasil calisti?
            // Junit icinde gomulu gelen main method'u cagiriliyor
            // Class bos oldugu icin test gecti
    }


    @Test
    public void testLength(){

        String cumle= "Merhaba Dunyam"; // 14 karakter
        int actual=cumle.length();
        int expected= 14;

//        assertEquals(expected,actual);

        // testim hata verdiginde mesaj vermek istiyorsam
        assertEquals(expected,actual,"Uzunluklar uyusmadi");
    }


    @Test
    public void testUpperCase(){
        String actualValue = "Merhaba".toUpperCase();
        String expectedValue = "MERHABA";

        assertEquals(expectedValue,actualValue,"UpperCase method'u duzgun calismiyor");

    }


    @Test
    public void testToplama(){
        int sayi1=10;
        int sayi2=5;

        int actualValue= Math.addExact(sayi1,sayi2);
        int ecpectedValue=15;

        assertEquals(ecpectedValue,actualValue);
    }


    // contains() test edelim
    @Test
    public void testContains(){
        assertEquals(false,"Mirac".contains("z"));
    }


}
