import java.util.Scanner;

public class binarySearch {

    public static int binary(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] < key){  //right side
                start = mid+1;
            }
            else{   // left side
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search : ");
        int key = sc.nextInt();

        System.out.println("index for key is : "+binary(numbers, key));
    }
    
}
