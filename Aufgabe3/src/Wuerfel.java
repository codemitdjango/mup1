/*
 * (C) 2022, 2023
 *     Dr. Dirk Zeckzer, Leipzig University, Institut für Informatik
 */

/**
 *
 * @author Dr. Dirk Zeckzer
 */
public class Wuerfel implements GeometricObject{

    private double side;

    public Wuerfel(double side) throws GeometricObjectException{
        if(side >= 0){
            this.side = side;
        } else {
            throw new GeometricObjectException("Würfel: Parameter Side < 0; Wert: " + side);
        }
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
        return "Würfel mit"
               + " A = " + this.getSide()
               + ", Volumen = " + this.getVolumen()
               + ", Oberfläche = " + this.getOberflaeche();
    }
}
