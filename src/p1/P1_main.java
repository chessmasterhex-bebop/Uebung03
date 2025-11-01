package p1;

import java.util.Random;

public class P1_main {
    public static void main(String[] args) {

        // Erzeuge ein Zufallsobjekt
        Random zufall = new Random();

        // Generiere eine Zahl von 1 bis 6 (inklusive)
        int wuerfel = zufall.nextInt(6) + 1;

        System.out.println("Gewürfelte Zahl: " + wuerfel);

        if (wuerfel == 1 || wuerfel == 4) {
            System.out.println("Gewonnen!");
        } else if (wuerfel == 2) {
            System.out.println("Verloren!");
        } else if (wuerfel == 5) {
            System.out.println("Unentschieden.");
        } else {
            System.out.println("Lage unklar.");
        }
    }
}
