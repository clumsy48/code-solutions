package coding.solutions.dynamic;

public class Driver {
    public static void main(String args[]){
        DynamicImmutableQueue queue = new DynamicImmutableQueue<Integer>();
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getQueueSize());

        queue.enQueue(15);
        System.out.println(queue.head() + " Current queue size : "+queue.getQueueSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getQueueSize());

        queue.enQueue(121);
        System.out.println(queue.head() + " Current queue size : "+queue.getQueueSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getQueueSize());

        queue.enQueue(1);
        System.out.println(queue.head() + " Current queue size : "+queue.getQueueSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getQueueSize());;

        queue.enQueue(55);
        System.out.println(queue.head() + " Current queue size : "+queue.getQueueSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getQueueSize());

        queue.enQueue(43);
        System.out.println(queue.head() + " Current queue size : "+queue.getQueueSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getQueueSize());
        System.out.println("--------------------------------------");
        queue = (DynamicImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getQueueSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getQueueSize());

        queue = (DynamicImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getQueueSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getQueueSize());

        queue = (DynamicImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getQueueSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getQueueSize());;

        queue = (DynamicImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getQueueSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getQueueSize());

        queue = (DynamicImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getQueueSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getQueueSize());

    }
}
