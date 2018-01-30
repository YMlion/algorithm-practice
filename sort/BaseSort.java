import java.util.Random;

abstract class BaseSort {

    boolean less(int a, int b) {
        return a < b;
    }

    abstract void sort(int[] array);

    void exch(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }

        return true;
    }

    void show(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    int[] getArray(int length) {
        Random r = new Random();
        int bound = length * 20;
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = r.nextInt(bound);
        }

        return a;
    }

}