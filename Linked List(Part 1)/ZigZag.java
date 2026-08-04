public class ZigZag {
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
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; // +2
        }
        Node mid = slow; // slow is my midNode

        //step2 - reverse 2nd half
            Node prev = null;
            Node curr = mid.next;
            mid.next = null;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev; // right halft head
            Node left = head;
            Node nextL, nextR;

            //alt merge - zigzag merge
            while (left != null && right != null) {
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                //update
                left = nextL;
                right = nextR;
            }
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
        ZigZag ll = new ZigZag();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.zigZag();
        ll.print();
    }
}
