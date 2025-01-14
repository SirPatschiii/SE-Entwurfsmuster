package observer16.observer;

import observer16.model.Flug;

public class BodenpersonalBenachrichtigung implements Observer {
    @Override
    public void aktualisieren(Flug flug) {
        System.out.println("Bodenpersonal informiert: Flug " + flug.getFlugNummer() +
                " am Gate " + flug.getGate() + " ist jetzt " + flug.getStatus());
    }
}