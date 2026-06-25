//import java.util.Scanner;

public class basics {

    public static void printLetters( String str){
        for(int i = 0; i <str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd', 'e'};
        // String str = "abcde";
        // String str2 = new String("xyz");

        // //Strings are IMMUTABLE

        // Scanner sc =new Scanner(System.in);
        // String name = sc.nextLine();
        //System.out.println(name);


        String fullName = "Karan kumar";
        System.out.println(fullName.length());  //in array .length is a property hota hai , string me function hota hai

        
        //concatenation
        String firstName = "Karan";
        String lastName = "Kumar";
        String fullname = firstName + " "+ lastName;
        System.out.println(fullname);

        System.out.println(fullname.charAt(1));

        printLetters(fullname);


    }
}
