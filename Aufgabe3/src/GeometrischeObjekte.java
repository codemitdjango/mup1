import java.util.ArrayList;
import java.util.List;

public class GeometrischeObjekte {
    private List<GeometricObject> liste;

    public GeometrischeObjekte() {
        this.liste = new ArrayList<GeometricObject>();
    }

    public void add(GeometricObject object) {
        this.liste.add(object);
    }

    public int getAnzahl() {
        return this.liste.size();
    }

    private double berechneGesamtesVolumen() {
        double gesamtesVolumen = 0;
        for (GeometricObject object : this.liste) {
            gesamtesVolumen = gesamtesVolumen + object.getVolumen();
        }
        return gesamtesVolumen;
    }

    private double berechneGesamteOberflaeche() {
        double gesamteOberflaeche = 0;
        for (GeometricObject object : liste) { // warum hier nicht this.?
            gesamteOberflaeche += object.getOberflaeche();
        }
        return gesamteOberflaeche;
    }

    public void ausgeben() {
        for (GeometricObject object : liste) {
            System.out.println("Gesamtes Volumen = " + berechneGesamtesVolumen() + ", Gesamte Oberfläche = " + berechneGesamteOberflaeche());
        }
    }
}
