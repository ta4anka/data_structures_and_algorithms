package tk.ta4anka.linear_data_structures.queue;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {

    @Test
    void reverseQueue() {
        ReverseQueue reverseQueue = new ReverseQueue();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        reverseQueue.reverseQueue(queue);
        assertEquals("[3, 2, 1]", queue.toString());


    }
}