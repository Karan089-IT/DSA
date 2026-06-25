public class subArray {
    
/*     public static void SubArray(int arr[]) {
        int ts = 0;

        for(int i = 0; i < arr.length; i++) {          // starting index
            for(int j = i; j < arr.length; j++) {      // ending index

                for(int k = i; k <= j; k++) {          // print subarray
                    System.out.print(arr[k] + " ");
                }
                ts++;

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = "+ts);     // ts = sum of n numbers = n(n+1)/2
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10};

        SubArray(arr);
    } */

    


/*//Brute Force :   TC = O(n^3)
    public static void subarraySum(int arr[]) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {          // start index
            for (int j = i; j < arr.length; j++) {      // end index

                sum = 0;
                for (int k = i; k <= j; k++) {          // print subarray
                    System.out.print(arr[k] + " ");

                    sum = sum + arr[k];                 // subarray sum
                }

                System.out.print(" = " + sum);
                System.out.println();

                if (sum > maxSum) {
                    maxSum = sum;
                }

                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }

        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Minimum Sum = " + minSum);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3};

        subarraySum(arr);
    } */





// Max subarray sum - Prefix sum  - TC : O(n^2)
public static void subarraySum_min_max(int arr[]) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;



        int prefix[] = new int[arr.length];
        prefix[0] =arr[0];
        for(int i = 1; i<prefix.length; i++){        //calculation prefix array
            prefix[i] = prefix[i-1] + arr[i];
        }



        for (int i = 0; i < arr.length; i++) {          // start index
            for (int j = i; j < arr.length; j++) {      // end index

                
                // if(i == 0) {
                //     sum = prefix[j];
                // } else {
                //     sum = prefix[j] - prefix[i-1];
                // }
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                System.out.println("subarray sum : "+sum);

                if (sum > maxSum) {
                    maxSum = sum;
                }

                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }

        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Minimum Sum = " + minSum);
    }




// Max subarray sum - Kadane's   Algorithm - TC : O(n) 
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        int maxElement = numbers[0]; // track largest element

        for(int i = 0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);

            // track maximum element
            if(numbers[i] > maxElement) {
                maxElement = numbers[i];
            }
        }
        //if all number are negative
        if(ms == 0){
            ms = maxElement;
        }
        System.out.println("Our max subarray sum is : "+ms);
    }

    public static void main(String[] args) {

        // int arr[] = {1, 2, 3};
        // subarraySum_min_max(arr);

        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }

}


