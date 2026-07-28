public class DetectingLoop {
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
//Floy's Algorithm
    //Slow-Fast Approach
    public  static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true; // cycle exists
            }
        }
        return false; //cycle doesn't exists
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
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(isCycle());
        
       
    }
}
