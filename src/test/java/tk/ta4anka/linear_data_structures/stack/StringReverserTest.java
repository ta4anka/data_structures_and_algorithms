package tk.ta4anka.linear_data_structures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringReverserTest {

    @Test
    void reverse() {
        StringReverser stringReverser = new StringReverser();
        assertEquals("edcba", stringReverser.reverse("abcde"));
        assertEquals("", stringReverser.reverse(""));
    }

    @Test
    void reverseIfStringIsEmpty() {
        StringReverser stringReverser = new StringReverser();
        assertEquals("", stringReverser.reverse(""));
    }

    @Test
    void reverseIfStringIsNull() {
        StringReverser stringReverser = new StringReverser();
        assertThrows(IllegalArgumentException.class, () -> stringReverser.reverse(null));
    }
}