// //Find & Remove Nth node from End
// //Nth node from end = (size-n+1) from start
public class FindRemoveNthNode {
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


    public void deleteNthfromEnd(int n){
        //calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if(n == size){
            head =head.next;  //remove first
            return;
        }

        //size-n
        int i = 1;
        int iToFind = size-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
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
        FindRemoveNthNode ll = new FindRemoveNthNode();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
       
    }
}


// class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }

// class FindRemoveNthNode {
//     public ListNode removeNthFromEnd(ListNode head, int n) {

//         ListNode dummy = new ListNode(0);
//         dummy.next = head;

//         ListNode slow = dummy;
//         ListNode fast = dummy;

//         // Move fast n steps ahead
//         for (int i = 0; i < n; i++) {
//             fast = fast.next;
//         }

//         // Move both pointers
//         while (fast.next != null) {
//             slow = slow.next;
//             fast = fast.next;
//         }

//         // Delete nth node from end
//         slow.next = slow.next.next;

//         return dummy.next;
//     }
// }