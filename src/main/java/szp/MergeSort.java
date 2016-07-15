package szp;

/**
 * Created by szp on 16/7/11.
 */
public class MergeSort<T extends Comparable<T>> {
    private T[] items;

    public MergeSort(T[] items) {
        this.items = items;
    }

    public void sort() {
        mergeSort(items, 0, items.length - 1);
    }

    private void mergeSort(T[] items, int lo, int hi) {
        if (lo >= hi)
            return;
        int mid = (lo + hi) / 2;
        mergeSort(items, lo, mid);
        mergeSort(items, mid + 1, hi);
        merge(items, lo, mid, hi);


    }

    private void merge(T[] items, int lo, int mid, int hi) {
        T[] tmpArray = (T[]) new Comparable[hi+1];
        int m = mid + 1;
        int index = lo;
        int n = lo;

        while (lo <= mid && m <= hi) {
            if(items[lo].compareTo(items[m])<=0) {
                tmpArray[index++] = items[lo++];
            }else{
                tmpArray[index++] = items[m++];
            }
        }
        while(m<=hi){
            tmpArray[index++] = items[m++];
        }
        while(lo<=mid){
            tmpArray[index++] = items[lo++];
        }
        for (int i = n; i <= hi; i++) {
            items[i] = tmpArray[i];
        }
    }
}
