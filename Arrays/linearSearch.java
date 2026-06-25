import java.util.Scanner;

public class linearSearch {

     public static int linearS(int number[], int key){
        for(int i = 0; i <number.length; i++){
            if(number[i] == key){
                return i;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2, 3, 4, 5, 6, 7, 8, 9};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search : ");
        int key = sc.nextInt();

        int index = linearS(number, key);
        if(index == -1){
            System.out.println("Not found"); 
        } else{
            System.out.println("key is at index :"+index);
        }

        
    } 
       
}

