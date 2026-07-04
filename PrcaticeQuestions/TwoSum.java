public class TwoSum {
    public static int[] twoSum(int arr[],int tar){
        int n = arr.length;

        for(int i =0; i <= n; i++){
            int first = arr[i];
            for(int j = i+1; j <= n; j++){
                int sec = arr[j];

                int sum = first+sec;
                if(sum == tar){
                    return new int[]{i,j}; //pair found
                }
            }
        }
        return new int[]{-1, -1};  // No pair found
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;

        int ans[] = twoSum(arr, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}
