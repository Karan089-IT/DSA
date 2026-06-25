import java.util.Arrays;
import java.util.Collections;
public class insertionSort {

   /*  public static void insertion(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            //finding out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }

    }*/

    public static void printArr(Integer arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = { 5, 3, 2, 4, 1};     // Variable - int is premitive type , Integer is object type
        //insertion(arr);
        //Arrays.sort(arr);           //Inbuilt sort
        //Arrays.sort(arr, 0, 3);

        Arrays.sort(arr, 0, 4 , Collections.reverseOrder());    
        printArr(arr);
        
    }
    
}
