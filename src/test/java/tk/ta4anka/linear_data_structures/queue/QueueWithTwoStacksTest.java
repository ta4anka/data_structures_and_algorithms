package tk.ta4anka.linear_data_structures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithTwoStacksTest {
    QueueWithTwoStacks<Integer> queue = new QueueWithTwoStacks<>();

    @Test
    void enqueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals("[1, 2, 3]", queue.toString());
    }

    @Test
    void dequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.dequeue());
    }

    @Test
    void peek() {
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.peek());
    }

    @Test
    void isEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void testToString() {
        assertEquals("[]", queue.toString());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5); // stack1 -> [1, 2, 3, 4, 5]; stack2 -> []
        assertEquals("[1, 2, 3, 4, 5]", queue.toString());

        queue.dequeue();// stack1 -> []; stack2 -> [5, 4, 3, 2]
        assertEquals("[2, 3, 4, 5]", queue.toString());

        queue.enqueue(6);
        queue.enqueue(7); //stack1 -> [6, 7]; stack2 -> [5, 4, 3, 2]
        assertEquals("[2, 3, 4, 5, 6, 7]", queue.toString());


    }
}