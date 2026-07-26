public class Palindrome {
    public static class Node {
        int data;
        Node next;         //  reference variable(pointer)
    
        public Node(int data){  // constructor
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;


    public void addFirst(int data){
        //step 1: create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head; //link
        head = newNode;
    }

    //Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my midNode
    }


        public boolean checkPalindrome(){
            if(head == null || head.next == null){
                return true;
            }
            //step1 - find mid
            Node mideNode =findMid(head);

            //step2 - reverse 2nd half
            Node prev = null;
            Node curr = mideNode;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev; // right halft head
            Node left = head;

            //step3 - check left & right half equal
            while (right != null) {
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
    

    public void print() {      // O(n)
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Palindrome ll = new Palindrome();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        // Node midNode = ll.findMid(ll.head);
        // System.out.println("Middle Node = " + midNode.data);

        System.out.println(ll.checkPalindrome());
        
       
    }
}
