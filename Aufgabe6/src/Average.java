import java.util.ArrayList;
import java.util.List;

public class Average {
    private ArrayList<Long> grosseListe;
    private int anzahlThreads;

    public Average(ArrayList<Long> liste, int anzahl) {
        this.grosseListe = liste;
        this.anzahlThreads = anzahl;
    }

    public double getAverage() {
        double durschschnittGesamt = 0;
        int threadlength = Math.floorDiv(this.grosseListe.size(), this.anzahlThreads);
        int threadUeberschuss = this.grosseListe.size() - threadlength * this.anzahlThreads;

        List<PartialSum> threads = new ArrayList<>();

        for (int i = 0; i < anzahlThreads; i++) {
            int corrector = 0;
            if (i == this.anzahlThreads - 1) {
                corrector = threadUeberschuss;
            }

            PartialSum ps = new PartialSum(this.grosseListe.get(i * threadlength), this.grosseListe.get((i + 1) * threadlength + corrector - 1));
            threads.add(ps);
            ps.start();
        }

        for (PartialSum ps : threads) {
            try {
                ps.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            long summe = ps.getSumme();
            long anzahl = ps.getAnzahl();
            double durchschnitt = (double) summe / anzahl;
            durschschnittGesamt += durchschnitt * anzahl / threadlength;
        }
        return durschschnittGesamt;
    }
}
