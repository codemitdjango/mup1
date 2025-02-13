import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Statistik {
    StringBuilder textSpeicher;
    HashMap<String, Integer> wortHaeufigkeit;

    public Statistik(String text) {
        this.textSpeicher = new StringBuilder(text);
        this.wortHaeufigkeit = new HashMap();
    }

    public void berechneStatistik() {
        StringBuilder wort = new StringBuilder();
        for (int i = 0; i < textSpeicher.length(); i++) {
            char x = textSpeicher.charAt(i);
            if (x != ' ') {
                wort.append(x);
            } else {
                if (wort.isEmpty()) {
                    continue;
                }
                if (this.wortHaeufigkeit.get(wort.toString()) == null) {
                    this.wortHaeufigkeit.put(wort.toString(), 1);
                } else {
                    this.wortHaeufigkeit.put(wort.toString(), this.wortHaeufigkeit.get(wort.toString()) + 1);
                }
                wort = new StringBuilder();
            }
        }
    }

    public HashMap<String, Integer> getWortHaeufigkeit() {
        return this.wortHaeufigkeit;
    }
}
