package p3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P3_main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // =========================
            // 1) Betrag einer Zahl
            // =========================
            System.out.print("Geben Sie eine Zahl für den Betrag ein: ");
            double x = sc.nextDouble();  // akzeptiert auch negative & Kommazahlen

            if (x < 0) {
                x = -x;  // Betrag bilden
            }
            System.out.println("Betrag = " + x);

            // =========================
            // 2) Quadrat einer Zahl
            // =========================
            System.out.print("Geben Sie eine Zahl für das Quadrat ein: ");
            double y = sc.nextDouble();  // wieder double für Kommazahlen

            y = y * y;
            System.out.println("Quadrat = " + y);

            // =========================
            // 3) Gerade / ungerade
            // =========================
            System.out.print("Geben Sie eine Zahl für gerade/ungerade ein: ");
            double z = sc.nextDouble();  // erlaubt auch Kommazahlen

            // Logik: nur ganze Zahlen sind wirklich gerade/ungerade
            if (z % 2 == 0) {
                System.out.println(z + " ist gerade.");
            } else if (z % 2 == 1 || z % 2 == -1) {
                System.out.println(z + " ist ungerade.");
            } else {
                System.out.println(z + " ist keine ganze Zahl — gerade/ungerade nicht definiert.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Fehler: Bitte geben Sie eine Zahl ein.");
        }

        sc.close();
    }
}
