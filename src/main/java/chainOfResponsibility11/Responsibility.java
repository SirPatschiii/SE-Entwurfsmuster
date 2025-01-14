package chainOfResponsibility11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

// Enum for defining responsibility types
public enum Responsibility {
    CHECK_WEATHER,
    CHECK_RESOURCES,
    MANAGER_APPROVAL
}
