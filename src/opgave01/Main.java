package opgave01;

import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(-3, 10);

        for (Integer next : range) {
            System.out.println(next);
        }
    }
}
