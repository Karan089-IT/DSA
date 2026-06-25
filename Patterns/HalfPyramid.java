public class HalfPyramid {
/*     public static void main(String[] args) {
        int n = 4;
        
        for(int i=1; i <= n; i++){
            for(int number = 1; number <= i; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
    */

    public static void inverted_half_pyramid_withNumber(int n){
        for(int i= 1; i <= n; i++){
            //inner -numbers
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid_withNumber(5);
    }
}
