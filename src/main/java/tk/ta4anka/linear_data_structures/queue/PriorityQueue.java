package tk.ta4anka.linear_data_structures.queue;


import java.util.Arrays;

/**
 * Priority Queue implementation using Array
 */
public class PriorityQueue {
    private int[] items;
    private int count;

    public PriorityQueue(int capacity) {
        this.items = new int[capacity];
    }

    public void add(int item) {
        if (isFull()) {
            resize();
        }
        int i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    private void resize() {
        int[] newItems = new int[count * 2];
        System.arraycopy(items, 0, newItems, 0, count);
        items = newItems;
    }

    private int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else break;
        }
        return i + 1;
    }

    private boolean isFull() {
        return items.length == count;
    }


    //remove the largest item
    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
