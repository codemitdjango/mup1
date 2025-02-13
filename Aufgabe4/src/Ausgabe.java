import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class Ausgabe {
    HashMap<String, Integer> wortHaeufigkeit;

    public Ausgabe(HashMap<String, Integer> map) {
        this.wortHaeufigkeit = map;
    }

    public void schreibeStatistik(String dateiname) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dateiname));
            for (Map.Entry<String, Integer> entry : this.wortHaeufigkeit.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println("Datei nicht gefunden.");
        } catch (IOException e) {
            System.err.println("Datei kann nicht gelesen werden.");
        }
    }
}
