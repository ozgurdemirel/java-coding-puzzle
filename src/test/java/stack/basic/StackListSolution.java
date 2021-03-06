package stack.basic;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StackListSolution<E> {

    /**
     * list bases implementation
     *
     * its important to notice that we should add new element to the end of the list because adding to the
     * 
     * begining is expensive 
     * 
     * Option 1 : 
     * add to the end, remove from the begining
     *  insert at the end O1
     *  insert at the end O1
     * Option 2 : 
     *  add to the begining remove from the end 
     *  ~ bad idea to add elements at the begining : 
     * insert at the begining On
     * remove at the begining On - we have to reindex all the other elements in the list
     * 
     *
     */

    Integer size = 0;

    private List<E> list = new ArrayList<E>();

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

class StackSolutionTest {

    @Test
    @DisplayName("StackSolution can add and remove items")
    void shouldRemoveAndAddItems() {
        StackListSolution<Integer> StackSolution = new StackListSolution<>();
        StackSolution.add(1);
        assertThat(StackSolution.remove()).isEqualTo(1);
        StackSolution.add(2);
        assertThat(StackSolution.remove()).isEqualTo(2);

    }

    @Test
    @DisplayName("StackSolution can follows first in, last out")
    void shouldFirstInLastOut() {
        StackListSolution<Integer> StackSolution = new StackListSolution<>();
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
        StackListSolution<Character> StackSolution = new StackListSolution<>();
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
        StackListSolution<Character> StackSolution = new StackListSolution<>();
        assertThat(StackSolution.isEmpty()).isTrue();
    }

    @Test
    @DisplayName("StackSolution is empty after removing all items")
    void shouldStackSolutionIsEmptyAfterRemovingAllElements() {
        StackListSolution<Character> StackSolution = new StackListSolution<>();

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
        StackListSolution<Character> StackSolution = new StackListSolution<>();
        StackSolution.add('A');
        assertThat(StackSolution.isEmpty()).isFalse();
        StackSolution.add('B');
        assertThat(StackSolution.isEmpty()).isFalse();
    }

    @Test
    @DisplayName("StackSolution has correct size")
    void shouldStackSolutionHasCorrectSize() {
        StackListSolution<Character> StackSolution = new StackListSolution<>();

        StackSolution.add('A');
        assertThat(StackSolution.size).isEqualTo(1);

        StackSolution.add('B');
        assertThat(StackSolution.size).isEqualTo(2);

        StackSolution.add('C');
        assertThat(StackSolution.size).isEqualTo(3);
    }

}
