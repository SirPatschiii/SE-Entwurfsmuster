package guard21.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class FlugStatus {
    private final boolean flugzeugBereit; // Flugzeug bereit?
    private final boolean crewBereit;     // Crew bereit?
    private final boolean wetterOK;       // Wetterbedingungen okay?
}