/**
 * 插入排序：从第二个数开始依次和其前面的数倒序进行比较，若小于前面的数则交换位置，直到最前面比该数小的位置。
 * 插入排序比较和交换的次数和数组本身输入的顺序有关，本身是倒序则最慢，顺序则最快，普通乱序比较和移动次数都为N*N/4
 */
public class InsertionSort extends BaseSort {
    void sort(int[] array) {
        int N = array.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(array[j], array[j - 1]); j--) {
                exch(array, j, j - 1);
            }
        }
    }

    void sort(int[] array, boolean b) {
        int N = array.length;
        for (int i = 1; i < N; i++) {
            int tmp = array[i];
            int j = i - 1;
            for (; j >= 0 && less(tmp, array[j]); j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        InsertionSort s = new InsertionSort();
        int[] a = s.getArray(10);
        s.show(a);
        s.sort(a, false);
        assert s.isSorted(a);
        s.show(a);
    }
}