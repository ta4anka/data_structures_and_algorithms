package tk.ta4anka.linear_data_structures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {
    @Test
    void isBalanced() {
        Expression expression = new Expression();
        String input1 = "(3 + 5)";
        String input2 = "(3 + 5 [}";
        String input3 = "){ 3 + 5 ( ";
        String input4 = "({ <3> + 5 }) ";
        String input5 = "({ 3 + 5 }( ";
        assertTrue(expression.isBalanced(input1));
        assertFalse(expression.isBalanced(input2));
        assertFalse(expression.isBalanced(input3));
        assertTrue(expression.isBalanced(input4));
        assertFalse(expression.isBalanced(input5));
    }

    @Test
    void isBalancedIfStringIsEmpty() {
        Expression expression = new Expression();
        String input = "";
        assertTrue(expression.isBalanced(input));
    }

    @Test
    void isBalancedIfStringIsNull() {
        Expression expression = new Expression();
        assertThrows(IllegalArgumentException.class, () -> expression.isBalanced(null));
    }
}