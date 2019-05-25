package coding.solutions;

public class Driver {
    public static void main(String args[]){
        ImmutableQueue<Integer> queue = new ImmutableQueue<Integer>(4);
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

        queue.enQueue(15);
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

        queue.enQueue(121);
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

        queue.enQueue(1);
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());;

        queue.enQueue(55);
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

        queue.enQueue(43);
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());
        System.out.println("--------------------------------------");
        queue = (ImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

        queue = (ImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

        queue = (ImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());;

        queue = (ImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

        queue = (ImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

    }
}
