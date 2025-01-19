package observer16.observer;

import observer16.model.Flug;

import java.util.ArrayList;
import java.util.List;

public class FlugPlan implements Subject {
    private final List<Observer> observerListe = new ArrayList<>();
    private Flug flug;

    @Override
    public void registrieren(Observer observer) {
        observerListe.add(observer);
    }

    @Override
    public void entfernen(Observer observer) {
        observerListe.remove(observer);
    }

    @Override
    public void benachrichtigen() {
        for (Observer observer : observerListe) {
            observer.aktualisieren(flug);
        }
    }

    public void setFlug(Flug flug) {
        this.flug = flug;
        benachrichtigen();
    }
}