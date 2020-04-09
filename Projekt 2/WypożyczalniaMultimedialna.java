import java.util.Scanner;

public class WypożyczalniaMultimedialna {
    public static void main(String[] arg) {
        int wybor;


        Klient ki = new Klient();
        ki.klient();

        System.out.println("\tWypożyczalnia Multimedialna PWr");

        System.out.println("Co chcesz wypożyczyć ?");
        System.out.println("1.Książka");
        System.out.println("2.Film");
        System.out.println("3.Płyta Muzyczna");
        System.out.println("4.Audiobook");
        System.out.println("5.Ebook");
        Scanner sc = new Scanner(System.in);
        wybor = sc.nextInt();
        System.out.print("Wybieram : " + wybor);
        switch (wybor) {
        case 1:
            {
                Ksiazki k = new Ksiazki();
                k.wypozyczenie();
            break;
        }
        case 2:
        {
            Filmy f = new Filmy();
            f.wypozyczenie();
            break;
        }
            case 3:
            {
                PlytyMuzyczne pm = new PlytyMuzyczne();
                pm.wypozyczenie();
                break;
            }
            case 4:
            {
                Audiobooki a = new Audiobooki();
                a.wypozyczenie();
                break;
            }
            case 5:
            {
                Ebooki e = new Ebooki();
                e.wypozyczenie();
                break;
            }
            default:{
                System.out.println("\tPodałeś niewłaściwy numer.Podaj jeszcze raz.");
                wybor = sc.nextInt();
            }

        }
        sc.close();



    }
}
