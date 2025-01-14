package observer16.observer;

public interface Subject {
    void registrieren(Observer observer);
    void entfernen(Observer observer);
    void benachrichtigen();
}