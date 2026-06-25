import java.util.Scanner;

public class Basics {
    public static void HelloWorld(){
          System.out.println("Hello World!");
          return;
    }

    public static int calculateSum(int num1, int num2){   //parameters or formal parameters
        int sum = num1+num2;
        return sum;

    }

    public static void main(String[] args) {
        //HelloWorld();   //Function ko call karne ke liye main function me function ka name likhte hai

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);   // arguments or actual parameters
        System.out.println("Sum is: "+sum);
    }
    
}
