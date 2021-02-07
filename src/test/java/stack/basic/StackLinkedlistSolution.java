package stack.basic;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Node<E> {
    public E data;
    public Node<E> next;

    public Node(E data) {
        this.data = data;
    }

    // todo : add getter and setter

}

public class StackLinkedlistSolution<E> {

    Node<E> first;

    Integer size = 0;

    void add(E element) {
        var node = new Node<E>(element);

        if (first == null) {
            first = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    E remove() {
        var node = first;
        if (first ==null) return null;
        if (first != null) {
            first = first.next;
            size--;
        }
        return node.data;
    }

    E peek() {
        if (first != null) {
            return first.data;
        }
        return null;
    }

    Boolean isEmpty() {
        return first == null;
    }

}


class StackLinkedlistSolutionTest {

    @Test
    @DisplayName("stack can add and remove items")
    void shouldRemoveAndAddItems() {
        StackLinkedlistSolution<Integer> stack = new StackLinkedlistSolution<>();
        stack.add(1);
        assertThat(stack.remove()).isEqualTo(1);
        stack.add(2);
        assertThat(stack.remove()).isEqualTo(2);

    }

    @Test
    @DisplayName("stack can follows first in, last out")
    void shouldFirstInLastOut() {
        StackLinkedlistSolution<Integer> stack = new StackLinkedlistSolution<>();
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
        StackLinkedlistSolution<Character> stack = new StackLinkedlistSolution<>();
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
        StackLinkedlistSolution<Character> stack = new StackLinkedlistSolution<>();
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    @DisplayName("stack is empty after removing all items")
    void shouldStackIsEmptyAfterRemovingAllElements() {
        StackLinkedlistSolution<Character> stack = new StackLinkedlistSolution<>();

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
        StackLinkedlistSolution<Character> stack = new StackLinkedlistSolution<>();
        stack.add('A');
        assertThat(stack.isEmpty()).isFalse();
        stack.add('B');
        assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    @DisplayName("Stack has correct size")
    void shouldStackHasCorrectSize() {
        StackLinkedlistSolution<Character> stack = new StackLinkedlistSolution<>();

        stack.add('A');
        assertThat(stack.size).isEqualTo(1);

        stack.add('B');
        assertThat(stack.size).isEqualTo(2);

        stack.add('C');
        assertThat(stack.size).isEqualTo(3);
    }

}
