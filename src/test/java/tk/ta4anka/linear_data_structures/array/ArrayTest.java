package tk.ta4anka.linear_data_structures.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ArrayTest {
    Array array = new Array(3);

    @BeforeEach
    void setUp() {
        array.insert(15);
        array.insert(25);
        array.insert(35);
    }

    private Object[] getItems() throws NoSuchFieldException, IllegalAccessException {
        Field field = array.getClass().getDeclaredField("items");
        field.setAccessible(true);
        return (Object[]) field.get(array);
    }

    private int getCount() throws NoSuchFieldException, IllegalAccessException {
        Field field = array.getClass().getDeclaredField("count");
        field.setAccessible(true);
        return (int) field.get(array);

    }

    @Test
    void insert() throws NoSuchFieldException, IllegalAccessException {
        array.insert(120);
        assertEquals(4, getCount());
        assertEquals(6,getItems().length);
        assertEquals(120, getItems()[3]);
    }

    @Test
    void removeAt() throws NoSuchFieldException, IllegalAccessException {
        array.removeAt(1);
        assertFalse(Arrays.asList(getItems()).contains(25));
        assertEquals(2, getCount());
    }

    @Test
    void indexOf() {
        assertEquals(2, array.indexOf(35));
        assertEquals(-1, array.indexOf(12));
    }

    @Test
    void testToString() {
        assertEquals("[15, 25, 35]", array.toString());
    }
}