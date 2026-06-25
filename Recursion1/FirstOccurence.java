public class FirstOccurence {
    public static int isFirstOccur(int arr[], int key){
        for(int i=0;i < arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;  // if not found
    }

    
//Recursive 
    public static int firstOccur(int arr[], int key, int i) {

        // base case
        if(i == arr.length) {
            return -1;
        }

        // work
        if(arr[i] == key) {
            return i;
        }

        // recursive call
        return firstOccur(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[]  = {1,2,4,5,6,7,5,3};
        System.out.println(isFirstOccur(arr, 5));
        System.out.println(firstOccur(arr, 5, 0));
    }
}
