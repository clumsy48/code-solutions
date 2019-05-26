package coding.solutions.fixedSize;

public class Driver {
    public static void main(String args[]){
        FixedSizeImmutableQueue<Integer> queue = new FixedSizeImmutableQueue<Integer>(4);
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
        queue = (FixedSizeImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

        queue = (FixedSizeImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

        queue = (FixedSizeImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());;

        queue = (FixedSizeImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

        queue = (FixedSizeImmutableQueue<Integer>)queue.deQueue();
        System.out.println(queue.head() + " Current queue size : "+queue.getCurrentSize());
        System.out.println(queue.isEmpty() + " Current queue size : "+queue.getCurrentSize());

    }
}
