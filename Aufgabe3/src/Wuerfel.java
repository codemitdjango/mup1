/*
 * (C) 2022, 2023
 *     Dr. Dirk Zeckzer, Leipzig University, Institut für Informatik
 */
package serie3;

/**
 *
 * @author Dr. Dirk Zeckzer
 */
public class Wuerfel {

    private double side;

    public Wuerfel(
        double side
    ) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getVolumen() {
        return side * side * side;
    }

    public double getOberflaeche() {
        return 6.0 * side * side;
    }

    @Override
    public String toString() {
        return "W\u00fcrfel mit"
               + " A = " + this.getSide()
               + ", Volumen = " + this.getVolumen()
               + ", Oberfl\u00e4che = " + this.getOberflaeche();
    }
}
