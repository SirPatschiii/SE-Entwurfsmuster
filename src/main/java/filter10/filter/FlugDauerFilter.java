package filter10.filter;

import filter10.model.Flug;
import java.util.List;
import java.util.stream.Collectors;

public class FlugDauerFilter implements FlugFilter {
    private final double maxDauer;

    public FlugDauerFilter(double maxDauer) {
        this.maxDauer = maxDauer;
    }

    @Override
    public List<Flug> filter(List<Flug> fluege) {
        return fluege.stream()
                .filter(flug -> flug.getFlugDauer() <= maxDauer)
                .collect(Collectors.toList());
    }
}