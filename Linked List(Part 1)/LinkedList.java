public class LinkedList {

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
    public static int size;


//Methods
    //add() - O(n)
    //remove()
    //print()
    //search()

    public void addFirst(int data){
        //step 1: create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        
        //step 2: assign the value of head in next of newNode(newNode next = head)
        newNode.next = head; //link

        //step 3: head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next =newNode;
        tail = newNode;
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

    public void addMid(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }


    //Remove()
    public int removeFirst(){
        int val = head.data;
        head = head.next;
        return val;
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.addFirst(2);
        ll.addFirst(1);
       
        ll.addLast(3);
        ll.addLast(4);

        ll.addMid(2, 9);
        ll.print();  //1->2->9->3->4->null
        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();


    }
    
}
