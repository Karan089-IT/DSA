import java.util.ArrayList;
import java.util.Scanner;

public class PairSum {
    // public static boolean pairSum1(ArrayList<Integer> list, int target){

    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 System.out.println("Pair Found: "+list.get(i)+","+list.get(j));
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }


    public static boolean pairSum1(ArrayList<Integer> list, int target) {

        int lp = 0;
        int rp = list.size() - 1;

        while(lp < rp) {

            int sum = list.get(lp) + list.get(rp);
        //case-1
            if(sum == target) {
                System.out.println("Pair Found: " + list.get(lp) + "," + list.get(rp));
                return true;
            }
        //case-2
            if(sum < target) {
                lp++;
            } else {
                rp--;
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

        System.out.println(pairSum1(list, target));

        sc.close();


    }
}
