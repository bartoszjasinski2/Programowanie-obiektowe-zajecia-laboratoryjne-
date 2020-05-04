import java.io.Console;
import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        {
            int n, x, f = 0, i = 0;
            Scanner s = new Scanner(System.in);
            System.out.print("Wprowadź liczbę elementów w twojej tablicy:");
            n = s.nextInt();
            int a[] = new int[n];
            System.out.println("Wprowadź elementy");
            for (i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            System.out.print("Wprowadź element, który chcesz znaleźć");
            x = s.nextInt();
            for (i = 0; i < n; i++) {
                if (a[i] == x) {
                    f = 1;
                    break;
                } else {
                    f = 0;
                }
            }
            if (f == 1) {
                System.out.println("Element znaleziony na pozycji:" + (i + 1));
            } else {
                System.out.println("Element nie znaleziony");
            }
        }
    }
}