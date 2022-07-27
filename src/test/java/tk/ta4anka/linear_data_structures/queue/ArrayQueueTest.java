package tk.ta4anka.linear_data_structures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {
    ArrayQueue arrayQueue = new ArrayQueue(3);

    @Test
    void enqueue() {
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        assertEquals("[1, 2, null]", arrayQueue.toString());
    }

    @Test
    void dequeue() {
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        assertEquals(1, arrayQueue.dequeue());
        assertEquals("[null, 2, 3]", arrayQueue.toString());
    }

    @Test
    void testToString() {
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.dequeue();
        assertEquals("[null, 20, 30]", arrayQueue.toString());
    }

    @Test
    void isFull() {
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.dequeue();
        arrayQueue.enqueue(4);
        assertTrue(arrayQueue.isFull());

    }
}