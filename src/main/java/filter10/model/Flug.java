package filter10.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Flug {
    private String startFlughafen;
    private String zielFlughafen;
    private int passagierAnzahl;
    private double flugDauer;  // in Stunden
// Lombok is used for the constructor, getters, and toString()

}