package tk.ta4anka.linear_data_structures.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    MyStack stack = new MyStack(10);

    @Test
    void push() {
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    void pushIfStackIsFull() {
        MyStack stack = new MyStack(1);
        stack.push(1);
        assertThrows(StackOverflowError.class, () -> stack.push(2));
    }

    @Test
    void pop() {
        stack.push(1);
        stack.push(2);
        var result = stack.pop();
        assertEquals(2, result);
    }

    @Test
    void peek() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void testToString() {
        stack.push(1);
        stack.push(2);
        assertEquals("[1, 2]", stack.toString());
    }
}