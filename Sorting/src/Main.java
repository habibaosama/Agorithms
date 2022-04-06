import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        QuickSort sort=new QuickSort();
          int[ ] arr={ 7, 3, 1, 5, 2};
          sort.sort(arr);
          System.out.println(Arrays.toString(arr));
    }
}
