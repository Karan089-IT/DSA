public class fibonacci {

    // public static int fib(int n){
    //     if(n == 0 || n == 1){
    //         return n;
    //     }
    //     int fnm1 = fib(n-1);
    //     int fnm2 = fib(n-2);
    //     int fibn = fnm1 + fnm2;
    //     return fibn;
    // }
//TC : O(2^n) -> very slow

    public static int fibFast(int n) {
    if(n <= 1) return n;

    int a = 0, b = 1;

    for(int i = 2; i <= n; i++) {
        int c = a + b;
        a = b;
        b = c;
    }
    return b;
}

//TC :O(n) -> No recursion stack
//Understanding : Each step shifts values forward: (a, b) → (b, a+b)
    public static void main(String[] args) {
    //    System.out.println(fib(6));
    System.out.println(fibFast(6));
        
    }
}
