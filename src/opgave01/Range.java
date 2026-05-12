package opgave01;

import java.util.Iterator;

public class Range implements Iterable<Integer> {
    private final int start;
    private final int end;

    public Range(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("end must be greater than start");
        }
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
