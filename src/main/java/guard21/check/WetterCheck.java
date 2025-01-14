package guard21.check;

import guard21.model.FlugStatus;

public class WetterCheck implements Guard {
    @Override
    public boolean check(FlugStatus status) {
        // Prüft Wetterbedingungen
        return status.isWetterOK();
    }
}