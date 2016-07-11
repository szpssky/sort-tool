package szp;

/**
 * Created by szp on 16/7/11.
 */
public class SelectionSort<T extends Comparable<T>> {
    private T[] items;
    public SelectionSort(T[] items){
        this.items = items;
    }
    public void sort(){
        for(int i=0;i<items.length;i++){
            for(int j=i+1;j<items.length;j++){
                if(items[i].compareTo(items[j])>0){
                    swap(items,i,j);
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
