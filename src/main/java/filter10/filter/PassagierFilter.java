package filter10.filter;

import filter10.model.Flug;
import java.util.List;
import java.util.stream.Collectors;

public class PassagierFilter implements FlugFilter {
    private final int minPassagiere;

    public PassagierFilter(int minPassagiere) {
        this.minPassagiere = minPassagiere;
    }

    @Override
    public List<Flug> filter(List<Flug> fluege) {
        return fluege.stream()
                .filter(flug -> flug.getPassagierAnzahl() >= minPassagiere)
                .collect(Collectors.toList());
    }
}