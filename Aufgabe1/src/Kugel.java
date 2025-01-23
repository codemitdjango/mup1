public class Kugel {
    private int radius;
    private double pi = 3.14;

    public Kugel(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public int getDurchmesser() {
        return this.radius * 2;
    }

    public double getVolumen() {
        return 4 / 3 * this.pi * this.radius * this.radius * this.radius;
    }

    public double getOberflaeche() {
        return 4 * this.pi * this.radius * this.radius;
    }
}
