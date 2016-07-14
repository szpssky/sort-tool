package szp;

/**
 * Created by szp on 16/7/13.
 */
public class ShellSort<T extends Comparable<T>> {
    private T[] items;

    public ShellSort(T[] items) {
        this.items = items;
    }

    public void sort() {
        for (int gap = items.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < items.length; i++) {
                if (items[i].compareTo(items[i - gap]) < 0) {
                    T tmp = items[i];
                    int j = i - gap;
                    while (j >= 0 && items[j].compareTo(tmp) > 0) {
                        items[j + gap] = items[j];
                        j -= gap;
                    }
                    items[j + gap] = tmp;
                }
            }
        }
    }

    private void swap(T[] a, int i, int j) {
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
