package search.binarysearch;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchRotatedSolution {

    public int binarySearch(int[] arr, int start, int end, int key) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[start] <= arr[mid] && key <= arr[mid] && key >= arr[start]) {
            return binarySearch(arr, start, mid - 1, key);
        }

        else if (arr[mid] <= arr[end] && key >= arr[mid] && key <= arr[end]) {
            return binarySearch(arr, mid + 1, end, key);
        }

        else if (arr[end] <= arr[mid]) {
            return binarySearch(arr, mid + 1, end, key);
        }

        else if (arr[start] >= arr[mid]) {
            return binarySearch(arr, start, mid - 1, key);
        }

        return -1;
    }

    public int search(int[] arr, int key) {
        return binarySearch(arr, 0, arr.length - 1, key);
    }

}

class SearchRotatedSolutionTest {

    private SearchRotatedSolution search = new SearchRotatedSolution();

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