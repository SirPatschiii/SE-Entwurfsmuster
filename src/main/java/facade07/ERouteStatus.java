package facade07;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ERouteStatus {
    ON_TIME("On Time"),
    DELAYED("Delayed"),
    CANCELLED("Cancelled");

    private final String description;
}
