package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P2_main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Geben Sie a ein: ");
            double a = sc.nextDouble();

            System.out.print("Geben Sie b ein: ");
            double b = sc.nextDouble();

            System.out.print("Geben Sie c ein: ");
            double c = sc.nextDouble();

            int d = 0;

            // E1: a == b
            if (a == b) {
                d++;
            }

            // E2: a stimmt mit b oder c überein
            if (a == b || a == c) {
                d++;
            }

            // E3: a + b >= c
            if (a + b >= c) {
                d++;
            }

            // E4: a + b + c >= 100
            if (a + b + c >= 100) {
                d++;
            }

            System.out.println("\nAnzahl erfüllter Eigenschaften: " + d);

        } catch (InputMismatchException e) {
            System.out.println("Fehler: Bitte geben Sie nur Zahlen ein.");
        }

        sc.close();
    }
}
