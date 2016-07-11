package szp;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by szp on 16/7/10.
 */
public class TestSort {
    private  Integer array[] = new Integer[5];
    public  void CreateArray(){
        for(int i=0;i<=4;i++){
            array[i] = new Random().nextInt(100);
        }

    }
    @Before
    public  void init(){
        CreateArray();
    }

    @Test
    public void testQuickSort() {
        System.out.println("Array:" + Arrays.toString(array));
        QuickSort<Integer> quickSort = new QuickSort<Integer>(array);
        quickSort.sort();
        System.out.println("QuickSort:" + Arrays.toString(array));

    }
    @Test
    public void testMergeSort(){
        System.out.println("Array:" + Arrays.toString(array));
        MergeSort<Integer> mergeSort = new MergeSort<Integer>(array);
        System.out.println("Array:"+Arrays.toString(array));
        mergeSort.sort();
        System.out.println("MergerSort:"+Arrays.toString(array));

    }
    @Test
    public void testBubbleSort(){
        System.out.println("Array:" + Arrays.toString(array));
        BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>(array);
        bubbleSort.sort();
        System.out.println("BubbleSort:" + Arrays.toString(array));
    }
    @Test
    public void testSelectionSort(){
        System.out.println("Array:" + Arrays.toString(array));
        SelectionSort<Integer> selectionSort = new SelectionSort<Integer>(array);
        selectionSort.sort();
        System.out.println(Arrays.toString(array));
    }
}
