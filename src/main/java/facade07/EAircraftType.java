package facade07;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EAircraftType {
    BOEING_737("Boeing 737", 150),
    AIRBUS_A320("Airbus A320", 180),
    BOEING_777("Boeing 777", 300);

    private final String name;
    private final int capacity;
}
