public class PythagoraeischeZahlentripel {

    private static int[] createIntArray(int min, int max) {
        int[] array = new int[(max - min) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + min;
        }
        return array;
    }

    private static void arrayInhaltAusgeben(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i == array.length - 1){
                System.out.print("\n");
            } else {
                System.out.print(", ");
            }

        }
    }

    private static int[] quadriere(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * array[i];
        }
        return newArray;
    }

    private static boolean testeAufQuadratzahl(int zahl) {
        double test = Math.sqrt(zahl);
        if (zahl == Math.round(test)) {
            return true;
        } else {
            return false;
        }
    }

    static public int pythagoraeischeZahlentripel(int min, int max) {
        int[] quadriertesArray = quadriere(createIntArray(min, max));
        arrayInhaltAusgeben(quadriertesArray);
        int anzahl = 0;
        for (int i = 0; i < quadriertesArray.length; i++) {
            for (int j = i + 1; j < quadriertesArray.length; j++) {
                int differenz = quadriertesArray[j] - quadriertesArray[i];
                if (testeAufQuadratzahl(differenz) && differenz > quadriertesArray[i]) {
                    System.out.println((int) Math.sqrt(quadriertesArray[i]) + "^2 + " + (int) Math.sqrt(differenz) + "^2 = " + (int) Math.sqrt(quadriertesArray[i]) + "^2");
                    anzahl++;
                }
            }
        }
        System.out.println("In der Zahlenliste von " + min + " bis " + max + " wurden " + anzahl + " Tripel gefunden.");
        return anzahl;
    }
}
