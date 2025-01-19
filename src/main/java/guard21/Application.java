package guard21;

import guard21.check.*;
import guard21.model.FlugStatus;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // Flugstatus mit allen Bedingungen
        FlugStatus status = new FlugStatus(true, true, false); // Wetter schlecht

        // Liste aller Checks
        List<Guard> guards = List.of(
                new FlugzeugCheck(),
                new CrewCheck(),
                new WetterCheck()
        );

        // Prüft alle Bedingungen
        boolean readyForTakeoff = guards.stream()
                .allMatch(guard -> guard.check(status));

        // Ergebnis anzeigen
        if (readyForTakeoff) {
            System.out.println("Flug freigegeben!");
        } else {
            System.out.println("Flug nicht freigegeben!");
        }
    }
}