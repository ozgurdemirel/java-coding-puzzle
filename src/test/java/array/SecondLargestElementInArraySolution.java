package array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SecondLargestElementInArraySolution {
    public int maxElement(int[] nums) {

        int i, first, second;

        if (nums.length < 2) {
            System.out.println("Invalid Input ");
        }

        first = Integer.MIN_VALUE;
        second = Integer.MIN_VALUE;

        for (i = 0; i < nums.length; i++) {
            /**
             * If current element is smaller than first then update both first and second
             */
            if (nums[i] > first) {
                second = first;
                first = nums[i];
            } else if (nums[i] > second && nums[i] != first) {
                second = nums[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest elemnent");
        } else {
            System.out.println("The second largest element " + second);
        }

        return second;
    }

}

class SecondLargestElementInArraySolutionTest {

    private SecondLargestElementInArraySolution max = new SecondLargestElementInArraySolution();

    @Test
    @DisplayName("should return 6 maximim in a given array")
    void findMaxTwoValue() {
        assertThat(max.maxElement(new int[] { 3, 4, 8, 6 })).isEqualTo(6);
    }

}