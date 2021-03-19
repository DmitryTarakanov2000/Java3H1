import java.util.Arrays;

public class Tast1 {
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        swap(arr, 3, 5);


    }

    public static void swap(Object[] arr, int a, int b) {
        System.out.println(Arrays.toString(arr));
        Object swap = arr[a];
        arr[a] = arr[b];
        arr[b] = swap;
        System.out.println(Arrays.toString(arr)) ;
    }
}
