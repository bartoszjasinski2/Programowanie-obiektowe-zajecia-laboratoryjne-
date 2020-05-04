import java.util.Arrays;
import java.util.Random;

public class Bucket implements Sortable {



    public int[] sort(int[] tab) {



        int max_wartosc = 0;
        for (int i = 0; i < tab.length; i++) {


            if (tab[i] > max_wartosc)
                max_wartosc = tab[i];
        }



        int[] buck = new int[max_wartosc + 1];
        int[] s = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {

            buck[tab[i]]++;
        }

        int a = 0;
        for (int i = 0; i < buck.length; i++) {
            for (int j = 0; j < buck[i]; j++) {

                s[a++] = i;
            }
        }

        return s;
    }
    public double step_counting() {
        return 0;
    }

}
