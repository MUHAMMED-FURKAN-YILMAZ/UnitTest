package Day03;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class C06_ErrorTest {

    @Test
    void test(){

        // ErrorRunner cclass'inda divide method'u 5 ve 0 parametreleri ile hata firlatirken ayni method'u
        // mocklanan obje uzerinden cagirdigimizda hata firlatmaz, obje sahte oldugu icin method gercekten calismaz
        C06_Error testObj= Mockito.mock(C06_Error.class);

        testObj.divide(5,0);
    }

}
