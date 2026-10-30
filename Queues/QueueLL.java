//Implement Queue using Linked list

public class QueueLL {
    static class Node {   //make class for declared node
        int data;
        Node next;

        Node(int data){  //constructor
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;
    //Empty
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
    //add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
    //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front = head.data;
            //single elem.
            if(tail == head){
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String args[]){
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
