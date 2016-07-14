package szp;

/**
 * Created by szp on 16/7/14.
 */
public class GnomeSort<T extends Comparable<T>> {
    private T[] items;
    public GnomeSort(T[] items){
        this.items = items;
    }
    public void sort(){
        int i=0;
        while(i<items.length){
            if(i==0||items[i-1].compareTo(items[i])<=0)
                i++;
            else{
                swap(items,i-1,i);
                i--;
            }
        }
    }
    private void swap(T[] arrs, int i, int j) {
        T tmp = arrs[i];
        arrs[i] = arrs[j];
        arrs[j] = tmp;
    }
}
