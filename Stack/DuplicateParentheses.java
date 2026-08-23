import java.util.Stack;

public class DuplicateParentheses {
    public  static boolean isDuplicate(String str) {  //O(n)
        Stack<Character> s = new Stack<>();

        for(char ch : str.toCharArray()){
        
           //closing
           if(ch == ')'){
            int count = 0;
            // while(s.peek() != '('){
            //     s.pop();
            //     count++;
            // }
            // if(count < 1){
            //     return true; // duplicate
            // } else {
            //     s.pop(); // opening pair
            // }

            while(s.pop() != '('){
                count++;
            }
            if(count < 1){
                return true; // duplicate
            } 
           } else {
            //opening
            s.push(ch);
           }
        }
        return false;
    }

    public static void main(String[] args) {
        //valid String
        String str = "((a+b))"; //true
        String str1 = "(a-b)"; //false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}
