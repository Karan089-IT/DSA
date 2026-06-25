public class selectionSort {

    public static void selection(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int minPos = i;
            for(int j = i+1; j < n; j++){
               if(arr[minPos] > arr[j]){   // for inc. order     // for dec. order = arr[minPos] < arr[j]
                minPos = j;
               } 
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 5, 1, 2};
        selection(arr);
        printArr(arr);
    }
}
