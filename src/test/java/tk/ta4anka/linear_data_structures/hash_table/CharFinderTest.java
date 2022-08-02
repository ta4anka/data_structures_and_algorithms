package tk.ta4anka.linear_data_structures.hash_table;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharFinderTest {
    CharFinder charFinder = new CharFinder();

    @Test
    void findFirstNonRepeatingChar() {
        assertEquals('h', charFinder.findFirstNonRepeatingChar("Hello, world!"));
        assertEquals(Character.MIN_VALUE, charFinder.findFirstNonRepeatingChar("hhwwee"));
    }

    @Test
    void findFirstRepeatedChar() {
        assertEquals('l', charFinder.findFirstRepeatedChar("Hello, world!"));
        assertEquals(Character.MIN_VALUE, charFinder.findFirstRepeatedChar("Hey"));
    }

}