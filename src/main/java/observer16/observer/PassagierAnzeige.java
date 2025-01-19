package observer16.observer;

import observer16.model.Flug;

public class PassagierAnzeige implements Observer {
    @Override
    public void aktualisieren(Flug flug) {
        System.out.println("Passagieranzeige aktualisiert: Flug " + flug.getFlugNummer() +
                " am Gate " + flug.getGate() + " ist jetzt " + flug.getStatus());
    }
}