public class Power {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xn = x * power(x, n-1);
        return xn;
    }
//TC :O(n)

//Optimized code:
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optimizedPower(a, n/2);
        int halfPowerSq = halfpower * halfpower;

        //n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
//TC : O(logn)
    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 10));
    }
}
