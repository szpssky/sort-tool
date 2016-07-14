package szp;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by szp on 16/7/10.
 */
public class TestSort {
    private  Integer array[] = new Integer[100];
    public  void CreateArray(){
        for(int i=0;i<array.length;i++){
            array[i] = new Random().nextInt(200);
        }

    }
    @Before
    public  void init(){
        CreateArray();
    }

    @Test
    public void testQuickSort() {
        Integer[] tmp = array.clone();
        QuickSort<Integer> quickSort = new QuickSort<Integer>(array);
        quickSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array, tmp);

    }
    @Test
    public void testMergeSort(){
        Integer[] tmp = array.clone();
        MergeSort<Integer> mergeSort = new MergeSort<Integer>(array);
        mergeSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array, tmp);

    }
    @Test
    public void testBubbleSort(){
        Integer[] tmp = array.clone();
        BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>(array);
        bubbleSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array, tmp);
    }
    @Test
    public void testSelectionSort(){
        Integer[] tmp = array.clone();
        SelectionSort<Integer> selectionSort = new SelectionSort<Integer>(array);
        selectionSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array, tmp);
    }
    @Test
    public void testInsertionSort(){
        Integer[] tmp = array.clone();
        InsertionSort<Integer> insertionSort = new InsertionSort<Integer>(array);
        insertionSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
    @Test
    public void testShellSort(){
        Integer[] tmp = array.clone();
        ShellSort<Integer> shellSort = new ShellSort<Integer>(array);
        shellSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
    @Test
    public void testHeapSort(){
        Integer[] tmp = array.clone();
        HeapSort<Integer> heapSort = new HeapSort<Integer>(array);
        heapSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
    @Test
    public void testCocktailSort(){
        Integer[] tmp = array.clone();
        CocktailSort<Integer> cocktailSort = new CocktailSort<Integer>(array);
        cocktailSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
    @Test
    public void testGnomeSort(){
        Integer[] tmp = array.clone();
        GnomeSort<Integer> gnomeSort = new GnomeSort<Integer>(array);
        gnomeSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
    @Test
    public void testCombSort(){
        Integer[] tmp = array.clone();
        CombSort<Integer> combSort = new CombSort<Integer>(array);
        combSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
}
