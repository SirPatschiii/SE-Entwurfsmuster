package flyweight08;

import flyweight08.factory.FlugRouteFactory;
import flyweight08.model.FlugRoute;

public class Application {
    public static void main(String[] args) {
        // Erstellt oder holt Flugroute: Berlin -> Paris
        FlugRoute route1 = FlugRouteFactory.getFlugRoute("Berlin", "Paris");

        // Holt dieselbe Route: Berlin -> Paris (wird wiederverwendet)
        FlugRoute route2 = FlugRouteFactory.getFlugRoute("Berlin", "Paris");

        // Erstellt oder holt Flugroute: Berlin -> London
        FlugRoute route3 = FlugRouteFactory.getFlugRoute("Berlin", "London");

        // Ausgabe zur Überprüfung
        System.out.println(route1);
        System.out.println(route2);
        System.out.println(route3);

        // Überprüft, ob route1 und route2 dasselbe Objekt sind
        System.out.println("Route1 und Route2 identisch? " + (route1 == route2)); // true

        // Überprüft, ob route1 und route3 dasselbe Objekt sind
        System.out.println("Route1 und Route3 identisch? " + (route1 == route3)); // false
    }
}