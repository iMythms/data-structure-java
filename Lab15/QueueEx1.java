package Lab15;

import java.util.*;

public class QueueEx1 {
    int[] q = new int[4];
    int first = -1;
    int last = -1;

    // enqueue
    public void enqueue(int e) {
        last++; // last = 0
        q[last] = e;
    }

    // dequeue
    public int dequeue() {
        first++; // first = 0
        int e = q[first];
        q[first] = 0;
        return e;
    }

    // size
    public int size() {
        return last - first;
    }

    // first
    public int first() {
        return q[first + 1];
    }

    // isEmpty
    public boolean isEmpty() {
        return first == last;
    }

    // isFull
    public boolean isFull() {
        return last == q.length;
    }

    // toString
    public String toString() {
        return "Queue" + Arrays.toString(q);
    }
}
