package tk.ta4anka.linear_data_structures.queue;

import java.util.Arrays;

/**
 * Circular Queue implementation using Array
 */

public class ArrayQueue {
    private Object[] items;
    private int count;
    //poiners:
    private int rear;
    private int front;


    public ArrayQueue(int capacity) {
        this.items = new Object[capacity];
    }

    public void enqueue(Object item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public Object dequeue() {
        Object item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}


