package h3;

public class H3_main {
    public static void main(String[] args) {

        // Startwerte – werden vom Autograder überschrieben
        int max = 5;        // maximal mögliche Fixplätze
        int fix = 2;        // schon vergebene Fixplätze
        int wartend = 12;   // Personen auf der Warteliste
        boolean istVoll = false;  // wird am Ende NEU gesetzt

        // solange noch Platz UND noch Leute warten → Plätze vergeben
        while (fix < max && wartend > 0) {
            fix = fix + 1;
            wartend = wartend - 1;
        }

        // am Ende MUSS istVoll korrekt gesetzt werden (steht im Hinweis!)
        if (fix >= max) {
            istVoll = true;
        } else {
            istVoll = false;
        }

        // keine Ausgabe – Autograder liest die Variablen
    }
}
