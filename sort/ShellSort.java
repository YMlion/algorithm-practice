/**
 * 希尔排序，作为插入排序的优化，按h划分序列依次比较，直到h为1比较完毕
 */
public class ShellSort extends BaseSort {
    
    void sort(int[] array) {
        int N = array.length;
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(array[j], array[j - h]); j -= h) {
                    exch(array, j, j - h);
                }
            }

            h /= 3;
        }
    }

    public static void main(String[] args) {
        ShellSort s = new ShellSort();
        int[] a = s.getArray(200);
        // s.show(a);
        s.sort(a);
        assert s.isSorted(a);
        s.show(a);
    }
}