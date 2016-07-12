package szp;

/**
 * Created by szp on 16/7/12.
 */
public class InsertionSort<T extends Comparable<T>> {
    private T[] items;

    public InsertionSort(T[] items) {
        this.items = items;
    }

    public void sort() {
        for (int i = 1; i < items.length; i++) {
            for (int j = i - 1; j >= 0 && items[j].compareTo(items[j + 1]) > 0; j--){
                swap(items, j, j + 1);
            }

        }
    }

    public void swap(T[] a, int i, int j) {
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}
