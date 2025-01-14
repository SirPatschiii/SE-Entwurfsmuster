package filter10.filter;

import filter10.model.Flug;
import java.util.List;

@FunctionalInterface
public interface FlugFilter {
    List<Flug> filter(List<Flug> fluege);
}