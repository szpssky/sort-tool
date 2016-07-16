package com.tifosi.tool.sort;

/**
 * Created by szp on 16/7/11.
 */
public class BubbleSort<T extends Comparable<T>> implements Sort{
    private T[] items;

    public BubbleSort(T[] items) {
        this.items = items;
    }

    public void sort() {
        for (int i = items.length - 1; i > 0; i--) {
            for(int j =0;j<i;j++){
                if(items[j].compareTo(items[j+1])>0){
                    swap(items,j,j+1);
                }
            }
        }

    }

    private void swap(T[] arrs, int i, int j) {
        T tmp = arrs[i];
        arrs[i] = arrs[j];
        arrs[j] = tmp;
    }
}
