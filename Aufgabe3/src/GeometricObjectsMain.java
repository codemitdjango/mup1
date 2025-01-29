public class GeometricObjectsMain {
    public static void main(String[] args) throws GeometricObjectException {
        GeometrischeObjekte objekte = new GeometrischeObjekte();

        Quader quader1 = new Quader(3, 4, 5);
        Quader quader2 = new Quader(200, 200, 200);

        objekte.add(quader1);
        objekte.add(quader2);

        try {
            Wuerfel wuerfel1 = new Wuerfel(4);
            objekte.add(wuerfel1);
        } catch (GeometricObjectException e) {
            System.out.println(e.getMessage());
        }

        try {
            Wuerfel wuerfel2 = new Wuerfel(200);
            objekte.add(wuerfel2);
        } catch (GeometricObjectException e) {
            System.out.println(e.getMessage());
        }
        try {
            Wuerfel wuerfel3 = new Wuerfel(-207.15);
            objekte.add(wuerfel3);
        } catch (GeometricObjectException e) {
            System.out.println(e.getMessage());
        }
        
        objekte.ausgeben();
    }
}
