/**
 * 选择排序：从第一个数开始，依次和该数位置之后的数比较大小，找到最小的一个数并交换位置
 * 共进行了N(N-1)/2次比较和N次交换，无论数组是怎样输入的，排序时间不变。
 */
public class SelectionSort extends BaseSort {
    void sort(int[] array) {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(array[j], array[min])) {
                    min = j;
                }
            }
            exch(array, i, min);
        }
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] a = s.getArray(10);
        s.show(a);
        s.sort(a);
        assert s.isSorted(a);
        s.show(a);
    }
}