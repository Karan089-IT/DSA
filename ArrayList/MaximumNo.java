import java.util.ArrayList;
import java.util.Scanner;

public class MaximumNo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int max = Integer.MIN_VALUE;
        for(int i =0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("ArrayList = "+list);
        System.out.println("Max element = "+max);

        sc.close();
    }
}


// TC :O(n)