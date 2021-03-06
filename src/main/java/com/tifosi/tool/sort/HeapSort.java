package com.tifosi.tool.sort;

/**
 * Created by szp on 16/7/13.
 */
public class HeapSort<T extends Comparable<T>> implements Sort {
    private T[] items;

    /**
     *
     * @param items The set of items to be sorted
     */
    public HeapSort(T[] items) {
        this.items = items;
    }

    public void sort() {
        buildMaxHeapify(items);
        heapSort(items);
    }

    private void buildMaxHeapify(T[] data) {
        //没有子节点的才需要创建最大堆，从最后一个的父节点开始
        int startIndex = getParentIndex(data.length - 1);
        //从尾端开始创建最大堆，每次都是正确的堆
        for (int i = startIndex; i >= 0; i--) {
            maxHeapify(data, data.length, i);
        }
    }

    /**
     * Create maxHeap
     *
     * @param data
     * @param heapSize the size of data
     * @param index the current need to create the maximum heap location
     */
    private void maxHeapify(T[] data, int heapSize, int index) {
        // 当前点与左右子节点比较
        int left = getChildLeftIndex(index);
        int right = getChildRightIndex(index);

        int largest = index;
        if (left < heapSize && data[index].compareTo(data[left]) < 0) {
            largest = left;
        }
        if (right < heapSize && data[largest].compareTo(data[right]) < 0) {
            largest = right;
        }
        //得到最大值后可能需要交换，如果交换了，其子节点可能就不是最大堆了，需要重新调整
        if (largest != index) {
            T temp = data[index];
            data[index] = data[largest];
            data[largest] = temp;
            maxHeapify(data, heapSize, largest);
        }
    }

    /**
     *
     *
     * @param data The set of items to be sorted
     */
    private void heapSort(T[] data) {
        //末尾与头交换，交换后调整最大堆
        for (int i = data.length - 1; i > 0; i--) {
            T temp = data[0];
            data[0] = data[i];
            data[i] = temp;
            maxHeapify(data, i, 0);
        }
    }

    /**
     *
     * @param current current node position
     * @return Parent node position
     */
    private int getParentIndex(int current) {
        return (current - 1) >> 1;
    }

    /**
     * 左子节点position注意括号，加法优先级更高
     *
     * @param current current node position
     * @return leftChild node positon
     */
    private int getChildLeftIndex(int current) {
        return (current << 1) + 1;
    }

    /**
     * 右子节点position
     *
     * @param current current node position
     * @return rightChild node postion
     */
    private int getChildRightIndex(int current) {
        return (current << 1) + 2;
    }

    public void print(T[] data) {
        int pre = -2;
        for (int i = 0; i < data.length; i++) {
            if (pre < (int) getLog(i + 1)) {
                pre = (int) getLog(i + 1);
                System.out.println();
            }
            System.out.print(data[i] + " |");
        }
    }

    /**
     * a base-2 logarithm
     *
     * @param param
     * @return
     */
    private double getLog(double param) {
        return Math.log(param) / Math.log(2);
    }
}
