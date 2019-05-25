package coding.solutions;

public interface Queue<T extends Object>  {

  Queue<T> enQueue(
          T t); // Removes the element at the beginning of the immutable queue, and returns the new
  // queue.

  Queue<T> deQueue() throws CloneNotSupportedException;

  T head();

  boolean isEmpty();
}
