import java.util.Random;
import java.util.Scanner;

public class Wybór {


    public static void pokaz_tablice(int[] tab) {
        for (int j = 0; j < tab.length; j++)

            System.out.println(tab[j] + " ");

        System.out.println("\n");
    }


    public static void main(String[] arg) {
        int decyzja;
        Random r = new Random();
        int[] tab = new int[200];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(300);
        }
        System.out.println("Oto nieposortowana tablica :");
        for (int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");
        System.out.println("\nJaki rodzaj sortowania wybierasz ?");
        System.out.println("1.Bąbelkowe");
        System.out.println("2.Kubełkowe");
        Scanner sc = new Scanner(System.in);
        decyzja = sc.nextInt();
        System.out.println("Wybieram : " + decyzja);
        switch (decyzja) {
            case 1:
                Bubbl b = new Bubbl();
                tab = b.sort(tab);
                break;
            case 2:
                Bucket bl = new Bucket();
                tab = bl.sort(tab);
                break;
            default:
                System.out.println("Podana cyfra jest niepradwidłowa");
        }
            System.out.println();
            System.out.println("Uporządkowana tablica : ");
            pokaz_tablice(tab);

        }


    }






