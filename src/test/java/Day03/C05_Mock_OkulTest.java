package Day03;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

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
        dummyObject2.guncelleOgrenci("Mehmet");
//        dummyObject2.silOgrenci("Ahmet");
    // Acaba "Ahmet" parametresi ile ekleOgrenci() method'u 2 defa cagrildi mi
        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet");

    // ekleOgrenci() method'unu "Buse" parametresi ile cagirilip cagirilmadigini kontrol ettim
        verify(dummyObject2,times(0)).ekleOgrenci("Buse");

        //herhangi bir parametre ile hic cagrilmamis method'u test etmek iatersem
        verify(dummyObject2,never()).silOgrenci(anyString());

        // method'un en az 2 defa cagrildigini test etmek istersek
        verify(dummyObject2,atLeast(2)).ekleOgrenci("Ahmet");
    }

    // methodlarin cagrilma sirasini test etmek istersem :
    @Test
    void testSiralama(){

        C05_Mock_Islemler dummyObject3= mock(C05_Mock_Islemler.class);

        dummyObject3.ekleOgrenci("Ahmet");
        dummyObject3.ekleOgrenci("Mehmet");
        dummyObject3.silOgrenci("Ahmet");

        // InOrder class'i siralama icin kullaniliyor
        InOrder inOrder=inOrder(dummyObject3);
        inOrder.verify(dummyObject3).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObject3).ekleOgrenci("Mehmet");
        inOrder.verify(dummyObject3).silOgrenci("Ahmet");

    }
}
