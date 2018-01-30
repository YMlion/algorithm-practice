/**
 * 堆排序，先建堆，再排序
 * 建堆使用下沉方法，当前节点与子节点中比较大的一个交换直到堆底
 * 建堆之后，依次删除最大节点即将第一个与最后一个交换，然后再用下沉方法将交换后的第一个数下沉到合适的位置
 */
public class HeapSort extends BaseSort {
    
    void sort(int[] a) {
        int N = a.length - 1;
        for (int k = N / 2; k >= 1; k--) {
            sink(a, k, N);
        }
        while (N > 1) {
            exch(a, 1, N--);
            sink(a, 1, N);
        }
    }

    void sink(int[] a, int k, int N) {
        int j = 2 * k;
        while (j <= N) {
            if (j < N && less(a[j], a[j + 1])) j++;
            if (!less(a[k], a[j])) break;
            exch(a, k, j);
            k = j;
            j = 2 * k;
        }
    }

    public static void main(String[] args) {
        HeapSort s = new HeapSort();
        int[] a = s.getArray(100);
        int[] b = new int[101];
        System.arraycopy(a, 0, b, 1, 100);
        // s.show(b);
        s.sort(b);
        assert s.isSorted(b);
        s.show(b);
    }
}