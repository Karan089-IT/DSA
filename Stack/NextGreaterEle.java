import java.util.Stack;

public class NextGreaterEle {
    
    public static void main(String[] args) {   //O(n)
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--){
            //1
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {  // s.peek() :- give index of element , arr[s.peek()] give element of this index  and stack me index ko store karna hai
                s.pop();
            }

            //2
            if(s.isEmpty()){
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            //3 push in s
            s.push(i);
        }


        for(int i =0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}
