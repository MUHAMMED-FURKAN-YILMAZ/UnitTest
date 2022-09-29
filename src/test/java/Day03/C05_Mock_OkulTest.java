package Day03;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class C05_Mock_OkulTest {

    @Test
    void islemler(){
        C05_Mock_Islemler dummyObject = mock(C05_Mock_Islemler.class);
        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Kasim");
    // Methodlar cagrilmis mi kontrol edelim
        verify(dummyObject).ekleOgrenci("Kasim");
        verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");

    }

    // methodlar kac kere cageildigini test edelim
    @Test
    void testKacKereCagirildi(){
        C05_Mock_Islemler dummyObject2 = mock(C05_Mock_Islemler.class);
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Mehmet");
    // Acaba "Ahmet" parametresi ile ekleOgrenci() method'u 2 defa cagrildi mi
        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet");

    // ekleOgrenci() method'unu "Buse" parametresi ile cagirilip cagirilmadigini kontrol ettim
        verify(dummyObject2,times(0)).ekleOgrenci("Buse");

    }

}
