public class BinarySearch {

    public static int search(int[] a, int key) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            if (a[mid] > key) hi = mid - 1;
            else if (a[mid] < key) lo = mid + 1;
            else return mid;
        }

        return -(lo + 1);
    }

    public static int search(int[] a, int key, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = (lo + hi) >>> 1;
        if (a[mid] > key) return search(a, key, lo, mid - 1);
        else if (a[mid] < key) return search(a, key, mid + 1, hi);
        else return mid;
    }


    public static void main(String[] args) {
        int[] a = {2, 10, 11, 33, 44, 48, 222, 333, 444, 445};
        int r = search(a, 445);
        assert r == 9;
        System.out.println("the index is " + r);
        r = search(a, 445, 0, 9);
        assert r == 9;
        System.out.println("the index is " + r);
    }
}