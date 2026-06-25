public class bubbleSort {

    public static void bubble(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        int arr[] = {3, 5, 2, 1, 4};
        bubble(arr);

        System.out.print("Sorted array : ");
        printArr(arr);
    }
    
}
