package filter10.filter;

import filter10.model.Flug;
import java.util.List;
import java.util.stream.Collectors;

public class ZielortFilter implements FlugFilter {
    private final String zielort;

    public ZielortFilter(String zielort) {
        this.zielort = zielort;
    }

    @Override
    public List<Flug> filter(List<Flug> fluege) {
        return fluege.stream()
                .filter(flug -> flug.getZielFlughafen().equalsIgnoreCase(zielort))
                .collect(Collectors.toList());
    }
}