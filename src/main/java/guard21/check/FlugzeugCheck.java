package guard21.check;

import guard21.model.FlugStatus;

public class FlugzeugCheck implements Guard {
    @Override
    public boolean check(FlugStatus status) {
        // Prüft, ob das Flugzeug bereit ist
        return status.isFlugzeugBereit();
    }
}