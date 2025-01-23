package iterator13.conflict;

import iterator13.shared.Flight;
import lombok.AllArgsConstructor;
import lombok.Getter;

// Conflict class to represent issues found during iteration
@Getter
@AllArgsConstructor
public class Conflict {
    private Flight flight1;
    private Flight flight2;
    private ConflictType type;
}
