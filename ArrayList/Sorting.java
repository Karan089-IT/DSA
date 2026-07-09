import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(9);

        System.out.println("Before Sorting:");
        System.out.println(list);

        // used to sort an ArrayList in ascending order
        Collections.sort(list);  

        System.out.println("After Sorting:");
        System.out.println(list);

        // used to sort an ArrayList in  descending order
        Collections.sort(list, Collections.reverseOrder());   
        System.out.println(list);
    }
}
