package array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * find the second largest element on array ...
 * https://www.geeksforgeeks.org/find-second-largest-element-array/
 */

public class SecondLargestElementInArray {

    public int maxElement(int[] nums) {
        return 0;
    }

}

class SecondLargestElementInArrayTest {

    private SecondLargestElementInArray max = new SecondLargestElementInArray();

    @Test
    @DisplayName("should return maximim in a given array")
    void findMaxTwoValue() {
        assertThat(
            max.maxElement(new int[]{3,4,8,6})
        ).isEqualTo(8);
    }


}