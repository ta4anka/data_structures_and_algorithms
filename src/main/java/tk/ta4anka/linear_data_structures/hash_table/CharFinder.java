package tk.ta4anka.linear_data_structures.hash_table;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find its first non-repeating character
 */
public class CharFinder {

    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toLowerCase().toCharArray();
        for (char ch : chars) {
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for (char ch : chars) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
}
