package guard21.check;

import guard21.model.FlugStatus;

public class CrewCheck implements Guard {
    @Override
    public boolean check(FlugStatus status) {
        // Prüft, ob die Crew bereit ist
        return status.isCrewBereit();
    }
}