public class Kugeln {
    public static void main(String[] args){
        Kugel kugel1 = new Kugel(5);
        Kugel kugel2 = new Kugel(7);
        Kugel kugel3 = new Kugel(-21);

        System.out.println("Kugel mit Radius = " + kugel1.getRadius() + ", Durchmesser = " + kugel1.getDurchmesser() + ", Oberfläche = " + kugel1.getOberflaeche() + ", Volumen = " + kugel1.getVolumen());
        System.out.println("Kugel mit Radius = " + kugel2.getRadius() + ", Durchmesser = " + kugel2.getDurchmesser() + ", Oberfläche = " + kugel2.getOberflaeche() + ", Volumen = " + kugel2.getVolumen());
        System.out.println("Kugel mit Radius = " + kugel3.getRadius() + ", Durchmesser = " + kugel3.getDurchmesser() + ", Oberfläche = " + kugel3.getOberflaeche() + ", Volumen = " + kugel3.getVolumen());
    }
}
