package tk.ta4anka.linear_data_structures.hash_table;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class CharFinder {
    /**
     * Given a string, find its first non-repeating character
     */
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

    /**
     * Given a string, find its first repeating character
     */
    public char findFirstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();
        for (var ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
