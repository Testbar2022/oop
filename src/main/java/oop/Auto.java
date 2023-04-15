package oop;
import java.util.Scanner;

public class Auto {
    //Instanzen
    private String KFZKennzeichen;
    private double Kilometerstand;
    private double Tankvolumen;
    private double Kraftstoffverbrauch;
    private double Kraftstoffmenge;

    //Konstruktor
    public Auto(String KFZKennzeichen, double Kilometerstand, double Tankvolumen, double Kraftstoffverbrauch, double Kraftstoffmenge){
        this.KFZKennzeichen = KFZKennzeichen;
        this.Kilometerstand = Kilometerstand;
        this.Tankvolumen = Tankvolumen;
        this.Kraftstoffverbrauch = Kraftstoffverbrauch;
        this.Kraftstoffmenge = Kraftstoffmenge;
    }

    public String getKennzeichen() {
        return KFZKennzeichen;
    }

    public double getKilometerstand() {
        return Kilometerstand;
    }

    public double getTankvolumen() {
        return Tankvolumen;
    }


    public void tanken(double Menge) {                              //Tanken=Menge
        double neuerKraftstoff = Kraftstoffmenge + Menge;            // tanken mit neuem & bestandstoff
        if (neuerKraftstoff <= Tankvolumen) {                         // wenn beim tanken das Volumen des Tanks überschritten wird dann bleit maximaler Wert = Tankwollumen
            Kraftstoffmenge = Tankvolumen;
        }}


        public void fahren(double Strecke) {                                    // Fahren=Strecke
            double verbrauchterKraftstoff = Strecke / Kraftstoffverbrauch;       // Verbrauch berechnen
            if (verbrauchterKraftstoff > Kraftstoffmenge) {                         // Verbrauch größer als tatsächliche Menge
                System.out.println("Reserve, Tank bald leer");
            } else {
                Kilometerstand += Strecke;                                             // zum KMStand wird die Strecke gefahrene Strecke dazugefügt
                Kraftstoffmenge -= verbrauchterKraftstoff;                          // vom aklteullen Kraftstoff wird Verrauch abgezogen
            }
        }
}





