package coding.solutions.fixedSize;

import coding.solutions.Queue;

public class FixedSizeImmutableQueue<T> implements Queue<T> {

  private Object[] queueStorage;
  int rear;
  private final int HEAD = 0;
  int capacity ;

  public FixedSizeImmutableQueue(int capacity) {
    this.rear = -1;
    this.capacity = capacity;
    this.queueStorage = new Object[capacity];
  }

  public Queue<T> enQueue(T t) {
    if (isFull()) {
      System.out.println("Queue is full , No new Elements can be added");
    } else {
      rear++;
      queueStorage[rear] = t;
    }
    return this;
  }

  /**
   * *
   *
   * @return Queue<T> 1) if queue is empty , returns new queue with no operation , else 2)
   *     removes front element and returns new queue.
   */
  public Queue<T> deQueue() {
    FixedSizeImmutableQueue newQueue = new FixedSizeImmutableQueue<>(capacity);
    Object[] localQueueStorage = new Object[capacity];
    if(isEmpty()){
      System.out.println("Queue is empty , No  Elements can be removed");
    }else{
      rear--;
      for(int i=0;i<capacity-1;++i){
        localQueueStorage[i] = queueStorage[i+1];
      }
      localQueueStorage[capacity-1] = new Object();
    }
    newQueue.rear = rear;
    newQueue.queueStorage = localQueueStorage;
    return newQueue;
  }
  /**
   * *
   *
   * @return null when queue is empty else return front element
   */
  public T head() {
    if(isEmpty()){
     System.out.println("Empty queue ... returning null");
     return null;
    }
    return (T) queueStorage[HEAD];
  }

  public boolean isFull() {
    return rear == capacity - 1 ? true : false;
  }

  public boolean isEmpty() {
    return rear == -1 ? true : false;
  }
  public int getCurrentSize(){
    return rear+1;
  }
}
