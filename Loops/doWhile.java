import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println("Hello!");
            i++;
        } while(i <= 10);


        //Break statement
        for(i = 1; i <=5; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");


      /*   //Keep enterning number till user enters a mutiple of 10
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);   */



        //Countinue statement
        for(i =1; i <= 5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }



        //Display all number entered by user except multiple of 10
           Scanner sc = new Scanner(System.in);

           do{
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;
            }
            System.out.println("Number was :"+n);
           } while(true);
    }
    
}
