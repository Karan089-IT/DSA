//stack using java collections framework
import java.util.*;

public class StackJCF {
    
    public static void main(String[] args) {
        //Stack s = new Stack();
        Stack<Integer> s = new Stack<>();
        s.push(1);  //already exist same operation in JCF 
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
           System.out.println(s.peek());
           s.pop(); 
        }
    }
}
