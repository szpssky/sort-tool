package com.tifosi.tool.sort;

public class QuickSort<T extends Comparable<T>> implements Sort
{

    private  T[] items;

    /**
     * @param items The set of items to be sorted
     */
    public QuickSort(T[] items)
    {
        this.items = items;

    }

    public void sort()
    {
        this.sort(0, this.items.length - 1);
    }

    private void sort(int lo, int hi)
    {
        if (hi <= lo)
        {
            return;
        }

        int j = this.partition(lo, hi);
        this.sort(lo, j - 1);
        this.sort(j + 1, hi);
    }

    /**
     * Partition the array
     *
     * @param lo The index of the low value to partition from
     * @param hi The index of the high value to partition from
     */
    private int partition(int lo, int hi)
    {
        int i = lo;
        int j = hi + 1;

        while (true)
        {
            /* Scan i from left to right so long as (items[i] < items[lo]) */
            while (this.items[++i].compareTo(this.items[lo]) < 0)
            {
                if (i == hi)
                {
                    break;
                }
            }

            /* Scan j from right to left so long as (items[j] > items[lo]) */
            while (this.items[--j].compareTo(this.items[lo]) > 0)
            {
                if (j == lo)
                {
                    break;
                }
            }

            /* Exit if pointers cross */
            if (i >= j)
            {
                break;
            }

            /* Exchange items[i] and items[j] */
            this.swap(i, j);
        }

        /* Swap with partitioning item to put it in the right place */
        this.swap(lo, j);       // j would now be pointing to last element(element at greatest index) less than k

        /* Return the index of the partitioning element */
        return j;
    }

    /**
     * Swap values in our items array at the given indicies
     *
     * @param i Index of first item
     * @param j Index of second item
     */
    private void swap(int i, int j)
    {
        T temp = this.items[i];
        this.items[i] = this.items[j];
        this.items[j] = temp;
    }

}