/*
 * (C) 2022, 2023
 *     Dr. Dirk Zeckzer, Leipzig University, Institut für Informatik
 */

/**
 *
 * @author Dr. Dirk Zeckzer
 */
public class Quader implements GeometricObject {

    private double length;
    private double width;
    private double height;

    public Quader(final double length, final double width, final double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolumen() {
        return (length * width * height);
    }

    public double getOberflaeche() {
        return (2.0
                * (length * width
                   + length * height
                   + width * height));
    }

    @Override
    public String toString() {
        return "Quader mit"
               + " Länge = " + this.getLength()
               + ", Breite = " + this.getWidth()
               + ", Höhe = " + this.getHeight()
               + ", Volumen = " + this.getVolumen()
               + ", Oberfläche = " + this.getOberflaeche();
    }
}
