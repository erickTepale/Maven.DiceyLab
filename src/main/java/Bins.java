import java.util.ArrayList;

public class Bins {
    private Integer[] bins;

    Bins(Integer min, Integer max){
        bins = new Integer[max - min + 1];

        for (int i = 0; i < bins.length ; i++) {
            bins[i] = 0;
        }
    }

    public Integer getBin(Integer binRequested){
        return bins[binRequested - 2];
    }

    public void incrementBin(Integer binRequested){
        bins[binRequested - 2]++;
    }

    public Integer[] getBins() {
        return bins;
    }
}
