import java.util.Random;
import java.util.Scanner;

public class Wybór {


    public static void pokaz_tablice(int[] tab) {
        for (int j = 0; j < tab.length; j++) {

            System.out.println(tab[j] + " ");
        }
        System.out.println();
    }


    public static void main(String[] arg) {
        int decyzja;
        Random r = new Random();
        int[] tab = new int[200];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(300);
        }
        System.out.println("Jaki rodzaj sortowania wybierasz ?");
        System.out.println("1.Bąbelkowe");
        System.out.println("2.Kubełkowe");
        Scanner sc = new Scanner(System.in);
        decyzja = sc.nextInt();
        System.out.println("Wybieram : " + decyzja);
        switch (decyzja) {
            case 1: {
                Wybór.pokaz_tablice(tab);
                Bubbl b = new Bubbl();
                tab = Bubbl.sort(tab);
                Wybór.pokaz_tablice(tab);
                break;
            }
            case 2: {
                Wybór.pokaz_tablice(tab);
                Bucket bl = new Bucket();
                tab = Bucket.sort(tab);
                Wybór.pokaz_tablice(tab);
            }
            default: {

                decyzja = sc.nextInt();


            }


        }


    }
}
