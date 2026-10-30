//Implement Queues using Arrays

public class queueArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear ;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }



        // isEmpty
        public  static boolean isEmpty() {
            return rear == -1;
        }


        // Enqueue/add
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // Dequeue/remove
        public static int remove() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];

            for (int i = 0; i < rear; i++) {  // Shift all elements to left
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;
        }

        // Peek
        public static int peek() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }   
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
}