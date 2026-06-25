public class typeCasting {
    public static void main(String[] args) {
       /*  float a = 25.0f;
        int b = (int) a;
        System.out.println(b);

        char ch = 'a';
        int number = ch;
        System.out.println(number);   */

        /* char a = 'a';
        char b = 'b';
        System.out.println(a);
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(b-a);  */

       /*  int a = 10;
        float b = 29.34f;
        long c = 32;
        double d = 30;
        double ans = a+b+c+d;
        System.out.println(ans);   */

        byte b = 5;
        //byte a = (b * 2);   //wrong
        b = (byte) (b * 2);
        System.out.println(b);

    }
    
}
