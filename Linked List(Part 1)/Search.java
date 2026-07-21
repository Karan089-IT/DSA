public class Search {
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

//Iterative Search 
    public int itrSearch(int key){  //O(n)
        Node temp = head;
        int i =0;

        while(temp != null){
            if(temp.data == key){  // key found
                return i;

            }
            temp = temp.next;
            i++;
        }
        return -1; // key not found
    }


//Recursive search
    public int helper(Node head, int key){  // O(n)
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
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
        Search ll = new Search();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
    }
}
