//Implement Circular Queue using Arrays :

public class circularQueue {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;        }



        // isEmpty
        public  static boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        // Enqueue/add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            //add 1st element
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1)% size;
            arr[rear] = data;
        }

        // Dequeue/remove
        public static int remove() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];
            //last element delete
            if(rear == front){
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek
        public static int peek() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }   
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.remove());
        q.add(40);
        System.out.println(q.remove());
        q.add(50);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

//for updation :
//rear = (rear + 1) % size
//front = (front + 1) % size