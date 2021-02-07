package stack.basic;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StackSolution<E> {

    /**
     * list bases implementation
     *
     * its important to notice that we should add new
     *
     */

    Integer size = 0;

    private List list = new ArrayList();

    public void add(E element) {
        list.add(element);
        size++;
    }

    public E remove() {
        if (!list.isEmpty()) {
            size--;
            return (E) list.remove(list.size() - 1);
        }
        return null;
    }

    public E peek() {
        if (!list.isEmpty()) {
            return (E) list.get(list.size() - 1);
        }
        return null;
    }

    public Boolean isEmpty() {
        return list.isEmpty();
    }

}

class StackSolutionLinkedList<E> {

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

class StackSolutionTest {

    @Test
    @DisplayName("StackSolution can add and remove items")
    void shouldRemoveAndAddItems() {
        StackSolution<Integer> StackSolution = new StackSolution<>();
        StackSolution.add(1);
        assertThat(StackSolution.remove()).isEqualTo(1);
        StackSolution.add(2);
        assertThat(StackSolution.remove()).isEqualTo(2);

    }

    @Test
    @DisplayName("StackSolution can follows first in, last out")
    void shouldFirstInLastOut() {
        StackSolution<Integer> StackSolution = new StackSolution<>();
        StackSolution.add(1);
        StackSolution.add(2);
        StackSolution.add(3);
        assertThat(StackSolution.remove()).isEqualTo(3);
        assertThat(StackSolution.remove()).isEqualTo(2);
        assertThat(StackSolution.remove()).isEqualTo(1);
    }

    @Test
    @DisplayName("peek returns the first element but does not remove it")
    void shouldPeekReturnsFirstElement() {
        StackSolution<Character> StackSolution = new StackSolution<>();
        StackSolution.add('A');
        StackSolution.add('B');
        StackSolution.add('C');

        assertThat(StackSolution.peek()).isEqualTo('C');
        assertThat(StackSolution.remove()).isEqualTo('C');

        assertThat(StackSolution.peek()).isEqualTo('B');
        assertThat(StackSolution.remove()).isEqualTo('B');

        assertThat(StackSolution.peek()).isEqualTo('A');
        assertThat(StackSolution.remove()).isEqualTo('A');

        assertThat(StackSolution.peek()).isEqualTo(null);
        assertThat(StackSolution.remove()).isEqualTo(null);
    }

    @Test
    @DisplayName("newly created StackSolution is empty")
    void shouldNewlyCreatedStackSolutionIsEmpty() {
        StackSolution<Character> StackSolution = new StackSolution<>();
        assertThat(StackSolution.isEmpty()).isTrue();
    }

    @Test
    @DisplayName("StackSolution is empty after removing all items")
    void shouldStackSolutionIsEmptyAfterRemovingAllElements() {
        StackSolution<Character> StackSolution = new StackSolution<>();

        StackSolution.add('A');
        StackSolution.add('B');
        StackSolution.add('C');

        StackSolution.remove();
        StackSolution.remove();
        StackSolution.remove();

        assertThat(StackSolution.isEmpty()).isTrue();

    }

    @Test
    @DisplayName("StackSolution with items is not empty")
    void shouldNotEmptyWithItems() {
        StackSolution<Character> StackSolution = new StackSolution<>();
        StackSolution.add('A');
        assertThat(StackSolution.isEmpty()).isFalse();
        StackSolution.add('B');
        assertThat(StackSolution.isEmpty()).isFalse();
    }

    @Test
    @DisplayName("StackSolution has correct size")
    void shouldStackSolutionHasCorrectSize() {
        StackSolution<Character> StackSolution = new StackSolution<>();

        StackSolution.add('A');
        assertThat(StackSolution.size).isEqualTo(1);

        StackSolution.add('B');
        assertThat(StackSolution.size).isEqualTo(2);

        StackSolution.add('C');
        assertThat(StackSolution.size).isEqualTo(3);
    }

}
