package template19.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AircraftType {
    SMALL("Small Jet"),
    MEDIUM("Medium Jet"),
    LARGE("Large Jet");

    private final String description;
}
