

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {

        try {
            String wybor;
            System.out.println("Zapisz wyraz");
            Scanner sc = new Scanner(System.in);
            wybor = sc.nextLine();
            for (int i = 0; i < wybor.length(); i++) {
                int l = Character.getNumericValue(wybor.charAt(i));
                System.out.print(l);
            }

        } finally  {
            System.out.println("\tKoniec");
        }
    }
}