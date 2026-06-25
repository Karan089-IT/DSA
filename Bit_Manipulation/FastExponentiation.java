public class FastExponentiation {
    public static int fastExpo(int a, int n) {

        int ans = 1;

        while(n > 0) {

            if((n & 1) != 0) {   // if n is odd
                ans = ans * a;
            }

            a = a * a;   // square
            n = n >> 1;  // divide by 2
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(4, 5));
    }
}
