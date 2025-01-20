package bridge04.aircraft;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EAircraftType {
    BOEING_747("Large, long-range"),
    AIRBUS_A320("Medium, short to medium-range"),
    CESSNA_172("Small, short-range"),
    ANTONOV_AN124("Large, cargo-specific");

    private final String description;
}
