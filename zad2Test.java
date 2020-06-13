import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class zad2Test {

    private zad2 ciag = new zad2();

    @Test
    public void Wystepuje() {
        Random r = new Random();
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(10);
        }

        assertTrue(ciag.algorytm(tab));
    }

    @Test
    public void NieWystepuje(){
        Random r = new Random();
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(10);
        }

        assertFalse(ciag.algorytm(tab));
    }
}


