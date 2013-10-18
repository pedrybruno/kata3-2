package kata3;

import java.util.List;

public class HistogramBuilder<T> {

    private Histogram<T> histogram;

    public HistogramBuilder() {
        this.histogram = new Histogram<T>();
    }
    
    public void calculate(List<T> data) {
        for (T item : data) {
            histogram.put(item, getCount(item) +1);
        }
    }

    public Histogram<T> getHistogram(){
        return histogram;
    }
    
    private int getCount(T item) {
        if(histogram.containsKey(item))
            return histogram.get(item);
        return 0;
    }
}
