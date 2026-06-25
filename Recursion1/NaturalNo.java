public class NaturalNo {

    public static int naturalNo(int n){
        if(n == 1){
            return 1;
        }
        //int Snm1 = naturalNo(n - 1);  
        int sum = n + naturalNo(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(naturalNo(10));
    }
}
