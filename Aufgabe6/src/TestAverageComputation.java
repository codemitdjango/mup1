import java.util.ArrayList;

public class TestAverageComputation {
    public static void main(String[] args){
        ArrayList<Long> smallArrayList = new ArrayList<>(15);
        for (long i = 0; i < 15; i++) {
            smallArrayList.add(i+1);
        }
        Average smallAverage = new Average(smallArrayList, 4);
        System.out.println(smallAverage.getAverage());

        ArrayList<Long> bigArrayList = new ArrayList<>(15);
        for (long i = 0; i < 16000075; i++) {
            smallArrayList.add(i+1);
        }
        Average bigAverage = new Average(bigArrayList, 4);
        System.out.println(smallAverage.getAverage());
    }
}
