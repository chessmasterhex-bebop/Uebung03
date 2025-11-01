package h2;

public class H2_main {
    public static void main(String[] args) {

        // Wird vom Autograder überschrieben
        int jahr = 2000;
        boolean schalt = false;

        // Schaltjahr-Regel:
        // - durch 4 teilbar  → Schaltjahr
        // - außer durch 100  → dann kein Schaltjahr
        // - außer durch 400  → dann doch Schaltjahr
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    schalt = true;
                } else {
                    schalt = false;
                }
            } else {
                schalt = true;
            }
        } else {
            schalt = false;
        }

        // keine Ausgabe – Autograder liest die Variable direkt
    }
}
