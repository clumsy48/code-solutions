package coding.solutions.dynamic;

import coding.solutions.Queue;

import java.util.LinkedList;

public class DynamicImmutableQueue<T> implements Queue<T> {

    private LinkedList queueStorage = new LinkedList<T>();

    public Queue<T> enQueue(T t) {
        queueStorage.add(t);
        return this;
    }

    /**
     * *
     *
     * @return Queue<T> 1) if queue is empty , returns new queue with no operation , else 2)
     * removes front element and returns new queue.
     */
    public Queue<T> deQueue() {
        DynamicImmutableQueue newQueue = new DynamicImmutableQueue<>();
        LinkedList tempQueueStorage = new LinkedList<T>();
        if (isEmpty()) {
            System.out.println("Queue is empty , No  Elements can be removed");
        } else {
            for (int i = 1; i < queueStorage.size(); ++i)
                tempQueueStorage.add(queueStorage.get(i));
        }
        newQueue.queueStorage = tempQueueStorage;
        return newQueue;
    }

    /**
     * *
     *
     * @return null when queue is empty else return front element
     */
    public T head() {
        if (isEmpty()) {
            System.out.println("Empty queue ... returning null");
            return null;
        }
        return (T) queueStorage.get(0);
    }


    public boolean isEmpty() {
        return queueStorage.isEmpty();
    }

    public int getQueueSize() {
        return queueStorage.size();
    }

}
