package search.binarysearch;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchRotated {

    public int binarySearch(int[] arr, int start, int end, int key) {
        return 0;
    }

    public int search(int[] arr, int key) {
        return binarySearch(arr, 0, arr.length - 1, key);
    }

}

class SearchRotatedTest {

    private SearchRotated search = new SearchRotated();

    @Test
    @DisplayName("should find key=3")
    void shouldFindGivenKey3() {
        int[] v1 = { 6, 7, 1, 2, 3, 4, 5 };

        assertThat(search.search(v1, 3));
    }

    @Test
    @DisplayName("should find key=6")
    void shouldFindGivenKey6() {
        int[] v1 = { 4, 5, 6, 1, 2, 3 };

        assertThat(search.search(v1, 6));
    }

}