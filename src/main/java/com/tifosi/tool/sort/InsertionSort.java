package com.tifosi.tool.sort;

/**
 * Created by szp on 16/7/12.
 */
public class InsertionSort<T extends Comparable<T>> implements Sort {
    private T[] items;

    /**
     *
     * @param items The set of items to be sorted
     */
    public InsertionSort(T[] items) {
        this.items = items;
    }

    public void sort() {
        for (int i = 1; i < items.length; i++) {
            for (int j = i - 1; j >= 0 && items[j].compareTo(items[j + 1]) > 0; j--) {
                swap(items, j, j + 1);
            }

        }
    }
    /**
     *  Swap values in our items array
     *
     * @param arrs array
     * @param i Index of first item
     * @param j Index of second item
     */
    private void swap(T[] arrs, int i, int j) {
        T tmp = arrs[i];
        arrs[i] = arrs[j];
        arrs[j] = tmp;
    }

}
