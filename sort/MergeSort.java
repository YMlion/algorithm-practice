/**
 * 归并排序，合并有序子序列，递归合并左右两边的子序列
 */
public class MergeSort extends BaseSort {

    int[] ak;
    
    void sort(int[] array) {
        int low = 0, high = array.length - 1;
        ak = new int[array.length];
        // System.arraycopy(array, 0, ak, 0, ak.length);
        sort(array, low, high);
    }

    void sort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        if (a[mid] > a[mid + 1]) {
            merge(a, low, mid, high);
        }
    }

    void merge(int[] a, int low, int mid, int high) {
        System.arraycopy(a, low, ak, low, high - low + 1);
        int i = low, j = mid + 1;

        for (int k = low; k <= high; k++) {
            if (i > mid) a[k] = ak[j++];
            else if (j > high) a[k] = ak[i++];
            else if (less(ak[j], ak[i])) a[k] = ak[j++];
            else a[k] = ak[i++]; 
        }
    }

    public static void main(String[] args) {
        MergeSort s = new MergeSort();
        int[] a = s.getArray(20);
        s.show(a);
        s.sort(a);
        assert s.isSorted(a);
        s.show(a);
    }
}