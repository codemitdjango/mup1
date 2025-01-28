public class GeometricObjectException extends Exception {
    public GeometricObjectException() {
        super();
    }
    public GeometricObjectException(String message) {
        super("GeometricObject: " + message);
    }
}
