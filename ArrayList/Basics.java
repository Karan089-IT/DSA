import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        //ArrayList part of something  called : Java Collection Framework
        //ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();  // <> -> angular bracket
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Character> ch = new ArrayList<>();
    //add operation
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1, 9);  // O(n)

        System.out.println(list);
    
    // //get operation - O(1)
    //     int element = list.get(2);
    //     System.out.println(element);

    // //remove/Delete operation - O(n)
    //     list.remove(2);
    //     System.out.println(list);

    // //set element at index -O(n)
    //     list.set(2, 10);
    //     System.out.println(list);

    // //contains element - O(n)
    //     System.out.println(list.contains(1));
    //     System.out.println(list.contains(6));

    //Size of AL
        System.out.println(list.size());


    // print the ArrayList
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
}
