import org.junit.Test;
import static org.junit.Assert.*;

public class zad1Test {

    private zad1 ter = new zad1();

    @Test
    public void Fałsz(){
        assertFalse(ter.porownanie(112, 998));
    }

    @Test
    public void Prawda(){
        assertFalse(ter.porownanie(45, 655));
    }
}
