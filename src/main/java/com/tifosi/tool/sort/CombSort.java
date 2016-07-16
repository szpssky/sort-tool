package com.tifosi.tool.sort;

/**
 * Created by szp on 16/7/14.
 */
public class CombSort<T extends Comparable<T>> implements Sort{
    private T[] items;
    public CombSort(T[] items){
        this.items = items;
    }
    public void sort(){
        int gap = items.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1) {
                gap = (int) (gap * 0.8);
            }
            int i = 0;
            swapped = false;
            while (i + gap < items.length) {
                if (items[i].compareTo(items[i + gap]) > 0) {
                    swap(items,i,i+gap);
                    swapped = true;
                }
                i++;
            }
        }
    }
    private void swap(T[] arrs, int i, int j) {
        T tmp = arrs[i];
        arrs[i] = arrs[j];
        arrs[j] = tmp;
    }
}
