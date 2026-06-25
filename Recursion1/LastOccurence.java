public class LastOccurence {
    public static int lastOccur(int arr[], int key, int i) {

        // base case
        if(i == arr.length) {
            return -1;
        }

        // recursive call
        int isFound = lastOccur(arr, key, i + 1);

        // if found later, return that index
        if(isFound != -1) {
            return isFound;
        }

        // check current index
        if(arr[i] == key) {
            return i;
        }

        return isFound;
    }
   public static void main(String[] args) {
        int arr[]  = {1,2,4,5,6,7,5,3};
        System.out.println(lastOccur(arr, 5, 0));
   } 
}
