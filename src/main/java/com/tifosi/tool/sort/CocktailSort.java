package com.tifosi.tool.sort;

/**
 * Created by szp on 16/7/13.
 */
public class CocktailSort<T extends Comparable<T>> implements Sort {

    private T[] items;

    /**
     *
     * @param items The set of items to be sorted
     */
    public CocktailSort(T[] items) {
        this.items = items;
    }

    public void sort() {
        int lo = 0;
        int hi = items.length - 1;
        while (lo < hi) {
            for (int i = lo; i < hi; i++) {
                if (items[i].compareTo(items[i + 1]) > 0) {
                    swap(items, i, i + 1);
                }
            }
            hi--;
            for (int j = hi; j > lo; j--) {
                if (items[j].compareTo(items[j - 1]) < 0)
                    swap(items, j, j - 1);
            }
            lo++;
        }

    }

    private void swap(T[] arrs, int i, int j) {
        T tmp = arrs[i];
        arrs[i] = arrs[j];
        arrs[j] = tmp;
    }
}
