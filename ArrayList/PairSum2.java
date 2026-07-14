import java.util.ArrayList;
import java.util.Scanner;

public class PairSum2 {

//in a Sorted & Roaed ArrayList(By Two pointer) - O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        } 

        int lp = bp+1; // smallest
        int rp = bp;  //largest

        while (lp != rp) {

            int sum = list.get(lp) + list.get(rp);

            //case 1
            if(sum == target) {
                System.out.println("Pair Found: " + list.get(lp) + "," + list.get(rp));
                return true;
            }

            //case 2
            if(sum < target){
                lp = (lp+1)%n;
            } else {
                //case 3
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the size of ArrayList : ");
        int n = sc.nextInt();

        System.out.println("Enter " + n +" elements :");

         for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        System.out.println(pairSum2(list, target));

        sc.close();
    }
}
