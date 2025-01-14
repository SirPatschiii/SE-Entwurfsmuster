package guard21.check;

import guard21.model.FlugStatus;

public interface Guard {
    boolean check(FlugStatus status);
}