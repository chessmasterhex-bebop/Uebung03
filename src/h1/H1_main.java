package h1;

public class H1_main {
    public static void main(String[] args) {

        // Startwerte (werden vom Autograder überschrieben)
        double guthaben = -100.0;
        double monEingang = 200.0; // laut Hinweis: nie negativ
        int rating = -2;
        boolean warnhinweis = false;
        boolean negativ = false;

        // =========================
        // 1) negativ setzen
        // =========================
        if (guthaben < 0) {
            negativ = true;
        } else {
            negativ = false;
        }

        // =========================
        // 2) rating anpassen
        // (Reihenfolge exakt wie im Aufgabenblatt)
        // =========================
        if (guthaben > 0) {
            rating = rating + 3;
        } else if (guthaben == 0) {
            rating = rating + 2;
        } else { // guthaben < 0
            if (monEingang >= Math.abs(guthaben)) {
                rating = rating + 1;
            } else {
                rating = rating - 1;
            }
        }

        // =========================
        // 3) warnhinweis setzen
        // (nach der Rating-Anpassung)
        // =========================
        if (guthaben < 0 && monEingang < Math.abs(guthaben) && rating < 0) {
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }

        // keine Ausgabe – Autograder liest Variablen direkt
    }
}
