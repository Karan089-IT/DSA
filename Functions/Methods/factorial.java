public class factorial {
    public static int fact(int n){
        int f = 1;

        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;  // factorial of n
    }
    public static void main(String[] args) {
        // int f = fact(4);
        // System.out.println(f);
        System.out.println(fact(4));
    }
}


// DRY RUN
// i =1    f=1*1=1
// i =2    f=1*2=2
// i =3    f=2*3=6
// i =4    f=6*4=24   //f=previousValueOf F * i