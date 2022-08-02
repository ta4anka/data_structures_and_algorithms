package tk.ta4anka.linear_data_structures.hash_table;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharFinderTest {

    @Test
    void findFirstNonRepeatingChar() {
        CharFinder charFinder = new CharFinder();
        assertEquals('h',charFinder.findFirstNonRepeatingChar("Hello, world!"));

        assertEquals(Character.MIN_VALUE, charFinder.findFirstNonRepeatingChar("hhwwee"));
    }
}