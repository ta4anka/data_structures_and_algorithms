package tk.ta4anka.linear_data_structures.queue;

import java.util.*;

/**
 * Queue implementation using Two stacks
 */

public class QueueWithTwoStacks<E> {
    private Stack<E> stack1 = new Stack<E>();
    private Stack<E> stack2 = new Stack<E>();

    // O(1)
    public void enqueue(E item) {
        stack1.push(item);
    }

    // O(n)
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        moveStack1ToStack2();
        return stack2.pop();
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        moveStack1ToStack2();
        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public String toString() {
        String result = "[]";
        if (!stack1.isEmpty() && stack2.isEmpty()) {
            return stack1.toString();
        }
        if (stack1.isEmpty() && !stack2.isEmpty()) {
            return getReverseStackToString(stack2);
        }
        if (!isEmpty()) {
            StringBuilder sb = new StringBuilder();
            var stack2String = getReverseStackToString(stack2);
            var stack1String = stack1.toString();
            sb.append(stack2String, 0, stack2String.length() - 1)
                    .append(',')
                    .append(' ')
                    .append(stack1String.substring(1));
            return sb.toString();
        }
        return result;
    }

    private String getReverseStackToString(Stack<E> stack) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[').append(stack.peek());
        ListIterator<E> listIterator = stack.listIterator(stack.size() - 1);
        while (listIterator.hasPrevious()) {
            stringBuilder.append(',').append(' ').append(listIterator.previous());
        }
        return stringBuilder.append(']').toString();
    }
}
