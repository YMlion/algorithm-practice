/**
 * 快速排序
 */
public class QuickSort extends BaseSort {
    
    void sort(int[] array) {
        int[] b = new int[array.length];
        int[] c = new int[array.length];
        System.arraycopy(array, 0, b, 0, b.length);
        System.arraycopy(array, 0, c, 0, c.length);
        long s1 = System.currentTimeMillis();
        sort(array, 0, array.length - 1);
        System.out.println((System.currentTimeMillis() - s1) + "ms");
        s1 = System.currentTimeMillis();
        sort(b, 0, array.length - 1, 10);
        System.out.println((System.currentTimeMillis() - s1) + "ms");
        s1 = System.currentTimeMillis();
        sort3Way(c, 0, array.length - 1);
        System.out.println((System.currentTimeMillis() - s1) + "ms");
    }

    void sort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = partition(a, low, high);
        sort(a, low, mid - 1);
        sort(a, mid + 1, high);
    }

    int partition(int[] a, int l, int h) {
        int v = a[l];
        int i = l, j = h + 1;
        while (true) {
            while (less(a[++i], v)) if (i >= h) break;
            while (less(v, a[--j]));
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, l, j);
        return j;
    }

    /**
     * 改进，在小数组排序时使用插入排序，经过测试速度区别可忽略不计
     */
    void sort(int[] a, int low, int high, int M) {
        if (low + M >= high) {
            insertSort(a, low, high);
            return;
        }
        int mid = partition(a, low, high);
        sort(a, low, mid - 1);
        sort(a, mid + 1, high);
    }

    /**
     * 有大量重复元素时，用该排序更好一些
     */
    void sort3Way(int[] a, int low, int high) {
        if (high <= low) return;
        int lt = low, i = low + 1, gt = high;
        int v = a[low];
        while (i <= gt) {
            if (a[i] < v) {
                exch(a, lt++, i++);
            } else if (a[i] > v) {
                exch(a, i, gt--);
            } else {
                i++;
            }
        }
        sort3Way(a, low, lt - 1);
        sort3Way(a, gt + 1, high);
    }

    void insertSort(int[] array, int l, int h) {
        for (int i = l + 1; i <= h; i++) {
            for (int j = i; j > 0 && less(array[j], array[j - 1]); j--) {
                    exch(array, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        QuickSort s = new QuickSort();
        int[] a = s.getArray(10000000);
        // s.show(a);
        s.sort(a);
        // s.show(a);
    }
}