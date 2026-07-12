import java.util.ArrayList;
import java.util.Scanner;

public class ContMostWater {
/*  public static int storeWater(ArrayList<Integer> height){
         int maxWater = 0;

//brute force  - O(n^2)
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
        */


//Optimized code using two pointers  -O(n)
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int left = 0;
        int right = height.size() - 1;

        while (left < right) {

            int ht = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int currWater = ht * width;

            maxWater = Math.max(maxWater, currWater);

            // Move the pointer having smaller height
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
    /*  ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));    */


        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> height = new ArrayList<>();

        System.out.print("Enter number of heights: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("At least two heights are required.");
            sc.close();
            return;
        }

        System.out.println("Enter " + n + " heights:");

        for (int i = 0; i < n; i++) {
            height.add(sc.nextInt());
        }

        System.out.println("Heights = " + height);
        System.out.println("Maximum water = " + storeWater(height));

        sc.close();
    

    }
}
