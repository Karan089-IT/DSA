public class evenOrOdd {

    public static void oddOrEven(int n){
        int bitMark = 1;
        if((n & bitMark) == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(6);
    }
}
