package tk.ta4anka.linear_data_structures.stack;

import java.util.Arrays;

/**
 * Custom stack implementation using Array
 */
public class MyStack {
    private Object[] items;
    private int count;

    MyStack(int size) {
        this.items = new Object[size];
    }

    public void push(Object item) {
        if (count == items.length) {
            throw new StackOverflowError();
        }
        items[count++] = item;
    }

    public Object pop() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public Object peek() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        Object[] content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
