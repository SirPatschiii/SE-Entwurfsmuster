package flyweight08.factory;

import flyweight08.model.FlugRoute;
import java.util.HashMap;
import java.util.Map;

// Factory für Flugrouten (Flyweight)
public class FlugRouteFactory {

    // Pool für gespeicherte Flugrouten
    private static final Map<String, FlugRoute> ROUTEN_POOL = new HashMap<>();

    // Gibt bestehende oder neue Flugroute zurück
    public static FlugRoute getFlugRoute(String startFlughafen, String zielFlughafen) {
        // Erzeugt eindeutigen Schlüssel für die Route
        String key = startFlughafen + "-" + zielFlughafen;

        // Prüft, ob Route existiert
        if (!ROUTEN_POOL.containsKey(key)) {
            // Neue Route erstellen und speichern
            ROUTEN_POOL.put(key, new FlugRoute(startFlughafen, zielFlughafen));
            System.out.println("Neue Flugroute erstellt: " + key);
        } else {
            // Vorhandene Route verwenden
            System.out.println("Vorhandene Flugroute verwendet: " + key);
        }

        // Gibt die Route zurück
        return ROUTEN_POOL.get(key);
    }
}