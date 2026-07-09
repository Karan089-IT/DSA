import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();  // <> -> angular bracket
        // list.add(1); //O(1)
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // //reverse print
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();



        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // Number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input elements
        System.out.println("Enter " + n + " elements:");

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Print original ArrayList
        System.out.println("ArrayList: " + list);

        // Reverse print
        System.out.print("Reverse Order: ");

        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        sc.close();

    }
}

//TC : O(n)