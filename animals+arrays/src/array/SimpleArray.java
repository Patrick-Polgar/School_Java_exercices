package array;

import java.util.Arrays
import java.util.Random

public class SimpleArray {

    private final int[] array;

    public SimpleArray() {
        array = filledArray();
    }

    private int[] filledArray() {
        return new Random().ints(20).toArray();
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }

        return min;
    }

    public long sum() {
        long sum = 0;
        for (int j : array) {
            sum += j;
        }

        return sum;
    }

    public void bubbleSort() {
        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    public boolean contains20() {
        for (int j : array) {
            if (j == 20) {
                return true;
            }
        }
        return false;
    }

    public int[] array() {
        return Arrays.copyOf(array, array.length);
    }
}
