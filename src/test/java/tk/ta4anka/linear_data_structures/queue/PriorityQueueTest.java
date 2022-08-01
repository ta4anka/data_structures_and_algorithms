package tk.ta4anka.linear_data_structures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PriorityQueueTest {
    PriorityQueue queue = new PriorityQueue(5);

    @Test
    void add() {
        queue.add(9);
        queue.add(4);
        queue.add(2);
        assertEquals("[2, 4, 9, 0, 0]", queue.toString());

    }

    @Test
    void testToString() {
        queue.add(9);
        queue.add(4);
        queue.add(2);
        queue.add(2);
        queue.add(34);
        //check resize():
        queue.add(3);
        queue.add(36);
        assertEquals("[2, 2, 3, 4, 9, 34, 36, 0, 0, 0]", queue.toString());
    }

    @Test
    void remove() {
        queue.add(9);
        queue.add(10);
        queue.add(122);
        queue.add(2);
        assertEquals(122, queue.remove());
    }

    @Test
    void isEmpty() {
        assertTrue(queue.isEmpty());
    }
}