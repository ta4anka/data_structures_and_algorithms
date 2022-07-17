package tk.ta4anka.linear_data_structures.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList list = new LinkedList();

    @Test
    void addLast() {
        list.addLast(25);
        assertEquals(1, list.size());
    }

    @Test
    void addFirst() {
        list.addFirst(15);
        assertEquals(1, list.size());
    }

    @Test
    void indexOf() {
        list.addLast(15);
        assertEquals(0, list.indexOf(15));
        assertEquals(-1, list.indexOf(355));
    }

    @Test
    void contains() {
        list.addLast(15);
        assertTrue(list.contains(15));
        assertFalse(list.contains(17));
    }

    @Test
    void removeFirst() {
        list.addLast(15);
        list.removeFirst();
        assertEquals(0, list.size());
    }

    @Test
    void removeLast() {
        list.addLast(15);
        list.removeLast();
        assertEquals(0, list.size());
    }

    @Test
    void size() {
        list.addLast(15);
        assertEquals(1, list.size());
    }

    @Test
    void toArray() {
        list.addLast(15);
        list.addLast(25);
        assertArrayEquals(list.toArray(), new Object[]{15, 25});
    }

    @Test
    void testToString() {
        list.addLast(15);
        list.addLast(25);
        assertEquals("[15, 25]", list.toString());
    }
}