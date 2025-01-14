package observer16;

import observer16.model.Flug;
import observer16.observer.BodenpersonalBenachrichtigung;
import observer16.observer.FlugPlan;
import observer16.observer.PassagierAnzeige;

public class Application {
    public static void main(String[] args) {
        FlugPlan flugPlan = new FlugPlan();

        PassagierAnzeige passagierAnzeige = new PassagierAnzeige();
        BodenpersonalBenachrichtigung bodenpersonal = new BodenpersonalBenachrichtigung();

        flugPlan.registrieren(passagierAnzeige);
        flugPlan.registrieren(bodenpersonal);

        Flug flug = new Flug("LH123", "A12", "Boarding");
        flugPlan.setFlug(flug);

        flug.setStatus("Verspätet");
        flugPlan.setFlug(flug);

        flugPlan.entfernen(passagierAnzeige);

        flug.setStatus("Abflug");
        flugPlan.setFlug(flug);
    }
}