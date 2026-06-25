
public class QuickSort {
    // Quick Sort
    public static void quickSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);

        quickSort(arr, si, pIdx - 1);   // Left part
        quickSort(arr, pIdx + 1, ei);   // Right part
    }
     

     // Partition function
    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei]; // last element as pivot
        int i = si - 1;

        for (int j = si; j < ei; j++) {

            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }
    
    public static void main(String[] args) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
