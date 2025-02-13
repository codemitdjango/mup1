import java.io.File;

public class TextStatistik {
    public static void main(String[] args) {
        //funktioniert, schreibt aber die alten dateien über!! kp die endungen zu ändern :)
        String path = "C:\\Users\\maris\\Documents\\GitHub\\MuP1\\Aufgabe4\\Werke-Shakespeare";
        File textFilesFolder = new File(path);

        for (File datei : textFilesFolder.listFiles()) {
            Text text = new Text();
            text.leseAusDatei(datei);

            Statistik statistik = new Statistik(text.toString());
            statistik.berechneStatistik();

            Ausgabe ausgabe = new Ausgabe(statistik.getWortHaeufigkeit());
            ausgabe.schreibeStatistik(datei.getPath());
        }
    }
}
