package animals;

import java.util.ArrayList;
import java.util.List;

abstract class Dog implements Animal {

    public List<Integer> countTo50() {
        final int limit = 50;
        final int step = 2;

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < limit + 1; i++) {
            if (i % step == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
