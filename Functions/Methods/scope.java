public class scope {

/*    public static void printS(){
        int s = 34;   //variable inside method
        System.out.println(s);
    }
    

    public static void main(String[] args) {
       // System.out.println(x);  //Error
        int x = 5;   // local variable
        System.out.println(x);

       // System.out.println(s); //Error
    }
     */


    public static void main(String[] args) {

        if (true) {
            int a = 10;   // block variable
            System.out.println(a);
        }

        // System.out.println(a);  // Error: a is not accessible here
    }
}
    

