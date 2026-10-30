import java.util.*;
import java.util.LinkedList;

public class QueueJCF {
    public static void main(String args[]){
        //Queue q = new Queue();
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

//Queue JCF me class nahi hota hai ,ek interface hota
//interfaces ki ham object kabhi nahi bana sakte ishiliye Queue ko implement karne wali classes ki onject banate hai
//Queue ko JAVA ke under do classes implememt karti hai LinkedList or ArrayDeque 