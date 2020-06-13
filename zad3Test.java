import org.junit.Test;
import static org.junit.Assert.*;
public class zad3Test {

    private zad3 str = new zad3();

    @Test
     void Polowa(){
        assertEquals(str.polowaZnakow("Maszt"),3);
    }

    }

