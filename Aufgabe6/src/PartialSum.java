public class PartialSum extends Thread {
    private long[] eingabe;
    private long startIndex;
    private long endIndex;
    private long summe;
    private long anzahl;

    public PartialSum(long startIndex, long endIndex){
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public long getSumme(){
        return this.summe;
    }

    public long getAnzahl(){
        return this.anzahl;
    }
    @Override
    public void run() {
        long summe = 0;
        long anzahl = 0;
        for (long i = this.startIndex; i < this.endIndex; i++) {
            summe += i;
            anzahl += 1;
        }
        this.summe = summe;
        this.anzahl = anzahl;
    }
}
