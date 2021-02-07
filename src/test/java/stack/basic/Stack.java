package stack.basic;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Stack<E> {

    Integer size = 0;

    public void add(E element) {
    }

    public E remove() {
        return null;
    }

    public E peek() {
        return null;
    }

    public Boolean isEmpty() {
        return null;
    }

}

class StackTest {

    @Test
    @DisplayName("stack can add and remove items")
    void shouldRemoveAndAddItems() {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        assertThat(stack.remove()).isEqualTo(1);
        stack.add(2);
        assertThat(stack.remove()).isEqualTo(2);

    }

    @Test
    @DisplayName("stack can follows first in, last out")
    void shouldFirstInLastOut() {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        assertThat(stack.remove()).isEqualTo(3);
        assertThat(stack.remove()).isEqualTo(2);
        assertThat(stack.remove()).isEqualTo(1);
    }

    @Test
    @DisplayName("peek returns the first element but does not remove it")
    void shouldPeekReturnsFirstElement() {
        Stack<Character> stack = new Stack<>();
        stack.add('A');
        stack.add('B');
        stack.add('C');

        assertThat(stack.peek()).isEqualTo('C');
        assertThat(stack.remove()).isEqualTo('C');

        assertThat(stack.peek()).isEqualTo('B');
        assertThat(stack.remove()).isEqualTo('B');

        assertThat(stack.peek()).isEqualTo('A');
        assertThat(stack.remove()).isEqualTo('A');

        assertThat(stack.peek()).isEqualTo(null);
        assertThat(stack.remove()).isEqualTo(null);
    }

    @Test
    @DisplayName("newly created stack is empty")
    void shouldNewlyCreatedStackIsEmpty() {
        Stack<Character> stack = new Stack<>();
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    @DisplayName("stack is empty after removing all items")
    void shouldStackIsEmptyAfterRemovingAllElements() {
        Stack<Character> stack = new Stack<>();

        stack.add('A');
        stack.add('B');
        stack.add('C');

        stack.remove();
        stack.remove();
        stack.remove();

        assertThat(stack.isEmpty()).isTrue();

    }

    @Test
    @DisplayName("stack with items is not empty")
    void shouldNotEmptyWithItems() {
        Stack<Character> stack = new Stack<>();
        stack.add('A');
        assertThat(stack.isEmpty()).isFalse();
        stack.add('B');
        assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    @DisplayName("Stack has correct size")
    void shouldStackHasCorrectSize() {
        Stack<Character> stack = new Stack<>();

        stack.add('A');
        assertThat(stack.size).isEqualTo(1);

        stack.add('B');
        assertThat(stack.size).isEqualTo(2);

        stack.add('C');
        assertThat(stack.size).isEqualTo(3);
    }

}
