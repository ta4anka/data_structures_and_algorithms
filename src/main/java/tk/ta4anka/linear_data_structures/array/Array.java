package tk.ta4anka.linear_data_structures.array;

public class Array {
    private Object[] items;
    private int count;

    public Array(int length) {
        items = new Object[length];
    }

    //O(1) or O(n)
    public void insert(Object item) {
        if (items.length == count) {
            Object[] newItems = new Object[count * 2];
            //O(n)
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        //O(1)
        items[count++] = item;
    }

    //O(n)
    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    //O(1) or O(n)
    public int indexOf(Object item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        if (count == 0) {
            return "[]";
        }
        StringBuilder result = new StringBuilder();
        result.append('[').append(items[0]);
        for (int i = 1; i < count; i++) {
            result.append(", ").append(items[i]);
        }
        return result.append(']').toString();
    }
}
