import java.util.LinkedList;;

public class JCFinLL {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

    //add
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        //1->2->3
        System.out.println(ll);

    //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
