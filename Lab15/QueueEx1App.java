package Lab15;

public class QueueEx1App {
    public static void main(String[] args) {
        QueueEx1 q = new QueueEx1();

        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q);
        System.out.println(q.dequeue());

        System.out.println(q);
        System.out.println(q.dequeue());

        q.dequeue();
        System.out.println(q.isEmpty());
    }
}
