import java.util.Scanner;

public class Klient {                    //Dane klienta
    String Imie;
    String Nazwisko;
    int Wiek;
    String Ulica;
    int numerLokalu;
    String Miejscowosc;
    int Kodpocztowy;
    int wybor;

    public void klient() {                                                 // Metoda odpowiedzialna za obsługę klienta
        System.out.println("\tCzy jesteś klientem wypożyczalni ?");
        System.out.println("1.Tak");
        System.out.println("2.Nie");
        Scanner sc = new Scanner(System.in);
        wybor = sc.nextInt();
        System.out.println(wybor);
        switch (wybor) {
            case 1: {
                System.out.println("Podaj imię.");
                Imie = sc.next();
                System.out.println("Podaj nazwisko");
                Nazwisko = sc.next();
                System.out.println("Czy masz już wypożyczone materiały ?");
                System.out.println("1.Tak");
                System.out.println("2.Nie");
                wybor = sc.nextInt();
                System.out.println(wybor);
                switch (wybor) {
                    case 1: {
                        System.out.println("Czy przkroczyłeś limit czasowy 30 dni ?");
                        System.out.println("1.Tak");
                        System.out.println("2.Nie");
                        wybor = sc.nextInt();
                        switch (wybor) {
                            case 1: {
                                System.out.println("Opłać karę !");
                                System.exit(0);
                                break;
                            }
                            case 2: {
                                System.out.println("Pilnuj czasu.");
                                break;
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Wybierz swoją pozycję");
                        break;
                    }
                }
                break;
            }
                    case 2: {
                        System.out.println("\tZaloguj się");
                        System.out.println("Podaj imię.");
                        Imie = sc.next();
                        System.out.println("Podaj nazwisko");
                        Nazwisko = sc.next();
                        System.out.println("Podaj wiek");
                        Wiek = sc.nextInt();
                        if (Wiek > 18) {
                        } else {
                            System.out.println("Nie jesteś pełnoletni");
                            System.exit(0);
                        }
                        System.out.println("\nPodaj adres zamieszkania :");
                        System.out.println("\nPodaj ulicę.");
                        Ulica = sc.next();
                        System.out.println("\nPodaj numer lokalu");
                        numerLokalu = sc.nextInt();
                        System.out.println("\nPodaj miejscowość");
                        Miejscowosc = sc.next();
                        System.out.println("\nPodaj kod pocztowy(bez przerwy)");
                        Kodpocztowy = sc.nextInt();
                        System.out.println("\nZalogowano pomyślnie");
                        System.out.println("\nImię : " + Imie);
                        System.out.println("\nNazwisko : " + Nazwisko);
                        System.out.println("\nWiek : " + Wiek);
                        System.out.println("Ulica : " + Ulica);
                        System.out.println("Numer lokalu : " + numerLokalu);
                        System.out.println("Miejscowość : " + Miejscowosc);
                        System.out.println("Kod pocztowy : " + Kodpocztowy);
                        break;
                    }




                }
            }
        }

