import java.util.Scanner;
import java.util.Date;


public  class CechyOgolne {                   //Cechy zbiorów
    int numerWewnetrzny;
    String autor;
    String data;
    String wydawnictwo;
    double cena;

public void wypozyczenie(){                             // Metoda odpowiedzialna za obsługę i wybór multimediów

     System.out.println("\nPodaj numer wewnętrzny");
     Scanner sc = new Scanner(System.in);
     numerWewnetrzny = sc.nextInt();
     System.out.println("Podaj autora");
     autor = sc.next();
     System.out.println("Podaj datę");
     data = sc.next();
     System.out.println("Podaj wydawnictwo");
     wydawnictwo = sc.next();
     System.out.println("Podaj cenę");
     cena = sc.nextDouble();
    System.out.print("Numer Wewnętrzny: \n" + numerWewnetrzny);
    System.out.print("\nAutor: \n" + autor);
    System.out.print("\nData Wydania: \n" + data);
    System.out.print("\nWydawnictwo: \n" + wydawnictwo);
    System.out.print("\nCena: \n" + cena);
    Date nd = new Date();
    System.out.print("\nMaksymlany czas wypożyczenia : 30 dni. Dzisiejsza data :" + nd);
    System.out.print("\nKara piniężna na każdy dzień zwłoki wynosi 2zł");

}

}
