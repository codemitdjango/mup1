import java.io.*;

public class Text {
    StringBuilder inhalt;

    public Text() {
        this.inhalt = new StringBuilder();
    }

    public void leseAusDatei(File dateiname) {
        try (BufferedReader br = new BufferedReader(new FileReader(dateiname))) {
            String line;
            while ((line = br.readLine()) != null) {
                this.inhalt.append(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Die Datei '" + dateiname + "' konnte nicht gefunden werden.");
        } catch (IOException e) {
            System.err.println("Beim Lesen der Datei '" + dateiname + "' ist ein Fehler aufgetreten.");
        }
        while (this.inhalt.indexOf("\n") != -1) { //warum hier kein this.
            int index = this.inhalt.indexOf("\n");
            this.inhalt.replace(index, index + 1, " ");
        }
    }

    public String toString() {
        return inhalt.toString();
    }
}
