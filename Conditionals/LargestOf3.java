public class LargestOf3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 6;
        if(a >= b && a >= c){
            System.out.println("Largest is: a");
        }
        else if(b >= c){
            System.out.println("Largest is: b");
        }
        else{
            System.out.println("Largest is: c");
        }
    }
    
}
