import java.util.Scanner;

public class While {
    public static void main(String[] args) {
      /*   int counter = 0;

        while (counter < 11) {
            System.out.println("Hello world");
            counter ++;
            
        }
        System.out.println("complete");  */


    /*    //Print number from 1 to 10
        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter);
            counter ++;
        }   */



           /*  //Print number from 1 to n
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter range: ");
            int range = sc.nextInt();
            int counter = 1;

            while (counter <= range) {
                System.out.print(counter + " ");
                counter ++;
            }  */



            // Print sum of first n natural number
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;

            int i = 1;
            while (i <= n) {
                sum += i;
                i ++;
                
            }
            System.out.println("Sum is :" +sum);

    }
    
}
