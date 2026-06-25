import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
//creation
        int marks[] = new int[10];
        int number[] = {1, 2, 3};
        String fruits[] = {"apple", "mango",  "banana"};
        //System.out.println(marks);
        System.out.println("length of array = "+marks.length);

//inputs
        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();

        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("maths : "+marks[2]);


        int percentage = (marks[0]+marks[1]+marks[2]) / 3;
        System.out.println("percentage = "+ percentage +"%");


//Update
    //    //marks[2] =100;
    //     marks[2] = marks[2] + 1;
    //     System.out.println("maths : "+marks[2]);
    }
    
}
