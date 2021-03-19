import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        asList(arr);


    }
  public static <T> void asList(T[]arr){
        ArrayList<T> alt= new ArrayList<>(Arrays.asList(arr));
      System.out.println(alt);
  }

}
