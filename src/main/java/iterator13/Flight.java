package iterator13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

// Flight class
@Getter
@Setter
@AllArgsConstructor
public class Flight {
    private String flightId;
    private String gate;
    private String destination;
}
