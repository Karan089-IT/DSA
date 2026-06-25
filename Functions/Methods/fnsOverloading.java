public class fnsOverloading {
    //Overloading using no. of parameters
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }


    // Overloading using Data Types of parameters
    public static int sub(int a, int b){
        return a-b;
    }

    public static float sub(float a, float b){
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(2, 3, 4));

        System.out.println(sub(4, 3));
        System.out.println(sub(5.5f, 3.5f));
    }
    
}
