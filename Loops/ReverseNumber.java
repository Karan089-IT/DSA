public class ReverseNumber {
    public static void main(String[] args) {
        //Reverse of a number
        int n = 160106;

        while (n > 0) {
           int lastDigit = n % 10;
           System.out.print(lastDigit);
           n = n/10;
        }
        System.out.println();

        



        //Reverse the given number 
        int num = 13246;
        int rev = 0;

        while (num > 0) {
            int LD = num % 10;
            rev = (rev * 10) + LD;
            num = num/10;
        }
        System.out.println(rev);
    }


    
}
